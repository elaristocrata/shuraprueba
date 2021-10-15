package com.prueba.shura.modules.producto.infra.repository;

import com.prueba.shura.modules.producto.infra.entity.ProductosEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OracleProductoRepository extends JpaRepository<ProductosEntity,Long> {

}
