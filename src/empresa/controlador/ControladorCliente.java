/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresa.controlador;

import empresa.dao.ClienteDaoImpl;
import empresa.modelo.Cliente;
import empresa.modelo.Direccion;

/**
 *
 * @author Adolfo
 */
public class ControladorCliente {
    
    private Cliente cliente;
    private Direccion direccion;
    
    private ClienteDaoImpl clienteDao;

    


    public void createCliente(String nombres, String apellidos, String cedula, String telefono, 
            String calleP, String calleS, String calleN){
        
        direccion = new Direccion(calleP, calleS, calleN);
        cliente = new Cliente(nombres, apellidos, cedula, telefono, direccion);
        
        clienteDao.create(cliente);
    
    }
    
    public Cliente readCliente(String cedula){
        return clienteDao.read(cedula);
        
    }
    
    public void updateCliente(String nombres, String apellidos, String cedula, String telefono, 
            String calleP, String calleS, String calleN){
        
        direccion = new Direccion(calleP, calleS, calleN);
        cliente = new Cliente(nombres, apellidos, cedula, telefono, direccion);
        
        clienteDao.update(cliente);
    
    }
    
    public void deleteCliente(String cedula){
        clienteDao.delete(cedula);
    }
    
    
}