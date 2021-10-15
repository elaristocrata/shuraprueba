package com.prueba.shura.application.crontrollers;

import com.prueba.shura.application.responses.ProductosResponse;
import com.prueba.shura.modules.producto.domain.Producto;
import com.prueba.shura.modules.producto.infra.OracleProductoAdapt;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Timestamp;

@RestController
@RequestMapping("/api")
public class GetProductos {
    OracleProductoAdapt productoAdapt;

    public GetProductos(OracleProductoAdapt productoAdapt) {
        this.productoAdapt = productoAdapt;
    }

    @GetMapping("/productos")
    public ProductosResponse<Producto> listar() {
        return new ProductosResponse<>(HttpStatus.OK.value(), productoAdapt.listarTodosLosProductos()
                , new Timestamp(System.currentTimeMillis()));
    }
}
