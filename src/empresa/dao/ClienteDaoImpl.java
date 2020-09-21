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
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Adolfo
 */
public class ClienteDaoImpl implements IClienteDao{

    public ClienteDaoImpl() {
        
        String databaseURL = "jdbc:ucanaccess://C:\\Users\\Adolfo\\Desktop\\RESPALDO\\Proyectos\\Mami\\BBDD\\Empresa.accdb";
        
        try {
            Connection conexion = DriverManager.getConnection(databaseURL);
            System.out.println("Conectado a la base de datos");
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
    }

    
    @Override
    public void create(Cliente cliente) {
        
    }

    @Override
    public Cliente read(String cedula) {
        
        return null;
    }

    @Override
    public void update(Cliente cliente) {
        
    }

    @Override
    public void delete(String cedula) {
        
    }

    @Override
    public List<Cliente> findAll() {
        
        return null;
    }
    
    
    
}
