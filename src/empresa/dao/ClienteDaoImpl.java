/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresa.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import empresa.idao.IClienteDao;
import empresa.modelo.Cliente;
import java.util.List;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import static net.ucanaccess.util.Logger.log;

/**
 *
 * @author Adolfo
 */
public class ClienteDaoImpl implements IClienteDao {

    private Connection conexion;

    public ClienteDaoImpl() {

        String databaseURL = "jdbc:ucanaccess://C:\\Users\\Adolfo\\Desktop\\RESPALDO\\Proyectos\\Mami\\BBDD\\Empresa.accdb";

        try {
            conexion = DriverManager.getConnection(databaseURL);
            System.out.println("Conectado a la base de datos");

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }

    @Override
    public void create(Cliente cliente) {
        try {

            String commandoSQL = "INSERT INTO Clientes (Cedula, Nombre, Apellido, Correo, Telefono, Direccion) VALUES (?,?,?,?,?,?)";

            PreparedStatement preparedStatement = conexion.prepareStatement(commandoSQL);

            preparedStatement.setString(1, cliente.getCedula());
            preparedStatement.setString(2, cliente.getNombres());
            preparedStatement.setString(3, cliente.getApellidos());
            preparedStatement.setString(4, cliente.getCorreo());
            preparedStatement.setString(5, cliente.getTelefono());
            preparedStatement.setString(6, cliente.getDireccion());

            int rows = preparedStatement.executeUpdate();

            if (rows > 0) {
                System.out.println("Fila añadida");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Cliente read(String cedula) {
        try {

            String comandoSQL = "SELECT * FROM Clientes WHERE Cedula=?";

            PreparedStatement preparedStatement = conexion.prepareStatement(comandoSQL);

            preparedStatement.setString(1, cedula);

            ResultSet rs = preparedStatement.executeQuery();

            Cliente cliente;
            while (rs.next()) {
                String nombre = rs.getString("Nombre");
                String apellido = rs.getString("Apellido");
                String correo = rs.getString("Correo");
                String telefono = rs.getString("Telefono");
                String direccion = rs.getString("Direccion");

                cliente = new Cliente(nombre, apellido, cedula, telefono, direccion, correo);
                return cliente;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void update(Cliente cliente) {

    }

    @Override
    public void delete(String cedula) {

    }

    @Override
    public ResultSet findAll() {

        ResultSet resultado;

        try {

            String comandoSQL = "SELECT * FROM Clientes";

            Statement statement = conexion.createStatement();

            resultado = statement.executeQuery(comandoSQL);

            while (resultado.next()) {
                String cedula = resultado.getString("Cedula");
                String nombre = resultado.getString("Nombre");

                System.out.println(cedula + " " + nombre);
            }

            return resultado;

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;

    }

}
