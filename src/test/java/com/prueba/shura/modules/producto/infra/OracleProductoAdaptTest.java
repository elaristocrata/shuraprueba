package com.prueba.shura.modules.producto.infra;

import com.prueba.shura.application.ShuraApplication;
import com.prueba.shura.modules.producto.application.CrearProducto;
import com.prueba.shura.modules.producto.domain.Producto;
import com.prueba.shura.modules.producto.infra.repository.OracleProductoRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.sql.Timestamp;
import java.util.Date;

@SpringBootTest(classes = {ShuraApplication.class})
class OracleProductoAdaptTest {
    @Autowired
    OracleProductoRepository repository;

    ModelMapper modelMapper = new ModelMapper();

    private OracleProductoAdapt productoAdapt;

    @BeforeEach
    protected void stUp() {
        productoAdapt = new OracleProductoAdapt(repository, modelMapper);
    }

    @Test
    void debe_listar_productos() {
        System.out.println(productoAdapt.listarTodosLosProductos());
    }
    @Test
    void debe_guardar_un_producto(){
        Producto producto = Producto.crear("pueba",3.97,2,
                new Timestamp(System.currentTimeMillis()));
        productoAdapt.guardarProducto(producto);
    }
}
