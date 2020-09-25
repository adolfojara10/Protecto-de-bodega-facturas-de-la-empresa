/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresa.controlador;

import empresa.dao.ClienteDaoImpl;
import empresa.dao.ProductoDaoImpl;
import empresa.modelo.Cliente;
import empresa.modelo.Producto;
import java.sql.ResultSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Adolfo
 */
public class ControladorCliente {

    private Cliente cliente;
    private Producto producto;

    private ClienteDaoImpl clienteDao;
    private ProductoDaoImpl productoDao;

    public ControladorCliente(ClienteDaoImpl clienteDao, ProductoDaoImpl productoDao) {

        this.clienteDao = clienteDao;
        this.productoDao = productoDao;
    }

    public void createCliente(String nombres, String apellidos, String cedula, String telefono,
            String direccion, String correo) {

        cliente = new Cliente(nombres, apellidos, cedula, telefono, direccion, correo);

        clienteDao.create(cliente);

    }

    public Cliente readCliente(String cedula) {

        cliente = clienteDao.read(cedula);
        return cliente;
    }

    public void updateCliente(String nombres, String apellidos, String cedula, String telefono,
            String direccion, String correo) {

        cliente = new Cliente(cliente.getCodigoSistema(), nombres, apellidos, cedula, telefono, direccion, correo);

        clienteDao.update(cliente);

    }

    public void deleteCliente(String cedula) {
        
        clienteDao.delete(cliente.getCodigoSistema());
    }

    public ResultSet findAll() {
        return clienteDao.findAll();
    }

    /**
     *
     * para los productos
     */
    
    
    /**
     * 
     * @param codigo
     * @param stock
     * @param descripcion
     * @param categoria
     * @param precio 
     */
    public void crearProducto(String codigo, int stock, String descripcion, String categoria, double precio) {

        producto = new Producto(codigo, stock, descripcion, categoria, precio);
        System.out.println(producto.toString());
        System.out.println(codigo + stock + descripcion + categoria + precio);
        productoDao.create(producto);

    }

    public Producto readProducto(String codigo) {

        producto = productoDao.read(codigo);
        return producto;
    }

    public void actualizarProducto(String codigo, int stock, String descripcion, String categoria, double precio) {
        producto = new Producto(producto.getCodigoSistema(), codigo, stock, descripcion, categoria, precio);
        System.out.println(producto.getCodigoSistema());
        productoDao.update(producto);
    }

    public void deleteProducto(String codigo) {
        
        productoDao.delete(producto.getCodigoSistema());
    }

    public Map<String, Producto> findAllProducto() {

        return productoDao.findAll();
    }

    public List<Producto> arrayProducto(){
        return productoDao.findAllArray();
    }
    
    public boolean comprobarExistenciaProducto(String codigo) {
        Map<String, Producto> listaProductos = new HashMap<>();
        listaProductos = productoDao.findAll();
        System.out.println(listaProductos.toString());
        if (listaProductos.containsKey(codigo)) {
            return true;
        } else {
            return false;
        }

    }

}
