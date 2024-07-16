package com.alurachallenge.forohub.topico;

public record DatosListaTopico(
        Long id,
        String titulo,
        String mensaje,
        String fechaCreacion,
        String autor,
        Cursos curso

) {
    public DatosListaTopico(Topico topico){

        this(
                topico.getId(),
                topico.getTitulo(),
                topico.getMensaje(),
                topico.getFechaCreacion().toString(),
                topico.getAutor(),
                topico.getCurso()
        );

    }
}
