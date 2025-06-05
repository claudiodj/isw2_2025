package com.example;

import java.util.Date;

public class compra {

    cliente clienteCompra; 
    sucursal sucursalVenta;
    Date fechaCompra;
    float importeCompra;
    float importeDescuento;
    
    public compra(cliente clienteCompra, sucursal sucursalVenta, Date fechaCompra, float importeCompra,
            float importeDescuento) {
        this.clienteCompra = clienteCompra;
        this.sucursalVenta = sucursalVenta;
        this.fechaCompra = fechaCompra;
        this.importeCompra = importeCompra;
        this.importeDescuento = importeDescuento;
    }

    public cliente getClienteCompra() {
        return clienteCompra;
    }
    public void setClienteCompra(cliente clienteCompra) {
        this.clienteCompra = clienteCompra;
    }
    public sucursal getSucursalVenta() {
        return sucursalVenta;
    }
    public void setSucursalVenta(sucursal sucursalVenta) {
        this.sucursalVenta = sucursalVenta;
    }
    public Date getFechaCompra() {
        return fechaCompra;
    }
    public void setFechaCompra(Date fechaCompra) {
        this.fechaCompra = fechaCompra;
    }
    public float getImporteCompra() {
        return importeCompra;
    }
    public void setImporteCompra(float importeCompra) {
        this.importeCompra = importeCompra;
    }
    public float getImporteDescuento() {
        return importeDescuento;
    }
    public void setImporteDescuento(float importeDescuento) {
        this.importeDescuento = importeDescuento;
    }

    @Override
    public String toString() {
        return "compra [clienteCompra=" + clienteCompra + ", sucursalVenta=" + sucursalVenta + ", fechaCompra="
                + fechaCompra + ", importeCompra=" + importeCompra + ", importeDescuento=" + importeDescuento + "]";
    }
    
    

}
