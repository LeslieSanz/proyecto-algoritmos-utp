package Interfaces;

import Clases.cLibro;
import Controladora.ListaEnlazadaDoble;
import Controladora.controlLibros;
import Rescursividad.cRecursividad;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Form extends javax.swing.JFrame {
    int codigo;
    int row;

    
    public Form() {
        initComponents();
        establecerColumnas();
        this.setLocationRelativeTo(this);
        pnlPrioridad.setVisible(false);
        
        enlazadaDoble= new ListaEnlazadaDoble();
        
    }
    
    cRecursividad r;
    controlLibros oControlLib;
    ListaEnlazadaDoble enlazadaDoble;
    cLibro oLibro;
    DefaultTableModel modelo = new DefaultTableModel();
    DefaultTableModel modelo1 = new DefaultTableModel();
    FormColaPrioridad cp;
    FormCyP cyp;
    
    private void establecerColumnas(){
        modelo.addColumn("ISBN");
        modelo.addColumn("Titulo");
        modelo.addColumn("Autor");
        modelo.addColumn("Genero");
        modelo.addColumn("Editorial");
        modelo.addColumn("Idioma");
        modelo.addColumn("Año");
        modelo.addColumn("Prioridad");
        tblDatos.setModel(modelo);   
        
        
        modelo1.addColumn("ISBN");
        modelo1.addColumn("Titulo");
        modelo1.addColumn("Autor");
        modelo1.addColumn("Genero");
        modelo1.addColumn("Editorial");
        modelo1.addColumn("Idioma");
        modelo1.addColumn("Año");
        tblDatos1.setModel(modelo1);
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        isbn = new javax.swing.JTextField();
        titulo = new javax.swing.JTextField();
        autor = new javax.swing.JTextField();
        editorial = new javax.swing.JTextField();
        año = new javax.swing.JTextField();
        btnOrdenarAutor = new javax.swing.JButton();
        BtnMostrarPor = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblDatos = new javax.swing.JTable();
        btnMostrarTabla = new javax.swing.JButton();
        btnCargar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        cbxGenero = new javax.swing.JComboBox<>();
        cbxIdioma = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        btnCrear = new javax.swing.JButton();
        btnInsertar = new javax.swing.JButton();
        btnBuscar1 = new javax.swing.JButton();
        btnBuscar2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        eliminar = new javax.swing.JButton();
        btnBuscarXpalabras = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jToggleButton2 = new javax.swing.JToggleButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblDatos1 = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        btnModificar = new javax.swing.JButton();
        pnlPrioridad = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        rbtSi = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        btnGuardar = new javax.swing.JButton();
        btnColaPrioridad = new javax.swing.JButton();
        jToggleButton1 = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setText("Autor");

        jLabel4.setText("Género");

        jLabel5.setText("Idioma");

        jLabel6.setText("Año de publicación");

        jLabel7.setText("Editorial");

        btnOrdenarAutor.setText("Ordenar por autor");
        btnOrdenarAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdenarAutorActionPerformed(evt);
            }
        });

        BtnMostrarPor.setText("Ordenar por año ");
        BtnMostrarPor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMostrarPorActionPerformed(evt);
            }
        });

        tblDatos.setModel(new javax.swing.table.DefaultTableModel(
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
        tblDatos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDatosMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblDatosMousePressed(evt);
            }
        });
        tblDatos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tblDatosKeyPressed(evt);
            }
        });
        jScrollPane2.setViewportView(tblDatos);

        btnMostrarTabla.setText("Mostrar tabla");
        btnMostrarTabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarTablaActionPerformed(evt);
            }
        });

        btnCargar.setText("Cargar datos");
        btnCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarActionPerformed(evt);
            }
        });

        jLabel1.setText("ISBN");

        jButton2.setText("Ordenar editorial e idioma");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel2.setText("Título");

        cbxGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Drama", "Novela", "Fantasía", "Romance", "Histórico", "Terror", "Infantil", "Ciencia ficción", "Autoayuda", "No ficción" }));
        cbxGenero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxGeneroActionPerformed(evt);
            }
        });

        cbxIdioma.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Español", "Inglés", "Portugues" }));
        cbxIdioma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxIdiomaActionPerformed(evt);
            }
        });

        jLabel8.setText("Cantidad de libros");

        btnCrear.setText("Crear arreglo");
        btnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearActionPerformed(evt);
            }
        });

        btnInsertar.setText("Insertar");
        btnInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertarActionPerformed(evt);
            }
        });

        btnBuscar1.setText("Buscar por ISBN");
        btnBuscar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscar1ActionPerformed(evt);
            }
        });

        btnBuscar2.setText("Buscar por año y género");
        btnBuscar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscar2ActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        eliminar.setText("Eliminar (por ISBN)");
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });

        btnBuscarXpalabras.setText("Buscar por palabras");
        btnBuscarXpalabras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarXpalabrasActionPerformed(evt);
            }
        });

        jButton1.setText(" Buscar por idioma");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        jLabel9.setText("Datos de los libros");

        jLabel10.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel10.setText("Resultados de la búsqueda");

        jButton3.setText("Limpiar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jToggleButton2.setBackground(new java.awt.Color(255, 102, 102));
        jToggleButton2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jToggleButton2.setForeground(new java.awt.Color(255, 255, 255));
        jToggleButton2.setText("Evidencia LDE");
        jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton2ActionPerformed(evt);
            }
        });

        tblDatos1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(tblDatos1);

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setText("Tabla para la lista doblemente enlazada");

        btnModificar.setText("Modificar prioridad");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        pnlPrioridad.setBackground(new java.awt.Color(204, 204, 204));

        jLabel12.setText("Asignar prioridad?");

        buttonGroup1.add(rbtSi);
        rbtSi.setText("Si");

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("No");

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlPrioridadLayout = new javax.swing.GroupLayout(pnlPrioridad);
        pnlPrioridad.setLayout(pnlPrioridadLayout);
        pnlPrioridadLayout.setHorizontalGroup(
            pnlPrioridadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPrioridadLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnGuardar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(pnlPrioridadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlPrioridadLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(rbtSi)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButton2)))
                .addContainerGap())
        );
        pnlPrioridadLayout.setVerticalGroup(
            pnlPrioridadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPrioridadLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel12)
                .addGroup(pnlPrioridadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlPrioridadLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(pnlPrioridadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbtSi)
                            .addComponent(jRadioButton2)))
                    .addGroup(pnlPrioridadLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(btnGuardar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnColaPrioridad.setText("Cola con prioridad");
        btnColaPrioridad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnColaPrioridadActionPerformed(evt);
            }
        });

        jToggleButton1.setText("SUMA");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCrear)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCargar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(28, 28, 28)
                                .addComponent(isbn, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(22, 22, 22)
                                .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(23, 23, 23)
                                .addComponent(autor, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btnInsertar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(eliminar)
                                        .addGap(36, 36, 36)
                                        .addComponent(btnMostrarTabla))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel4)
                                            .addGap(33, 33, 33)
                                            .addComponent(cbxGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel5)
                                            .addGap(18, 18, 18)
                                            .addComponent(cbxIdioma, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel7)
                                                .addGap(10, 10, 10)
                                                .addComponent(editorial, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel6)
                                                .addGap(18, 18, 18)
                                                .addComponent(año, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGap(47, 47, 47)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBuscar2)
                            .addComponent(btnBuscarXpalabras, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jToggleButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBuscar1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(140, 140, 140)
                                .addComponent(jToggleButton1))))
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 610, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addGap(27, 27, 27))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(BtnMostrarPor, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(btnOrdenarAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 610, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(pnlPrioridad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnColaPrioridad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(btnCargar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel1))
                            .addComponent(isbn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel2))
                            .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel3))
                            .addComponent(autor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel7))
                            .addComponent(editorial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(3, 3, 3)
                                        .addComponent(jLabel6))
                                    .addComponent(año, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbxGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(4, 4, 4)
                                        .addComponent(jLabel4))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbxIdioma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(4, 4, 4)
                                        .addComponent(jLabel5)))))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnInsertar)
                            .addComponent(eliminar)
                            .addComponent(btnMostrarTabla)
                            .addComponent(jButton3)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BtnMostrarPor)
                            .addComponent(btnOrdenarAutor)
                            .addComponent(jButton2))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pnlPrioridad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnModificar)
                            .addComponent(btnColaPrioridad))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jToggleButton1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jToggleButton2)
                                .addGap(14, 14, 14)
                                .addComponent(btnBuscar1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnBuscar2)
                                .addGap(18, 18, 18)
                                .addComponent(btnBuscarXpalabras)
                                .addGap(21, 21, 21)
                                .addComponent(jButton1)))
                        .addContainerGap(40, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearActionPerformed
    int n = Integer.parseInt(txtCantidad.getText());   
    oControlLib = new controlLibros(n);
    
    cp = new FormColaPrioridad(oControlLib);
    }//GEN-LAST:event_btnCrearActionPerformed

    private void btnInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarActionPerformed
        int is= Integer.parseInt(isbn.getText());
        String titul= titulo.getText();
        String aut=autor.getText();
        String editor=editorial.getText();
        int anio=Integer.parseInt(año.getText());
        String gen=cbxGenero.getSelectedItem().toString();
        String idio=cbxIdioma.getSelectedItem().toString();
        
        //insertar en arreglo
        oLibro = new cLibro(titul, is, aut, editor, gen, anio, idio);
        oControlLib.insertarLibro(oLibro);
        
        //insertar en lista doblemente enlazada, OJO INSERTA DE FORMA ASCENDENTE
        oLibro= new cLibro(titul, is, aut, editor, gen, anio, idio);// TODO add your handling code here:
        enlazadaDoble.Insertar(oLibro);
        
        isbn.setText("");
        titulo.setText("");
        autor.setText("");
        editorial.setText("");
        año.setText("");
    }//GEN-LAST:event_btnInsertarActionPerformed

    private void btnBuscar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscar1ActionPerformed
    int isbnF= Integer.parseInt(isbn.getText());
    String encontrado = oControlLib.busquedaNoOrdenadaISBN(isbnF);
    jTextArea1.append("\n"+encontrado);
         
    }//GEN-LAST:event_btnBuscar1ActionPerformed

    private void btnBuscar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscar2ActionPerformed
    String gen=cbxGenero.getSelectedItem().toString();
    int anio=Integer.parseInt(año.getText());
    String encontrado= oControlLib.busquedaDosCampos(anio, gen);
    jTextArea1.append("\n"+encontrado);
    }//GEN-LAST:event_btnBuscar2ActionPerformed

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
    int isbnF= Integer.parseInt(isbn.getText());
    //eliminar en array
    oControlLib.eliminarLibro(isbnF);
    //eliminar en lista doblemente enlazada
    enlazadaDoble.eliminar(isbnF);
    }//GEN-LAST:event_eliminarActionPerformed

    private void btnOrdenarAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdenarAutorActionPerformed
    oControlLib.ordInsercionParaString();
    oControlLib.limpiarTabla(modelo);
    oControlLib.mostrarTablaR(modelo);
    
    //String cadena=oControlLib.muestraLibro();
    //jTextArea1.setText(cadena);
    }//GEN-LAST:event_btnOrdenarAutorActionPerformed

    private void btnBuscarXpalabrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarXpalabrasActionPerformed
        String pbuscar = titulo.getText();
        String resultadoBusqueda = oControlLib.BNOxpalaEspecf(pbuscar);
        jTextArea1.setText(resultadoBusqueda);
    }//GEN-LAST:event_btnBuscarXpalabrasActionPerformed

    private void BtnMostrarPorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMostrarPorActionPerformed
        oControlLib.ordenarPorAtributoNumerico();
        oControlLib.limpiarTabla(modelo);
        oControlLib.mostrarTablaR(modelo);
        
        
        
        //String cadena = oControlLib.muestraLibro();
        //jTextArea1.setText(cadena);
        
    }//GEN-LAST:event_BtnMostrarPorActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String idio=cbxIdioma.getSelectedItem().toString();
        String encontrado = oControlLib.busquedaOrdenada(idio);
        jTextArea1.append("\n"+encontrado);    // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnMostrarTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarTablaActionPerformed
    //mostrar en la tabla (array)
    oControlLib.limpiarTabla(modelo);
    oControlLib.mostrarTablaR(modelo);

    jTextArea1.setText("");
    
    //muestra, metodo ed lista doblemente enlazada
    String listaRecorrida= enlazadaDoble.RecorreListaDobleEnlazada();
    //jTextArea1.append(enlazadaDoble.RecorreListaDobleEnlazada());
    enlazadaDoble.mostrarTabla(modelo1);
    }//GEN-LAST:event_btnMostrarTablaActionPerformed

    private void btnCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarActionPerformed
        //cargar datos del arreglo
    oControlLib.cargarDatos();
    oControlLib.mostrarTablaR(modelo);
    
    
        //cargar datos de la lista doblemente enlazada
    enlazadaDoble.cargarDatos();
    //jTextArea1.append(enlazadaDoble.RecorreListaDobleEnlazada());
    enlazadaDoble.mostrarTabla(modelo1);
    
   
    }//GEN-LAST:event_btnCargarActionPerformed

    private void cbxGeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxGeneroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxGeneroActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    oControlLib.ordenarPorDosAtributos();
    oControlLib.limpiarTabla(modelo);
    oControlLib.mostrarTablaR(modelo);// TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void cbxIdiomaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxIdiomaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxIdiomaActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        oControlLib.limpiarTabla(modelo);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton2ActionPerformed
    jTextArea1.setText("");
    String listaRecorrida= enlazadaDoble.EvidenciarListaDobleEnlazada();
    jTextArea1.append(enlazadaDoble.EvidenciarListaDobleEnlazada());        // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButton2ActionPerformed

    private void tblDatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDatosMouseClicked
        row = tblDatos.getSelectedRow();
        cp.txtLibro.setText(tblDatos.getValueAt(row, 0).toString());
    }//GEN-LAST:event_tblDatosMouseClicked

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        row = tblDatos.getSelectedRow();
        if (row==-1){
            // Mostrar un mensaje de error para notificar al usuario que debe seleccionar una fila.
        JOptionPane.showMessageDialog(this, "Por favor, seleccione un libro de la tabla.", "Error", JOptionPane.ERROR_MESSAGE);
        }else{
            codigo = Integer.parseInt(tblDatos.getValueAt(row, 0).toString());
            pnlPrioridad.setVisible(true);
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        //Metodo para buscar un libro por su codigo, que devuelve un objeto para acceder a su setter para modificarlo
        oLibro = oControlLib.BuscarUno(codigo);
        
        if(rbtSi.isSelected()){
            oLibro.setPrioridad(1);
        }else{
            oLibro.setPrioridad(0);
        }
        
        oControlLib.limpiarTabla(modelo);
        oControlLib.mostrarTablaR(modelo);
        pnlPrioridad.setVisible(false);
        
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnColaPrioridadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnColaPrioridadActionPerformed
        cp.setVisible(true);        
        
    }//GEN-LAST:event_btnColaPrioridadActionPerformed

    private void tblDatosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDatosMousePressed

    }//GEN-LAST:event_tblDatosMousePressed

    private void tblDatosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblDatosKeyPressed
        if(evt.getKeyCode()==evt.VK_ENTER){
             cyp = new FormCyP();
             cyp.setVisible(true);
             
             row = tblDatos.getSelectedRow();
             cyp.txttitulo.setText(tblDatos.getValueAt(row, 1).toString());
         }
    }//GEN-LAST:event_tblDatosKeyPressed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
    int suma=oControlLib.calcularSuma();
    
    jTextArea1.setText(String.valueOf(suma));        // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButton1ActionPerformed
    
    
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
            java.util.logging.Logger.getLogger(Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnMostrarPor;
    private javax.swing.JTextField autor;
    private javax.swing.JTextField año;
    private javax.swing.JButton btnBuscar1;
    private javax.swing.JButton btnBuscar2;
    private javax.swing.JButton btnBuscarXpalabras;
    private javax.swing.JButton btnCargar;
    private javax.swing.JButton btnColaPrioridad;
    private javax.swing.JButton btnCrear;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnInsertar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnMostrarTabla;
    private javax.swing.JButton btnOrdenarAutor;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbxGenero;
    private javax.swing.JComboBox<String> cbxIdioma;
    private javax.swing.JTextField editorial;
    private javax.swing.JButton eliminar;
    private javax.swing.JTextField isbn;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JPanel pnlPrioridad;
    private javax.swing.JRadioButton rbtSi;
    private javax.swing.JTable tblDatos;
    private javax.swing.JTable tblDatos1;
    private javax.swing.JTextField titulo;
    private javax.swing.JTextField txtCantidad;
    // End of variables declaration//GEN-END:variables
}
