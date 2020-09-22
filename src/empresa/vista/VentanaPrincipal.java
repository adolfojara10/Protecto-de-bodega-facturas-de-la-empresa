/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresa.vista;

import empresa.controlador.ControladorCliente;
import empresa.dao.ClienteDaoImpl;
import empresa.dao.ProductoDaoImpl;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author Adolfo
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    private ClienteDaoImpl clienteDAO;
    private ProductoDaoImpl productoDAO;
    private ControladorCliente controladorCliente;
    
    private VentanaCliente ventanaCliente;
    private VentanaFactura ventanaFactura;
    private VentanaBodega ventanaBodega;
    
    
    
    
    /**
     * Creates new form VentanaPrincipal
     */
    public VentanaPrincipal() {
        initComponents();
        
        clienteDAO = new ClienteDaoImpl();
        controladorCliente = new ControladorCliente(clienteDAO, productoDAO);
        
        ventanaCliente = new VentanaCliente(controladorCliente);
        ventanaFactura = new VentanaFactura(controladorCliente);
        ventanaBodega = new VentanaBodega(controladorCliente);
        
        desktopPane.add(ventanaCliente);
        desktopPane.add(ventanaFactura);
        desktopPane.add(ventanaBodega);
                
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        panelInicio = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        btnIniciar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        menuBar = new javax.swing.JMenuBar();
        menuOpciones = new javax.swing.JMenu();
        menuItemCerrarSesion = new javax.swing.JMenuItem();
        exitMenuItem = new javax.swing.JMenuItem();
        menuGestion = new javax.swing.JMenu();
        menuItemCliente = new javax.swing.JMenuItem();
        menuItemFactura = new javax.swing.JMenuItem();
        menuBodega = new javax.swing.JMenu();
        menuItemBodega = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Home");
        setPreferredSize(new java.awt.Dimension(1200, 600));

        jLabel1.setText("Inicio Sesión");
        jLabel1.setToolTipText("Inicio Sesión");

        jLabel2.setText("Usuario:");
        jLabel2.setToolTipText("");

        jLabel3.setText("Contraseña:");

        txtUsuario.setToolTipText("Escriba el usuario");

        txtPassword.setToolTipText("Escriba la contraseña");
        txtPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPasswordKeyPressed(evt);
            }
        });

        btnIniciar.setBackground(new java.awt.Color(51, 51, 255));
        btnIniciar.setText("Iniciar Sesión");
        btnIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarActionPerformed(evt);
            }
        });

        btnCancelar.setBackground(new java.awt.Color(255, 0, 0));
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelInicioLayout = new javax.swing.GroupLayout(panelInicio);
        panelInicio.setLayout(panelInicioLayout);
        panelInicioLayout.setHorizontalGroup(
            panelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInicioLayout.createSequentialGroup()
                .addGroup(panelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelInicioLayout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(panelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panelInicioLayout.createSequentialGroup()
                                .addComponent(btnIniciar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                                .addComponent(btnCancelar))
                            .addGroup(panelInicioLayout.createSequentialGroup()
                                .addGroup(panelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(36, 36, 36)
                                .addGroup(panelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtUsuario)
                                    .addComponent(txtPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)))))
                    .addGroup(panelInicioLayout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addComponent(jLabel1)))
                .addContainerGap(67, Short.MAX_VALUE))
        );
        panelInicioLayout.setVerticalGroup(
            panelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInicioLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(panelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(panelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnIniciar)
                    .addComponent(btnCancelar))
                .addGap(21, 21, 21))
        );

        desktopPane.add(panelInicio);
        panelInicio.setBounds(0, 0, 350, 200);

        menuOpciones.setMnemonic('f');
        menuOpciones.setText("Opciones");

        menuItemCerrarSesion.setMnemonic('o');
        menuItemCerrarSesion.setText("Cerrar Sesion");
        menuItemCerrarSesion.setEnabled(false);
        menuItemCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemCerrarSesionActionPerformed(evt);
            }
        });
        menuOpciones.add(menuItemCerrarSesion);

        exitMenuItem.setMnemonic('x');
        exitMenuItem.setText("Salir");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        menuOpciones.add(exitMenuItem);

        menuBar.add(menuOpciones);

        menuGestion.setMnemonic('e');
        menuGestion.setText("Gestión");
        menuGestion.setEnabled(false);

        menuItemCliente.setMnemonic('t');
        menuItemCliente.setText("Cliente");
        menuItemCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemClienteActionPerformed(evt);
            }
        });
        menuGestion.add(menuItemCliente);

        menuItemFactura.setMnemonic('y');
        menuItemFactura.setText("Factura");
        menuItemFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemFacturaActionPerformed(evt);
            }
        });
        menuGestion.add(menuItemFactura);

        menuBar.add(menuGestion);

        menuBodega.setMnemonic('h');
        menuBodega.setText("Bodega");
        menuBodega.setEnabled(false);

        menuItemBodega.setMnemonic('c');
        menuItemBodega.setLabel("Bodega");
        menuItemBodega.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemBodegaActionPerformed(evt);
            }
        });
        menuBodega.add(menuItemBodega);

        menuBar.add(menuBodega);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 507, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 406, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitMenuItemActionPerformed

    private void btnIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarActionPerformed
        // TODO add your handling code here:

        String usuario = txtUsuario.getText();
        String password = txtPassword.getText();

        System.out.println(password);
        if (usuario.isEmpty() || password.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Llene todos los campos para iniciar sesión");

        } else if (usuario.equals("admin") && password.equals("1234")) {

            menuBodega.setEnabled(true);
            menuGestion.setEnabled(true);
            menuOpciones.setEnabled(true);

            txtUsuario.setText("");
            txtPassword.setText("");

            panelInicio.setVisible(false);
            menuItemCerrarSesion.setEnabled(true);
            
            
            controladorCliente.findAll();

        } else {
            JOptionPane.showMessageDialog(this, "Usuario o contraseña incorrectos");
        }


    }//GEN-LAST:event_btnIniciarActionPerformed

    private void txtPasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPasswordKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            String usuario = txtUsuario.getText();
            String password = txtPassword.getText();

            System.out.println(password);
            if (usuario.isEmpty() || password.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Llene todos los campos para iniciar sesión");

            } else if (usuario.equals("admin") && password.equals("1234")) {

                menuBodega.setEnabled(true);
                menuGestion.setEnabled(true);
                menuOpciones.setEnabled(true);

                txtPassword.setText("");
                txtUsuario.setText("");
                panelInicio.setVisible(false);
                
                menuItemCerrarSesion.setEnabled(true);
                
                
                controladorCliente.findAll();
                

            } else {
                JOptionPane.showMessageDialog(this, "Usuario o contraseña incorrectos");
            }
        }
    }//GEN-LAST:event_txtPasswordKeyPressed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        txtPassword.setText("");
        txtUsuario.setText("");
        
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void menuItemCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemCerrarSesionActionPerformed
        // TODO add your handling code here:
        cerrarVentanas();
        menuBodega.setEnabled(false);
        menuGestion.setEnabled(false);
        menuItemCerrarSesion.setEnabled(false);
        
        panelInicio.setVisible(true);
        
    }//GEN-LAST:event_menuItemCerrarSesionActionPerformed

    private void menuItemClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemClienteActionPerformed
        // TODO add your handling code here:
        cerrarVentanas();
        ventanaCliente.setVisible(true);
        
    }//GEN-LAST:event_menuItemClienteActionPerformed

    private void menuItemFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemFacturaActionPerformed
        // TODO add your handling code here:
        cerrarVentanas();
        ventanaFactura.setVisible(true);
    }//GEN-LAST:event_menuItemFacturaActionPerformed

    private void menuItemBodegaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemBodegaActionPerformed
        // TODO add your handling code here:
        cerrarVentanas();
        ventanaBodega.setVisible(true);
    }//GEN-LAST:event_menuItemBodegaActionPerformed

    
    
 
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    public void cerrarVentanas(){
        ventanaCliente.setVisible(false);
        ventanaFactura.setVisible(false);
        ventanaBodega.setVisible(false);
        panelInicio.setVisible(false);
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnIniciar;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu menuBodega;
    private javax.swing.JMenu menuGestion;
    private javax.swing.JMenuItem menuItemBodega;
    private javax.swing.JMenuItem menuItemCerrarSesion;
    private javax.swing.JMenuItem menuItemCliente;
    private javax.swing.JMenuItem menuItemFactura;
    private javax.swing.JMenu menuOpciones;
    private javax.swing.JPanel panelInicio;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables

}
