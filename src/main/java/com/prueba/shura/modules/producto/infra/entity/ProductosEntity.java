package com.prueba.shura.modules.producto.infra.entity;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "PRODUCTOS", schema = "C##TEST1", catalog = "")
public class ProductosEntity {
    private Long productoId;
    private String nombre;
    private Float precio;
    private Integer cantAlmacen;
    private Date fechaCaducidad;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PRODUCTO_ID")
    public Long getProductoId() {
        return productoId;
    }

    public void setProductoId(Long productoId) {
        this.productoId = productoId;
    }

    @Basic
    @Column(name = "NOMBRE")
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Basic
    @Column(name = "PRECIO")
    public Float getPrecio() {
        return precio;
    }

    public void setPrecio(Float precio) {
        this.precio = precio;
    }

    @Basic
    @Column(name = "CANTIDAD_ALMACEN")
    public Integer getCantAlmacen() {
        return cantAlmacen;
    }

    public void setCantAlmacen(Integer cantidadAlmacen) {
        this.cantAlmacen = cantidadAlmacen;
    }

    @Basic
    @Column(name = "FECHA_CADUCIDAD")
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
        ProductosEntity that = (ProductosEntity) o;
        return Objects.equals(productoId, that.productoId) && Objects.equals(nombre, that.nombre) && Objects.equals(precio, that.precio) && Objects.equals(cantAlmacen, that.cantAlmacen) && Objects.equals(fechaCaducidad, that.fechaCaducidad);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productoId, nombre, precio, cantAlmacen, fechaCaducidad);
    }

    @Override
    public String toString() {
        return "ProductosEntity{" +
                "productoId=" + productoId +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", cantAlmacen=" + cantAlmacen +
                ", fechaCaducidad=" + fechaCaducidad +
                '}';
    }
}
