
package Interfaces;

import Clases.cLibro;
import Controladora.cABB;
import javax.swing.table.DefaultTableModel;



public class FormABB extends javax.swing.JFrame {

    cABB oABB;
    cLibro oLibro;
    
    public FormABB() {
        initComponents();
        establecerColumnas();
        setLocationRelativeTo(null);
    }
    
    DefaultTableModel modelo = new DefaultTableModel();
    
    private void establecerColumnas(){
        modelo.addColumn("ISBN");
        modelo.addColumn("Titulo");
        modelo.addColumn("Autor");
        modelo.addColumn("Género");
        modelo.addColumn("Editorial");
        modelo.addColumn("Idioma");
        modelo.addColumn("Año");
        jTable1.setModel(modelo);   
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        pnlOperaciones = new javax.swing.JPanel();
        btnRecorrer = new javax.swing.JButton();
        btnCargar = new javax.swing.JButton();
        cbxTipoRecorrido = new javax.swing.JComboBox<>();
        btnBuscar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        txtValorBusq = new javax.swing.JTextField();
        txtValorElim = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        pnlResultados = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtSalida = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Árbol Binario de Búsqueda");

        pnlOperaciones.setBackground(new java.awt.Color(255, 255, 204));
        pnlOperaciones.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Operaciones", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N

        btnRecorrer.setBackground(new java.awt.Color(0, 0, 0));
        btnRecorrer.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnRecorrer.setForeground(new java.awt.Color(255, 255, 255));
        btnRecorrer.setText("Recorrer ");
        btnRecorrer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecorrerActionPerformed(evt);
            }
        });

        btnCargar.setBackground(new java.awt.Color(0, 0, 0));
        btnCargar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCargar.setForeground(new java.awt.Color(255, 255, 255));
        btnCargar.setText("Cargar datos");
        btnCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarActionPerformed(evt);
            }
        });

        cbxTipoRecorrido.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tipo", "Pre Orden", "In Orden", "Post Orden" }));

        btnBuscar.setBackground(new java.awt.Color(0, 0, 0));
        btnBuscar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnEliminar.setBackground(new java.awt.Color(0, 0, 0));
        btnEliminar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setText("Eliminar");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 0, 51));
        jLabel2.setText("*presionar al inicio*");

        javax.swing.GroupLayout pnlOperacionesLayout = new javax.swing.GroupLayout(pnlOperaciones);
        pnlOperaciones.setLayout(pnlOperacionesLayout);
        pnlOperacionesLayout.setHorizontalGroup(
            pnlOperacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlOperacionesLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(pnlOperacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCargar, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlOperacionesLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel2)))
                .addGap(29, 29, 29)
                .addGroup(pnlOperacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cbxTipoRecorrido, 0, 112, Short.MAX_VALUE)
                    .addComponent(btnRecorrer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(37, 37, 37)
                .addGroup(pnlOperacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtValorBusq))
                .addGap(29, 29, 29)
                .addGroup(pnlOperacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtValorElim, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
        );
        pnlOperacionesLayout.setVerticalGroup(
            pnlOperacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlOperacionesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlOperacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnCargar, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addGroup(pnlOperacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnBuscar)
                        .addComponent(btnEliminar)
                        .addComponent(btnRecorrer, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlOperacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlOperacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtValorBusq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtValorElim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cbxTipoRecorrido, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pnlResultados.setBackground(new java.awt.Color(255, 255, 204));
        pnlResultados.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Resultados", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N

        txtSalida.setColumns(20);
        txtSalida.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtSalida.setRows(5);
        jScrollPane2.setViewportView(txtSalida);

        javax.swing.GroupLayout pnlResultadosLayout = new javax.swing.GroupLayout(pnlResultados);
        pnlResultados.setLayout(pnlResultadosLayout);
        pnlResultadosLayout.setHorizontalGroup(
            pnlResultadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlResultadosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlResultadosLayout.setVerticalGroup(
            pnlResultadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlResultadosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pnlOperaciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(29, 29, 29)
                        .addComponent(pnlResultados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(pnlOperaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(pnlResultados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarActionPerformed
        oABB =  new cABB();
        oABB.cargarDatos();
       //Mostrar datos en la tabla por defecto en In Orden
        oABB.mostrarTabla(modelo, 2);
    }//GEN-LAST:event_btnCargarActionPerformed

    private void btnRecorrerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecorrerActionPerformed
        int tipo;
        String opcion = cbxTipoRecorrido.getSelectedItem().toString();
        limpiarTabla(modelo);
        switch(opcion){
            case "Pre Orden":
                tipo=1;
                oABB.mostrarTabla(modelo, tipo);
            break;
            case "In Orden":
                tipo=2;
                oABB.mostrarTabla(modelo, tipo);
            break;
            case "Post Orden":
                tipo=3;
                oABB.mostrarTabla(modelo, tipo);
            break;
        }
    }//GEN-LAST:event_btnRecorrerActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        int valor = Integer.parseInt(txtValorBusq.getText());
        limpiarTabla(modelo);
        String msj = oABB.ingresaValorBusq(valor, modelo);
        txtValorBusq.setText(null);
        txtSalida.setText("RESULTADOS DE LA BÚSQUEDA: \n"+msj);
    }//GEN-LAST:event_btnBuscarActionPerformed

    public void limpiarTabla(DefaultTableModel modelo) {
        int indMaxFilas = modelo.getRowCount()-1;
        for (int i = indMaxFilas; i >= 0; i--) {
            modelo.removeRow(i);
        }
    }
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
            java.util.logging.Logger.getLogger(FormABB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormABB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormABB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormABB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormABB().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCargar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnRecorrer;
    private javax.swing.JComboBox<String> cbxTipoRecorrido;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel pnlOperaciones;
    private javax.swing.JPanel pnlResultados;
    private javax.swing.JTextArea txtSalida;
    private javax.swing.JTextField txtValorBusq;
    private javax.swing.JTextField txtValorElim;
    // End of variables declaration//GEN-END:variables
}
