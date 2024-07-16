package com.alurachallenge.forohub.controller;

import com.alurachallenge.forohub.topico.*;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/topico")
public class TopicoController {

    @Autowired  // Para pruebas unitarias no se recomieda, mejor opcion es inyectar la dependencia en el constructor del service
    private TopicoRepository topicoRepository;

    @PostMapping
    public  void registrarTopico(@RequestBody @Valid DatosRegistroTopico datosRegistroTopico){
        topicoRepository.save(new Topico(datosRegistroTopico));
    }

    @GetMapping
    public Page<DatosListaTopico> listarTopicos(@PageableDefault(size = 10, sort = "fechaCreacion", direction = Sort.Direction.ASC) Pageable paginacion){
        return topicoRepository.findAll(paginacion).map(DatosListaTopico::new);
    }
    @GetMapping("/{id}")
    public Optional<Topico> obtenerPorId(@PathVariable Long id) {
        return topicoRepository.findById(id);
    }

//    @PutMapping("/{id}")
//    public Optional<Topico> actualizarPorId(@PathVariable Long id) {
//        return topicoRepository.getReferenceById(id);
//    }

    @PutMapping()
    @Transactional
    public void actualizarPorId(@RequestBody @Valid  DatosActualizarTopico datosActualizarTopico){
        Topico topico = topicoRepository.getReferenceById(datosActualizarTopico.id());
        topico.actualizarDatos(datosActualizarTopico);
    }

    // Delete a nivel de base de datos
    @DeleteMapping("/{id}")
    @Transactional
    public void eliminarTopico(@PathVariable Long id){
        Optional <Topico> topico = topicoRepository.findById(id);
        if (topico.isPresent()){
            topicoRepository.deleteById(id);
        }

    }
}
