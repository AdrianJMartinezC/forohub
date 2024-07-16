package com.alurachallenge.forohub.topico;


import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DatosRegistroTopico(
                                  //Long id, el usuario no tendria pq poder colocar un id
                                  @NotBlank String titulo,
                                  @NotNull String mensaje,
                                  @NotNull String fechaCreacion,
                                  @NotNull String autor,
                                  @NotNull Cursos nombreCurso) {
}




