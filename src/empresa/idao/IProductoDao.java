/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresa.idao;

import empresa.modelo.Producto;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Adolfo
 */
public interface IProductoDao {
    
    public void create(Producto producto);
    
    public Producto read(String codigo);
    
    public void update(Producto producto);
    
    public void delete(String codigo);
    
    public Map<String, Producto> findAll();
    
    public List<Producto> findAllArray();
}
