/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresa.vista;

import empresa.controlador.ControladorCliente;
import empresa.modelo.Producto;
import javax.swing.JOptionPane;

/**
 *
 * @author Adolfo
 */
public class VentanaBodega extends javax.swing.JInternalFrame {

    private ControladorCliente controladorCliente;

    /**
     * Creates new form VentanaBodega
     */
    public VentanaBodega(ControladorCliente controladorCliente) {
        initComponents();

        this.controladorCliente = controladorCliente;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaDescripcion = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtFormattedPrecio = new javax.swing.JFormattedTextField();
        txtFormattedStock = new javax.swing.JFormattedTextField();
        jLabel5 = new javax.swing.JLabel();
        cbxCategoria = new javax.swing.JComboBox<>();
        btnCrear = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblProductos = new javax.swing.JTable();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setTitle("Bodega");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Descripción", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 0, 12))); // NOI18N

        jLabel1.setText("Código:");

        jLabel2.setText("Descripción:");

        txtAreaDescripcion.setColumns(20);
        txtAreaDescripcion.setRows(5);
        jScrollPane1.setViewportView(txtAreaDescripcion);

        jLabel3.setText("Stock:");

        jLabel4.setText("Precio:");

        txtFormattedPrecio.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        txtFormattedPrecio.setToolTipText("Ejemplo: 213.54 (escribit con punto)");

        txtFormattedStock.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getIntegerInstance())));

        jLabel5.setText("Categoria:");

        cbxCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Piso Flotante", "Granito" }));

        btnCrear.setBackground(new java.awt.Color(51, 51, 255));
        btnCrear.setText("Crear");
        btnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearActionPerformed(evt);
            }
        });

        btnBuscar.setBackground(new java.awt.Color(102, 102, 255));
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnEliminar.setBackground(new java.awt.Color(255, 0, 0));
        btnEliminar.setText("Eliminar");
        btnEliminar.setEnabled(false);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnActualizar.setBackground(new java.awt.Color(51, 0, 255));
        btnActualizar.setText("Actualizar");
        btnActualizar.setEnabled(false);
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnLimpiar.setBackground(new java.awt.Color(255, 51, 51));
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2)
                        .addComponent(jLabel1)
                        .addComponent(jLabel3)
                        .addComponent(jLabel4)
                        .addComponent(jLabel5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnCrear)
                        .addGap(13, 13, 13)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(cbxCategoria, javax.swing.GroupLayout.Alignment.LEADING, 0, 139, Short.MAX_VALUE)
                                .addComponent(txtFormattedStock, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtFormattedPrecio, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(btnBuscar)
                        .addGap(39, 39, 39)
                        .addComponent(btnActualizar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                        .addComponent(btnEliminar)
                        .addGap(32, 32, 32)
                        .addComponent(btnLimpiar)
                        .addGap(20, 20, 20))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jLabel2)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(txtFormattedStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtFormattedPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cbxCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCrear)
                    .addComponent(btnBuscar)
                    .addComponent(btnActualizar)
                    .addComponent(btnLimpiar)
                    .addComponent(btnEliminar))
                .addContainerGap())
        );

        tblProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Descripción", "Stock", "Precio", "Categoria"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Double.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblProductos.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(tblProductos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearActionPerformed
        // TODO add your handling code here:
        String codigo = txtCodigo.getText();
        String descripcion = txtAreaDescripcion.getText();
        int stock = Integer.valueOf(txtFormattedStock.getText());
        double precio = Double.parseDouble(txtFormattedPrecio.getText());
        String categoria = cbxCategoria.getSelectedItem().toString();

        if (codigo.isEmpty() || descripcion.isEmpty() || stock == 0 || precio == 0 || categoria.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Llene todos los campos del producto");
        } else {
            /*
            if (controladorCliente.comprobarExistenciaProducto(codigo)) {
                JOptionPane.showMessageDialog(this, "El código del producto ya existe");
            } else {
                
            }*/

            controladorCliente.crearProducto(codigo, stock, descripcion, categoria, precio);
            JOptionPane.showMessageDialog(this, "Producto creado con exito");
            limpiar();

        }

    }//GEN-LAST:event_btnCrearActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:

        String codigo = txtCodigo.getText();

        if (codigo.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Llene el campo codigo para buscar un producto");
        } else {
            Producto producto = controladorCliente.readProducto(codigo);
            if (producto != null) {
                txtCodigo.setText(producto.getCodigo());
                txtAreaDescripcion.setText(producto.getDescripcion());
                txtFormattedStock.setValue(producto.getStock());
                txtFormattedPrecio.setValue(producto.getPrecio());
                cbxCategoria.setSelectedItem(producto.getCategoria());

                btnCrear.setEnabled(false);
                btnEliminar.setEnabled(true);
                btnActualizar.setEnabled(true);
            } else {
                JOptionPane.showMessageDialog(this, "Producto no encontrado");
            }

        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // TODO add your handling code here:
        limpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        // TODO add your handling code here:
        String codigo = txtCodigo.getText();
        String descripcion = txtAreaDescripcion.getText();
        int stock = Integer.valueOf(txtFormattedStock.getText());
        double precio = Double.parseDouble(txtFormattedPrecio.getText());
        String categoria = cbxCategoria.getSelectedItem().toString();

        if (codigo.isEmpty() || descripcion.isEmpty() || stock == 0 || precio == 0 || categoria.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Llene todos los campos del producto");
        } else {
            /*
            if (controladorCliente.comprobarExistenciaProducto(codigo)) {
                JOptionPane.showMessageDialog(this, "El código del producto ya existe");
            } else {
                
            }*/

            controladorCliente.actualizarProducto(codigo, stock, descripcion, categoria, precio);
            JOptionPane.showMessageDialog(this, "Producto actualizado con exito");
            limpiar();

        }

    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        if (controladorCliente.comprobarExistenciaProducto(txtCodigo.getText())) {
            int confirmacion = JOptionPane.showConfirmDialog(this, "¿Seguro desea eliminar este producto?");
            if (confirmacion == JOptionPane.YES_OPTION) {
                controladorCliente.deleteProducto(txtCodigo.getText());
                JOptionPane.showMessageDialog(this, "Producto eliminado");
                limpiar();
            }
        } else {
            JOptionPane.showMessageDialog(this, "Error. Asegurese que no haya editado el codigo del producto antes de eliminarlo");
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    public void limpiar() {
        txtCodigo.setText("");
        txtAreaDescripcion.setText("");
        txtFormattedPrecio.setValue(0);
        txtFormattedStock.setValue(0);
        tblProductos.clearSelection();
        btnCrear.setEnabled(true);
        btnEliminar.setEnabled(false);
        btnActualizar.setEnabled(false);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCrear;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JComboBox<String> cbxCategoria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblProductos;
    private javax.swing.JTextArea txtAreaDescripcion;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JFormattedTextField txtFormattedPrecio;
    private javax.swing.JFormattedTextField txtFormattedStock;
    // End of variables declaration//GEN-END:variables
}
