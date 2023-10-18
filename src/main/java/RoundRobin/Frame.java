package RoundRobin;

import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Frame extends javax.swing.JFrame {
    //..
    int Contador; // Contador del total de procesos que se van ingresando
    private Proceso proceso;
    private int quantumValue; // Variable para almacenar el valor de Quantum

    public Frame() {
        initComponents();
        TblLista.setBackground(Color.CYAN);
        TblLista.setForeground(Color.BLUE);
        TxtQuantum.grabFocus();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BtnAgregar = new javax.swing.JButton();
        BtnIniciar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        TxtTiempo = new javax.swing.JTextField();
        TxtQuantum = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TblLista = new javax.swing.JTable();
        LblProcesamiento = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        TxtNombre = new javax.swing.JTextField();
        jLabelEstado1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TxtFinal = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BtnAgregar.setBackground(new java.awt.Color(0, 153, 153));
        BtnAgregar.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        BtnAgregar.setForeground(new java.awt.Color(255, 255, 255));
        BtnAgregar.setText("Agregar");
        BtnAgregar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAgregarActionPerformed(evt);
            }
        });

        BtnIniciar.setBackground(new java.awt.Color(0, 153, 153));
        BtnIniciar.setFont(new java.awt.Font("DialogInput", 1, 36)); // NOI18N
        BtnIniciar.setForeground(new java.awt.Color(255, 255, 255));
        BtnIniciar.setText("Iniciar");
        BtnIniciar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnIniciarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        jLabel2.setText("Quantum");

        TxtTiempo.setBackground(new java.awt.Color(204, 255, 255));
        TxtTiempo.setForeground(new java.awt.Color(51, 51, 51));

        TxtQuantum.setBackground(new java.awt.Color(204, 255, 255));
        TxtQuantum.setForeground(new java.awt.Color(51, 51, 51));

        jLabel3.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        jLabel3.setText("Tiempo");

        TblLista.setBackground(new java.awt.Color(0, 255, 204));
        TblLista.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        TblLista.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        TblLista.setForeground(new java.awt.Color(0, 0, 0));
        TblLista.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Tiempo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TblLista);

        LblProcesamiento.setFont(new java.awt.Font("DialogInput", 1, 24)); // NOI18N
        LblProcesamiento.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblProcesamiento.setText("PROCESAMIENTO");
        LblProcesamiento.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel4.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        jLabel4.setText("Nombre");

        TxtNombre.setBackground(new java.awt.Color(204, 255, 255));
        TxtNombre.setForeground(new java.awt.Color(51, 51, 51));

        jLabelEstado1.setFont(new java.awt.Font("DialogInput", 1, 24)); // NOI18N
        jLabelEstado1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelEstado1.setText("PROCESOS");
        jLabelEstado1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        TxtFinal.setBackground(new java.awt.Color(204, 255, 255));
        TxtFinal.setColumns(20);
        TxtFinal.setRows(5);
        jScrollPane2.setViewportView(TxtFinal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtnIniciar)
                        .addGap(10, 10, 10))
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 517, Short.MAX_VALUE))
                .addGap(35, 35, 35))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(LblProcesamiento, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(120, 120, 120))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TxtQuantum, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelEstado1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(BtnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(TxtTiempo, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(175, 175, 175))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TxtQuantum, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TxtTiempo, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(BtnIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(BtnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jLabelEstado1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LblProcesamiento)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAgregarActionPerformed
    
     try {
            // Obtener el valor de Quantum
            quantumValue = Integer.parseInt(TxtQuantum.getText());

            String nombre = TxtNombre.getText();
            int tiempo = Integer.parseInt(TxtTiempo.getText());

            if (tiempo <= 1000) {
                proceso = new Proceso(nombre, tiempo); // Usar el nombre y tiempo ingresados
                Ingresar(proceso.getNombre(), proceso.getTiempo());
                TxtQuantum.setEditable(false);
            } else {
                JOptionPane.showMessageDialog(null, "Las Rafagas no pueden ser mayores de 100");
                TxtTiempo.setText(null);
                TxtTiempo.grabFocus();
            }
        } catch (NumberFormatException e) {
            // Manejar una excepción en caso de que los valores ingresados no sean números válidos
            JOptionPane.showMessageDialog(null, "Ingresa valores numéricos válidos.");
        }
      
    }//GEN-LAST:event_BtnAgregarActionPerformed

    private void BtnIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnIniciarActionPerformed

    
    try {
    int quantum = Integer.parseInt(TxtQuantum.getText());

    if (quantum > 0) {
        TxtFinal.setText(""); // Limpiar el TextArea de salida

        // Crear una nueva Cola y pasar el TxtFinal al constructor
        Cola cola = new Cola(TxtFinal);

        // Encolar los procesos a partir de los datos ingresados en la tabla
        DefaultTableModel modelo = (DefaultTableModel) TblLista.getModel();
        for (int i = 0; i < modelo.getRowCount(); i++) {
            String nombre = modelo.getValueAt(i, 0).toString();
            int tiempo = Integer.parseInt(modelo.getValueAt(i, 1).toString());
            cola.encolar(new Proceso(nombre, tiempo));
        }

        // Ejecutar el algoritmo Round Robin
        cola.ejecutarRoundRobin(quantum);
    } else {
        JOptionPane.showMessageDialog(null, "Ingresa un valor válido para Quantum.");
    }
} catch (NumberFormatException e) {
    JOptionPane.showMessageDialog(null, "Ingresa un valor numérico válido para Quantum.");
}


    
    }//GEN-LAST:event_BtnIniciarActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame().setVisible(true);
            }
        });
    }

    
    private void Ingresar(String nombre, int tiempo) {
    DefaultTableModel modelo = (DefaultTableModel) TblLista.getModel();

        Object[] miTabla = new Object[2];
        miTabla[0] = nombre; // Utilizar el nombre ingresado
        miTabla[1] = tiempo; // Utilizar el tiempo ingresado

        modelo.addRow(miTabla);
        TblLista.setModel(modelo);
        TxtNombre.setText(null);
        TxtTiempo.setText(null);
        TxtNombre.grabFocus();
    }



    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAgregar;
    private javax.swing.JButton BtnIniciar;
    private javax.swing.JLabel LblProcesamiento;
    private javax.swing.JTable TblLista;
    private javax.swing.JTextArea TxtFinal;
    private javax.swing.JTextField TxtNombre;
    private javax.swing.JTextField TxtQuantum;
    private javax.swing.JTextField TxtTiempo;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelEstado1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
