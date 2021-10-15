package com.prueba.shura.modules.producto.domain;

import java.util.Date;
import java.util.Objects;

public class Producto {
    private String nombre;
    private Double precio;
    private Integer cantAlmacen;
    private Date fechaCaducidad;

    public Producto(String nombre, Double precio, Integer cantAlmacen, Date fechaCaducidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantAlmacen = cantAlmacen;
        this.fechaCaducidad = fechaCaducidad;
    }

    public static Producto crear(String nombre, Double precio, Integer cantAlmacen, Date fechaCaducidad) {
        return new Producto(nombre, precio, cantAlmacen, fechaCaducidad);
    }

    public Producto() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Integer getCantAlmacen() {
        return cantAlmacen;
    }

    public void setCantAlmacen(Integer cantAlmacen) {
        this.cantAlmacen = cantAlmacen;
    }

    public Date getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(Date fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Producto producto = (Producto) o;
        return Objects.equals(nombre, producto.nombre) && Objects.equals(precio, producto.precio) && Objects.equals(cantAlmacen, producto.cantAlmacen) && Objects.equals(fechaCaducidad, producto.fechaCaducidad);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, precio, cantAlmacen, fechaCaducidad);
    }

    @Override
    public String toString() {
        return "Producto{" +
                "nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", cantAlmacen=" + cantAlmacen +
                ", fechaCaducidad=" + fechaCaducidad +
                '}';
    }
}
