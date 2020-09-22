/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresa.modelo;

import java.util.Objects;

/**
 *
 * @author Adolfo
 */
public class DetalleFactura {
    
    private int idFactura;
    private int lineaFactura;
    private String idProducto;
    private String DescripcionProducto;
    private int cantidad;
    private double precioUnitario;
    private double precioVenta;

    public DetalleFactura(int idFactura, int lineaFactura, String idProducto, String DescripcionProducto, int cantidad, double precioUnitario, double precioVenta) {
        this.idFactura = idFactura;
        this.lineaFactura = lineaFactura;
        this.idProducto = idProducto;
        this.DescripcionProducto = DescripcionProducto;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
        this.precioVenta = precioVenta;
    }

    public int getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(int idFactura) {
        this.idFactura = idFactura;
    }

    public int getLineaFactura() {
        return lineaFactura;
    }

    public void setLineaFactura(int lineaFactura) {
        this.lineaFactura = lineaFactura;
    }

    public String getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(String idProducto) {
        this.idProducto = idProducto;
    }

    public String getDescripcionProducto() {
        return DescripcionProducto;
    }

    public void setDescripcionProducto(String DescripcionProducto) {
        this.DescripcionProducto = DescripcionProducto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 41 * hash + Objects.hashCode(this.idProducto);
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
        final DetalleFactura other = (DetalleFactura) obj;
        if (!Objects.equals(this.idProducto, other.idProducto)) {
            return false;
        }
        return true;
    }

    
    @Override
    public String toString() {
        return "DetalleFactura{" + "idFactura=" + idFactura + ", lineaFactura=" + lineaFactura + ", idProducto=" + idProducto + ", DescripcionProducto=" + DescripcionProducto + ", cantidad=" + cantidad + ", precioUnitario=" + precioUnitario + ", precioVenta=" + precioVenta + '}';
    }
    
    
    
}
