/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresa.dao;

import empresa.idao.IProductoDao;
import empresa.modelo.Producto;
import java.util.List;
import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Adolfo
 */
public class ProductoDaoImpl implements IProductoDao {

    private Connection conexion;
    private PreparedStatement preparedStatement;
    private Statement statement;
    private String comandoSQL;

    public ProductoDaoImpl() {

        try {
            String databaseURL = "jdbc:ucanaccess://C:\\Users\\Adolfo\\Desktop\\RESPALDO\\Proyectos\\Mami\\BBDD\\PruebasEmpresa.accdb";
            conexion = DriverManager.getConnection(databaseURL);

            System.out.println("Conexion de productos");
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void create(Producto producto) {
        try {
            comandoSQL = "INSERT INTO Productos (CodigoProducto, Descripcion, Categoria, PrecioUnitario, StockDisponible) VALUES (?, ?, ?, ?, ?)";

            preparedStatement = conexion.prepareStatement(comandoSQL);

            preparedStatement.setString(1, producto.getCodigo());
            preparedStatement.setString(2, producto.getDescripcion());
            preparedStatement.setString(3, producto.getCategoria());
            preparedStatement.setDouble(4, producto.getPrecio());
            preparedStatement.setInt(5, producto.getStock());

            int fila = preparedStatement.executeUpdate();
            if (fila > 0) {
                System.out.println("Producto creado");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Producto read(String codigo) {
        try {
            comandoSQL = "SELECT * FROM Productos WHERE CodigoProducto=?";

            preparedStatement = conexion.prepareStatement(comandoSQL);

            preparedStatement.setString(1, codigo);

            ResultSet resultado = preparedStatement.executeQuery();

            Producto producto;
            while (resultado.next()) {
                producto = new Producto(resultado.getInt("CodigoBBDD"), resultado.getString("CodigoProducto"), 
                        resultado.getInt("StockDisponible"), resultado.getString("Descripcion"), 
                        resultado.getString("Categoria"), resultado.getDouble("PrecioUnitario"));

                return producto;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;

    }

    @Override
    public void update(Producto producto) {

        try {
            comandoSQL = "UPDATE Productos SET CodigoProducto=?, Descripcion=?, Categoria=?, PrecioUnitario=?, StockDisponible=? WHERE CodigoBBDD=?";

            preparedStatement = conexion.prepareStatement(comandoSQL);

            preparedStatement.setString(1, producto.getCodigo());
            preparedStatement.setString(2, producto.getDescripcion());
            preparedStatement.setString(3, producto.getCategoria());
            preparedStatement.setDouble(4, producto.getPrecio());
            preparedStatement.setInt(5, producto.getStock());
            preparedStatement.setInt(6, producto.getCodigoSistema());
            System.out.println(producto.getCodigoSistema());

            int filaUpdate = preparedStatement.executeUpdate();

            if (filaUpdate > 0) {
                System.out.println("Producto actualizado");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void delete(int codigoBBDD) {

        try {
            comandoSQL = "DELETE FROM Productos WHERE CodigoBBDD=?";

            preparedStatement = conexion.prepareStatement(comandoSQL);

            preparedStatement.setInt(1, codigoBBDD);

            int filaEliminada = preparedStatement.executeUpdate();

            if (filaEliminada > 0) {
                System.out.println("Producto eliminado");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Map<String, Producto> findAll() {
        try {
            comandoSQL = "SELECT * FROM Productos";

            statement = conexion.createStatement();
            
            ResultSet resultado = statement.executeQuery(comandoSQL);

            Map<String,Producto> listaProductos = new HashMap<>();
            
            while (resultado.next()) {
                Producto producto = new Producto(resultado.getInt("CodigoBBDD"), 
                        resultado.getString("CodigoProducto"), resultado.getInt("StockDisponible"),
                        resultado.getString("Descripcion"), resultado.getString("Categoria"), 
                        resultado.getDouble("PrecioUnitario"));
                
                listaProductos.put(producto.getCodigo(), producto);
                
            }
            return listaProductos;

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    
    @Override
    public List<Producto> findAllArray(){
        try {
            comandoSQL = "SELECT * FROM Productos";

            statement = conexion.createStatement();
            
            ResultSet resultado = statement.executeQuery(comandoSQL);

            List<Producto> listaProductos = new ArrayList<>();
            
            while (resultado.next()) {
                Producto producto = new Producto(resultado.getInt("CodigoBBDD"), 
                        resultado.getString("CodigoProducto"), resultado.getInt("StockDisponible"),
                        resultado.getString("Descripcion"), resultado.getString("Categoria"), 
                        resultado.getDouble("PrecioUnitario"));
                
                listaProductos.add(producto);
                
            }
            return listaProductos;

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

}
