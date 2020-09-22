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
            String databaseURL = "jdbc:ucanaccess://C:\\Users\\Adolfo\\Desktop\\RESPALDO\\Proyectos\\Mami\\BBDD\\Empresa.accdb";
            conexion = DriverManager.getConnection(databaseURL);

            System.out.println("Conexion de productos");
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void create(Producto producto) {
        try {
            comandoSQL = "INSERT INTO Producto (Codigo, Descripcion, Categoria, Precio, Stock) VALUES (?, ?, ?, ?, ?)";

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
            comandoSQL = "SELECT * FROM Producto WHERE Codigo=?";

            preparedStatement = conexion.prepareStatement(comandoSQL);

            preparedStatement.setString(1, codigo);

            ResultSet resultado = preparedStatement.executeQuery();

            Producto producto;
            while (resultado.next()) {
                producto = new Producto(resultado.getString("Codigo"), resultado.getInt("Stock"),
                        resultado.getString("Descripcion"), resultado.getString("Categoria"), resultado.getDouble("Precio"));

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
            comandoSQL = "UPDATE Producto SET Codigo=?, Descripcion=?, Categoria=?, Precio=?, Stock=? WHERE Codigo=?";

            preparedStatement = conexion.prepareStatement(comandoSQL);

            preparedStatement.setString(1, producto.getCodigo());
            preparedStatement.setString(2, producto.getDescripcion());
            preparedStatement.setString(3, producto.getCategoria());
            preparedStatement.setDouble(4, producto.getPrecio());
            preparedStatement.setInt(5, producto.getStock());

            int filaUpdate = preparedStatement.executeUpdate();

            if (filaUpdate > 0) {
                System.out.println("Producto actualizado");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void delete(String codigo) {

        try {
            comandoSQL = "DELETE FROM Producto WHERE Codigo=?";

            preparedStatement = conexion.prepareStatement(comandoSQL);

            preparedStatement.setString(1, codigo);

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
            comandoSQL = "SELECT * FROM Producto";

            statement = conexion.createStatement();
            
            ResultSet resultado = statement.executeQuery(comandoSQL);

            Map<String,Producto> listaProductos = new HashMap<>();
            
            while (resultado.next()) {
                Producto producto = new Producto(resultado.getString("Codigo"), resultado.getInt("Stock"),
                        resultado.getString("Descripcion"), resultado.getString("Categoria"), resultado.getDouble("Precio"));
                
                listaProductos.put(producto.getCodigo(), producto);
                return listaProductos;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

}
