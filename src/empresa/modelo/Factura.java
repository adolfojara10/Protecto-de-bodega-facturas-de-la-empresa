/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresa.modelo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Adolfo
 */
public class Factura {

    private int numeroFactura;
    private Date fechaEmision;
    private String idCliente;
    private List<DetalleFactura> detallesFactura;
    private double subtotal;
    private double descuento;
    private double iva;
    private double total;

    public Factura(int numeroFactura, Date fechaEmision, String idCliente, double subtotal, double descuento, double iva, double total) {
        this.numeroFactura = numeroFactura;
        this.fechaEmision = fechaEmision;
        this.idCliente = idCliente;
        this.subtotal = subtotal;
        this.descuento = descuento;
        this.iva = iva;
        this.total = total;

        detallesFactura = new ArrayList<>();
    }

    public int getNumeroFactura() {
        return numeroFactura;
    }

    public void setNumeroFactura(int numeroFactura) {
        this.numeroFactura = numeroFactura;
    }

    public Date getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(Date fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public List<DetalleFactura> getDetallesFactura() {
        return detallesFactura;
    }

    public void setDetallesFactura(List<DetalleFactura> detallesFactura) {
        this.detallesFactura = detallesFactura;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public void añadirDetalleFactura(DetalleFactura detalle) {
        detallesFactura.add(detalle);
    }

    public void updateDetalleFactura(DetalleFactura detalle) {
        if (detallesFactura.contains(detalle)) {
            int posicionDetalle = detallesFactura.indexOf(detalle);
            detallesFactura.remove(posicionDetalle);
        }
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + this.numeroFactura;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Factura other = (Factura) obj;
        if (this.numeroFactura != other.numeroFactura) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Factura{" + "numeroFactura=" + numeroFactura + ", fechaEmision=" 
                + fechaEmision + ", idCliente=" + idCliente + ", detallesFactura=" 
                + detallesFactura.toString() + ", subtotal=" + subtotal + ", descuento=" 
                + descuento + ", iva=" + iva + ", total=" + total + '}';
    }

    
}
