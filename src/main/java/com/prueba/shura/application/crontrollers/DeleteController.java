package com.prueba.shura.application.crontrollers;

import com.prueba.shura.application.responses.ProductosResponse;
import com.prueba.shura.modules.producto.domain.Producto;
import com.prueba.shura.modules.producto.infra.OracleProductoAdapt;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.sql.Timestamp;

@RestController
@RequestMapping("/api")
public class DeleteController {
    OracleProductoAdapt oracleProductoAdapt;

    public DeleteController(OracleProductoAdapt oracleProductoAdapt) {
        this.oracleProductoAdapt = oracleProductoAdapt;
    }
@DeleteMapping("/producto")
    public ProductosResponse<Producto> eliminar(@RequestParam(value = "id") Long id){
        oracleProductoAdapt.borrarProducto(id);
        return new ProductosResponse<>(HttpStatus.OK.value(), new Timestamp(System.currentTimeMillis()));
    }
}
