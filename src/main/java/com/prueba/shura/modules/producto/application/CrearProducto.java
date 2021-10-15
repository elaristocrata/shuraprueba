package com.prueba.shura.modules.producto.application;

import com.prueba.shura.modules.producto.domain.Producto;
import com.prueba.shura.modules.producto.domain.ProductoRepository;

public class CrearProducto {
private final ProductoRepository repository;

    public CrearProducto(ProductoRepository repository) {
        this.repository = repository;
    }

public void crarProducto(PeticionProducto peticion){
        Producto producto = Producto.crear(peticion.getNombre(), (double) Math.round(peticion.getPrecio()),
                peticion.getCantAlmacen(), peticion.getFechaCaducidad());
        repository.guardarProducto(producto);
}
}
