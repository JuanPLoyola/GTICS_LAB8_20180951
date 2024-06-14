package com.example.demo.Entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "Peliculas")
public class Peliculas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idPeliculas" , nullable = false)
    private Integer idPelicula;

    @Column(name = "Nombre",nullable = false,length = 45)
    private String nombre;

    @Column(name = "Cines",nullable = false,length = 45)
    private Integer cine;

    @Column(name = "Overview",nullable = false,length = 45)
    private String overview;

    @Column(name = "Popularidad",nullable = false,length = 45)
    private String popularidad;

    @Column(name = "FechaLanzamiento",nullable = false)
    private Date fechaLanzamiento;

    @ManyToOne
    @JoinColumn(name = "Usuarios_idUsuarios",nullable = false)
    private Usuarios usuarios;

}
