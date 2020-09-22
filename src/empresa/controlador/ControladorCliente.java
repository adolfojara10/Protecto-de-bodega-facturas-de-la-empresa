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

        return clienteDao.read(cedula);

    }

    public void updateCliente(String nombres, String apellidos, String cedula, String telefono,
            String direccion, String correo) {

        cliente = new Cliente(nombres, apellidos, cedula, telefono, direccion, correo);

        clienteDao.update(cliente);

    }

    public void deleteCliente(String cedula) {
        clienteDao.delete(cedula);
    }

    public ResultSet findAll() {
        return clienteDao.findAll();
    }

    /**
     *
     * para los productos
     */
    public void crearProducto(String codigo, int stock, String descripcion, String categoria, double precio) {

        producto = new Producto(codigo, stock, descripcion, categoria, precio);
        productoDao.create(producto);

    }

    public Producto readProducto(String codigo) {

        return productoDao.read(codigo);
    }

    public void actualizarProducto(String codigo, int stock, String descripcion, String categoria, double precio) {
        producto = new Producto(codigo, stock, descripcion, categoria, precio);
        productoDao.update(producto);
    }

    public void deleteProducto(String codigo) {
        productoDao.delete(codigo);
    }

    public Map<String, Producto> findAllProducto() {

        return productoDao.findAll();
    }

    public boolean comprobarExistenciaProducto(String codigo) {
        Map<String, Producto> listaProductos = new HashMap<>();
        listaProductos = productoDao.findAll();

        if (listaProductos.containsKey(codigo)) {
            return true;
        } else {
            return false;
        }

    }

}
