package com.prueba.shura.modules.producto.domain;

import java.util.ArrayList;
import java.util.Optional;

public interface ProductoRepository {
ArrayList<Producto> listarTodosLosProductos();
void guardarProducto(Producto producto);
void borrarProducto(Long id);
Producto actualizarProducto(Producto producto);
}
