create table topico (

    id bigint not null auto_increment,
    titulo varchar(100) not null,
    mensaje varchar(100),
    fecha_creacion varchar(100),
    autor varchar (100),
    curso varchar (100),

    primary key(id)
    );
