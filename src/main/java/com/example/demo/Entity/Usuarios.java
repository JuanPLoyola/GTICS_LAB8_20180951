package com.example.demo.Entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "Usuarios")
public class Usuarios {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idUsuarios" , nullable = false)
    private Integer idUsuario;

    @Column(name = "Nombre",nullable = false,length = 45)
    private String nombre;

    @Column(name = "Apellido",nullable = false,length = 45)
    private String apellido;
}
