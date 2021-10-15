package com.prueba.shura.application;

import com.prueba.shura.modules.producto.application.CrearProducto;
import com.prueba.shura.modules.producto.domain.ProductoRepository;
import com.prueba.shura.modules.producto.infra.OracleProductoAdapt;
import com.prueba.shura.modules.producto.infra.repository.OracleProductoRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
@ComponentScan("com.prueba.shura.modules")
public class SpringConfiguration {
    @Autowired
    OracleProductoRepository oracleProductoRepository;

    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }

    @Bean
    public OracleProductoAdapt oracleProductoAdapt() {
        return new OracleProductoAdapt(oracleProductoRepository, modelMapper());
    }

    @Bean
    public ProductoRepository productoRepository() {
        return new OracleProductoAdapt(oracleProductoRepository, modelMapper());
    }

    @Bean
    public CrearProducto crearProducto() {
        return new CrearProducto(productoRepository());
    }

}
