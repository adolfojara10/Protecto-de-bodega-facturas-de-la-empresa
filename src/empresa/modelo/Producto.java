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
public class Producto {
    
    private int codigoSistema;
    private String codigo;
    private int Stock;
    private String descripcion;
    private String categoria;
    private double precio;

    public Producto(String codigo, int Stock, String descripcion, String categoria, double precio) {
        this.codigo = codigo;
        this.Stock = Stock;
        this.descripcion = descripcion;
        this.categoria = categoria;
        this.precio = precio;
    }

    public Producto(int codigoSistema, String codigo, int Stock, String descripcion, String categoria, double precio) {
        this.codigoSistema = codigoSistema;
        this.codigo = codigo;
        this.Stock = Stock;
        this.descripcion = descripcion;
        this.categoria = categoria;
        this.precio = precio;
    }
     
    
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getStock() {
        return Stock;
    }

    public void setStock(int Stock) {
        this.Stock = Stock;
    }

    public String getNombre() {
        return descripcion;
    }

    public void setNombre(String nombre) {
        this.descripcion = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCodigoSistema() {
        return codigoSistema;
    }

    public void setCodigoSistema(int codigoSistema) {
        this.codigoSistema = codigoSistema;
    }

    
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.codigo);
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
        final Producto other = (Producto) obj;
        if (!Objects.equals(this.codigo, other.codigo)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "PisoFlotante:\n" + "codigo: " + codigo + "\tnombre: " + descripcion + "\tcantidad: " + Stock;
    }
    
    
}
