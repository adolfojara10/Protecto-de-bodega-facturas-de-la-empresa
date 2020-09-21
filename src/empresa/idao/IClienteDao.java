/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresa.idao;

import empresa.modelo.Cliente;
import java.sql.ResultSet;

/**
 *
 * @author Adolfo
 */
public interface IClienteDao {
    
    public void create(Cliente cliente);
    
    public Cliente read(String cedula);
    
    public void update(Cliente cliente);
    
    public void delete(String cedula);
    
    public ResultSet findAll();
    
}
