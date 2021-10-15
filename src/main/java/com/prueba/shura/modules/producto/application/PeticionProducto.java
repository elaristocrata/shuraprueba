package com.prueba.shura.modules.producto.application;

import java.util.Date;

public class PeticionProducto {
    private Long id;
    private String nombre;
    private Double precio;
    private Integer cantAlmacen;
    private Date fechaCaducidad;

    public PeticionProducto(Long id, String nombre, Double precio, Integer cantAlmacen, Date fechaCaducidad) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.cantAlmacen = cantAlmacen;
        this.fechaCaducidad = fechaCaducidad;
    }

    public PeticionProducto(String nombre, Double precio, Integer cantAlmacen, Date fechaCaducidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantAlmacen = cantAlmacen;
        this.fechaCaducidad = fechaCaducidad;
    }

    public Long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public Integer getCantAlmacen() {
        return cantAlmacen;
    }

    public Date getFechaCaducidad() {
        return fechaCaducidad;
    }
}
