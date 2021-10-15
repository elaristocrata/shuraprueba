package com.prueba.shura.application.crontrollers;

import com.prueba.shura.application.responses.ProductosResponse;
import com.prueba.shura.modules.producto.application.CrearProducto;
import com.prueba.shura.modules.producto.application.PeticionProducto;
import com.prueba.shura.modules.producto.domain.Producto;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.sql.Timestamp;
import java.util.Date;

@RestController
@RequestMapping("/api")
public class PostController {
    CrearProducto crearProducto;

    public PostController(CrearProducto crearProducto) {
        this.crearProducto = crearProducto;
    }

    @PostMapping("/producto")
    public ProductosResponse<Producto> crear(@RequestBody Request request) {
        crearProducto.crarProducto(new PeticionProducto(request.getNombre(), request.getPrecio(), request.getCantAlmacen(),
                request.getFechaCaducidad()));
        return new ProductosResponse<>(HttpStatus.CREATED.value(), new Timestamp(System.currentTimeMillis()));
    }


}
final class Request {
    private String nombre;
    private Double precio;
    private Integer cantAlmacen;
    private Date fechaCaducidad;


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
}