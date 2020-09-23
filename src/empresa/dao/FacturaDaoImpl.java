/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresa.dao;

import empresa.idao.IFacturaDao;
import empresa.modelo.DetalleFactura;
import empresa.modelo.Factura;
import java.util.List;
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author Adolfo
 */
public class FacturaDaoImpl implements IFacturaDao {

    private Connection conexion;
    private PreparedStatement preparedStatement;
    private Statement statement;
    private String comandoSQL;

    public FacturaDaoImpl() {

        try {
            String databaseURL = "jdbc:ucanaccess://C:\\Users\\Adolfo\\Desktop\\RESPALDO\\Proyectos\\Mami\\BBDD\\Empresa.accdb";
            conexion = DriverManager.getConnection(databaseURL);

            System.out.println("Conexion de productos");
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void create(Factura factura) {
        try {
            comandoSQL = "INSERT INTO Factura () VALUES (?)";

            preparedStatement = conexion.prepareStatement(comandoSQL);
            preparedStatement.setString(0, factura.getNumeroFactura());

            int filaAñadida = preparedStatement.executeUpdate();

            if (filaAñadida > 0) {
                System.out.println("Factura añadida");

            }

            for (DetalleFactura DatosFactura : factura.getDetallesFactura()) {
                comandoSQL = "INSERT INTO DetalleFactura () VALUES (?)";
                preparedStatement = conexion.prepareStatement(comandoSQL);
                preparedStatement.setString(0, DatosFactura.getIdFactura());

                filaAñadida = preparedStatement.executeUpdate();

                if (filaAñadida > 0) {
                    System.out.println("Dato factura añadida");

                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Factura read(String numeroFactura) {

        try {
            comandoSQL = "SELECT * FROM Factura WHERE NumeroFactura=?";

            preparedStatement = conexion.prepareStatement(comandoSQL);
            preparedStatement.setString(1, numeroFactura);

            ResultSet resultado = preparedStatement.executeQuery();

            Factura factura;
            while (resultado.next()) {
                //factura = 
            }

            comandoSQL = "SELECT * FROM DetalleFactura WHERE NumeroFactura=?";

            preparedStatement = conexion.prepareStatement(comandoSQL);
            preparedStatement.setString(1, numeroFactura);

            resultado = preparedStatement.executeQuery();

            List<DetalleFactura> detallesFactura = new ArrayList<>();
            while (resultado.next()) {
                //DetalleFactura detalleFactura = 

                //detallesFactura.add(detalleFactura);
            }

            //factura.setDetallesFactura(detallesFactura);
            //return factura;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void update(Factura factura) {

        try {
            comandoSQL = "UPDATE Factura SET NumeroFactura=? WHERE CodigoSistema=?";
            
            preparedStatement = conexion.prepareStatement(comandoSQL);
            
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void delete(String numeroFactura) {

    }

    @Override
    public List<Factura> findAllArray() {

        try {
            comandoSQL = "SELECT * FROM Factura";

            statement = conexion.createStatement();

            ResultSet resultado = statement.executeQuery(comandoSQL);

            List<Factura> facturas = new ArrayList<>();
            while (resultado.next()) {
                //para crear la factura
                //Factura factura = new Factura();

                //para la lista de datos de la factura
                /*
                comandoSQL = "SELECT * FROM DetalleFactura WHERE NumeroFactura=?";

                preparedStatement = conexion.prepareStatement(comandoSQL);
                preparedStatement.setString(1, factura.getNumeroFactura());

                resultado = preparedStatement.executeQuery();
            
                List<DetalleFactura> detallesFactura = new ArrayList<>();
                while (resultado.next()) {
                    //DetalleFactura detalleFactura = new DetalleFactura();
                
                    //detallesFactura.add(detalleFactura);
                }
                 */
                //factura.setDetallesFactura(detallesFactura);
                //facturas.add(factura);
            }

            return facturas;

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

}
