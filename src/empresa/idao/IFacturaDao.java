/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresa.idao;

import empresa.modelo.Factura;
import java.util.List;

/**
 *
 * @author Adolfo
 */
public interface IFacturaDao {
    
    public void create(Factura factura);
    
    public Factura read(String numeroFactura);
    
    public void update(Factura factura);
    
    public void delete(String numeroFactura);
    
    public List<Factura> findAllArray();
}
