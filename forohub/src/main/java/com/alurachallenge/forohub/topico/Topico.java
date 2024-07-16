package com.alurachallenge.forohub.topico;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "topico")
@Entity(name="Topico")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Topico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String mensaje;
    private String fechaCreacion;
    private String autor;
    @Enumerated(EnumType.STRING)
    private Cursos curso;


    //Constructor que mapea del record a la clase Topico
    public Topico(DatosRegistroTopico datosRegistroTopico) {
       // this.id = datosRegistroTopico.id(); En el curso no lo colocan y tiene sentido pq quien use la api no tiene que tener el poder de colocar una id directamente  para que el record reciba
        this.titulo = datosRegistroTopico.titulo();
        this.mensaje = datosRegistroTopico.mensaje();
        this.fechaCreacion = datosRegistroTopico.fechaCreacion();
        this.autor = datosRegistroTopico.autor();
        this.curso = datosRegistroTopico.nombreCurso();
    }

    public void actualizarDatos(DatosActualizarTopico datosActualizarTopico) {

        if (datosActualizarTopico.titulo() != null){
            this.titulo = datosActualizarTopico.titulo();
        }
       if (datosActualizarTopico.mensaje()!= null){
           this.mensaje = datosActualizarTopico.mensaje();
       }
        if (datosActualizarTopico.fechaCreacion()!= null){
            this.fechaCreacion = datosActualizarTopico.fechaCreacion();
        }
        if (datosActualizarTopico.autor() != null){
            this.autor = datosActualizarTopico.autor();
        }
        if (datosActualizarTopico.curso() != null){
            this.curso = datosActualizarTopico.curso();
        }



    }

    public Long getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getMensaje() {
        return mensaje;
    }

    public String getFechaCreacion() {
        return fechaCreacion;
    }

    public String getAutor() {
        return autor;
    }

    public Cursos getCurso() {
        return curso;
    }


}
