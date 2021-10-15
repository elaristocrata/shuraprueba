package com.prueba.shura.application.responses;

import com.prueba.shura.modules.producto.domain.Producto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

public class ProductosResponse<Producto> implements Serializable {

    private int status;
    private ArrayList<Producto> data;
    private final Date timestamp;

    public ProductosResponse(int status, ArrayList<Producto> data, Date timestamp) {
        this.status = status;
        this.data = data;
        this.timestamp = timestamp;
    }

    public ProductosResponse(int status, Date timestamp) {
        this.status = status;
        this.timestamp = timestamp;
    }

    public int getStatus() {
        return status;
    }

    public ArrayList<Producto> getData() {
        return data;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public void setData(ArrayList<Producto> data) {
        this.data = data;
    }
}
