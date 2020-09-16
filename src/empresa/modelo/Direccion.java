/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresa.modelo;

/**
 *
 * @author Adolfo
 */
public class Direccion {
    
    private String callePrincipal;
    private String calleSecundaria;
    private String calleNumero;

    public Direccion(String callePrincipal, String calleSecundaria, String calleNumero) {
        this.callePrincipal = callePrincipal;
        this.calleSecundaria = calleSecundaria;
        this.calleNumero = calleNumero;
    }

    public String getCallePrincipal() {
        return callePrincipal;
    }

    public void setCallePrincipal(String callePrincipal) {
        this.callePrincipal = callePrincipal;
    }

    public String getCalleSecundaria() {
        return calleSecundaria;
    }

    public void setCalleSecundaria(String calleSecundaria) {
        this.calleSecundaria = calleSecundaria;
    }

    public String getCalleNumero() {
        return calleNumero;
    }

    public void setCalleNumero(String calleNumero) {
        this.calleNumero = calleNumero;
    }

    @Override
    public String toString() {
        return "Direccion:\n" + "calle Principal: " + callePrincipal + "\tcalleSecundaria: " 
                + calleSecundaria + "\tcalleNumero: " + calleNumero;
    }
    
    
}
