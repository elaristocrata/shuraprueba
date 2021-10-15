package com.prueba.shura.modules.producto.infra;

import com.prueba.shura.modules.producto.domain.Producto;
import com.prueba.shura.modules.producto.domain.ProductoRepository;
import com.prueba.shura.modules.producto.infra.entity.ProductosEntity;
import com.prueba.shura.modules.producto.infra.repository.OracleProductoRepository;
import org.modelmapper.ModelMapper;

import java.util.ArrayList;
import java.util.Optional;
import java.util.stream.Collectors;

public class OracleProductoAdapt implements ProductoRepository {

    private final OracleProductoRepository repository;
    private final ModelMapper mapper;

    public OracleProductoAdapt(OracleProductoRepository repository, ModelMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public ArrayList<Producto> listarTodosLosProductos() {
        ArrayList<Producto> productoArrayList = repository.findAll().stream()
                .map(productosEntity -> mapper.map(productosEntity, Producto.class))
                .collect(Collectors.toCollection(ArrayList::new));
        return productoArrayList;
    }

    @Override
    public void guardarProducto(Producto producto) {

        repository.save(mapper.map(producto, ProductosEntity.class));
    }

    @Override
    public void borrarProducto(Long id) {
      ProductosEntity productosEntity =  repository.getById(id);
        repository.deleteById(productosEntity.getProductoId());
    }

    @Override
    public Producto actualizarProducto(Producto producto) {
        repository.save(mapper.map(producto,ProductosEntity.class));
        return null;
    }


}
