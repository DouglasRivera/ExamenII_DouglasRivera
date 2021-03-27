/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2_douglasrubi;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author river
 */
public class Menu_Frame extends javax.swing.JFrame {

    private int IdEnsambladores = -1;
    private int IdVehiculos = -1;
    
    public static ArrayList<Vehiculos> vehiculos = new ArrayList();
    private Vehiculos Vehiculo;
    public static ArrayList<Ensamblador> ensan = new ArrayList();
    private Ensamblador Ensambladores;

    public Menu_Frame() {
        initComponents();
        JTablaEnsambladores.setModel(new javax.swing.table.DefaultTableModel(
                        new Object[][]{},
                        new String[]{
                            "Id", "Nombre", "Genero", "Edad", "Cantidad Vehiculos"
                        }
                ) {
                    Class[] types = new Class[]{
                        java.lang.String.class, java.lang.String.class , java.lang.String.class, java.lang.String.class, java.lang.String.class
                    };
                    boolean[] canEdit = new boolean[]{
                        false, false,false,false,false
                    };
                    
                    

                    public Class getColumnClass(int columnIndex) {
                        return types[columnIndex];
                    }

                    public boolean isCellEditable(int rowIndex, int columnIndex) {
                        return canEdit[columnIndex];
                    }
                });
        
                JTablaEnsambladores.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
                    @Override
                    public void valueChanged(ListSelectionEvent e) {
                        // jTable1.getSelectedRow()
                        IdEnsambladores = JTablaEnsambladores.getSelectedRow();
                    }

                });
                 JTablaEnsambladores.setModel(new javax.swing.table.DefaultTableModel(
                        new Object[][]{},
                        new String[]{
                            "Id", "Nombre", "Genero", "Edad", "Cantidad Vehiculos"
                        }
                ) {
                    Class[] types = new Class[]{
                        java.lang.String.class, java.lang.String.class , java.lang.String.class, java.lang.String.class, java.lang.String.class
                    };
                    boolean[] canEdit = new boolean[]{
                        false, false,false,false,false
                    };
                    
                    

                    public Class getColumnClass(int columnIndex) {
                        return types[columnIndex];
                    }

                    public boolean isCellEditable(int rowIndex, int columnIndex) {
                        return canEdit[columnIndex];
                    }
                });
        
                JTablaEnsambladores.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
                    @Override
                    public void valueChanged(ListSelectionEvent e) {
                        // jTable1.getSelectedRow()
                        IdEnsambladores = JTablaEnsambladores.getSelectedRow();
                    }

                });//VIN (identificador UNICO), color, batería, carrocería, interior, sistema de infoentretenimiento y asientos
                JTablaVehiculos.setModel(new javax.swing.table.DefaultTableModel(
                        new Object[][]{},
                        new String[]{
                            "VIN", "Color","Carroceria"
                        }
                ) {
                    Class[] types = new Class[]{
                        java.lang.String.class, java.lang.String.class , java.lang.String.class, java.lang.String.class, java.lang.String.class
                    };
                    boolean[] canEdit = new boolean[]{
                        false, false,false,false,false
                    };
                    
                    

                    public Class getColumnClass(int columnIndex) {
                        return types[columnIndex];
                    }

                    public boolean isCellEditable(int rowIndex, int columnIndex) {
                        return canEdit[columnIndex];
                    }
                });
        
                JTablaVehiculos.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
                    @Override
                    public void valueChanged(ListSelectionEvent e) {
                        // jTable1.getSelectedRow()
                        IdVehiculos = JTablaVehiculos.getSelectedRow();
                    }

                });
                 JTablaVehiculos.setModel(new javax.swing.table.DefaultTableModel(
                        new Object[][]{},
                        new String[]{
                            "VIN", "Color","Carroceria"
                        }
                ) {
                    Class[] types = new Class[]{
                        java.lang.String.class, java.lang.String.class , java.lang.String.class, java.lang.String.class, java.lang.String.class
                    };
                    boolean[] canEdit = new boolean[]{
                        false, false,false,false,false
                    };
                    
                    

                    public Class getColumnClass(int columnIndex) {
                        return types[columnIndex];
                    }

                    public boolean isCellEditable(int rowIndex, int columnIndex) {
                        return canEdit[columnIndex];
                    }
                });
        
                JTablaVehiculos.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
                    @Override
                    public void valueChanged(ListSelectionEvent e) {
                        // jTable1.getSelectedRow()
                        IdVehiculos = JTablaVehiculos.getSelectedRow();
                    }

                });
                
                recargarTablaEnsambladores(JTablaEnsambladores);
                recargarTablaVehiculos(JTablaVehiculos);
    }
    private String Genero = "";
    private int Puntuacion = -1;
    
    public void vaciarTablaEnsambladores(JTable tabla){
        DefaultTableModel Modelo = (DefaultTableModel) JTablaEnsambladores.getModel();
        String titulos[] =  new String[]{
                             "Id", "Nombre", "Genero", "Edad", "Cantidad Vehiculos"
                        };
        Modelo = new DefaultTableModel(null,titulos);
        tabla.setModel(Modelo);

    }
    
    private void recargarTablaEnsambladores(JTable tabla){
        vaciarTablaEnsambladores(tabla);
          Ensamblador tp = new Ensamblador();
                for (Ensamblador ensamblador : tp.ReadFileScannerArrayList()) {
                    Object row[] = {ensamblador.getNombre(), ensamblador.getGenero(), ensamblador.getId(),ensamblador.getCant_vehiculos(), ensamblador.getEdad()};
                    DefaultTableModel m =
                            (DefaultTableModel) tabla.getModel();
                    m.addRow(row);
                    tabla.setModel(m);
                }//fin for
    }
                public void vaciarTablaVehiculos(JTable tabla){
        DefaultTableModel Modelo = (DefaultTableModel) JTablaVehiculos.getModel();
        String titulos[] =  new String[]{
                             "VIN","Color","Carroceria"
                        };
        Modelo = new DefaultTableModel(null,titulos);
        tabla.setModel(Modelo);

    }
    
    private void recargarTablaVehiculos(JTable tabla){
        vaciarTablaVehiculos(tabla);
          Vehiculos tp = new Vehiculos();
                for (Vehiculos vehiculos : tp.ReadFileScannerArrayList()) {
                    Object row[] = {vehiculos.getVIN(), vehiculos.getColor(), vehiculos.getCarroceria()};
                    DefaultTableModel m =
                            (DefaultTableModel) tabla.getModel();
                    m.addRow(row);
                    tabla.setModel(m);
                }//fin for
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jtxtVIN = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jtxtColor = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jtxtBateria = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jtxtMaterial = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jtxtAutonomia = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jtxtMaterialUsado = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jtxtTipoVolante = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jtxtCantBotones = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jtxtCantidadPantallas = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtAnchoPantalla = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jtxtMaterialAsientos = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jtxtTipoAsiento = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jtxtMasaje = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jbGuardarVehiculos = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jtxtId = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jtxtNombre = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jtxtEdad = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        JspinnerCant = new javax.swing.JSpinner();
        jLabel20 = new javax.swing.JLabel();
        jcbGenero = new javax.swing.JComboBox<>();
        jbGuardarEnsambladores = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        JTablaVehiculos = new javax.swing.JTable();
        jbtModificarVehiculos = new javax.swing.JButton();
        jbtEliminarVehiculos = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTablaEnsambladores = new javax.swing.JTable();
        jbtModificarEnsambladores = new javax.swing.JButton();
        jbtEliminarEnsambladores = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setText("VIN:");

        jtxtVIN.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setText("Color:");

        jtxtColor.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setText("Bateria:");

        jtxtBateria.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setText("Material:");

        jtxtMaterial.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel5.setText("Autonomia:");

        jtxtAutonomia.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel6.setText("Material Usado:");

        jtxtMaterialUsado.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel7.setText("Tipo de Volante:");

        jtxtTipoVolante.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel8.setText("Cantidad de Botones:");

        jtxtCantBotones.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel9.setText("Cantidad de Pantallas:");

        jtxtCantidadPantallas.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel10.setText("Ancho de Pantalla:");

        txtAnchoPantalla.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel11.setText("Material:");

        jtxtMaterialAsientos.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel12.setText("Tipo Asiento:");

        jtxtTipoAsiento.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jLabel13.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel13.setText("Masaje:");

        jtxtMasaje.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jLabel15.setFont(new java.awt.Font("MV Boli", 0, 48)); // NOI18N
        jLabel15.setText("VEHICULOS");

        jbGuardarVehiculos.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jbGuardarVehiculos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Add.png"))); // NOI18N
        jbGuardarVehiculos.setText("Guardar Vehiculos");
        jbGuardarVehiculos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarVehiculosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(165, 165, 165)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(jtxtVIN, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(jtxtColor, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addGap(18, 18, 18)
                            .addComponent(jtxtBateria, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addGap(18, 18, 18)
                            .addComponent(jtxtMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addGap(18, 18, 18)
                            .addComponent(jtxtAutonomia, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel7)
                                .addComponent(jLabel6))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jtxtMaterialUsado, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jtxtTipoVolante, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 198, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel10)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel8)
                                .addComponent(jLabel9))
                            .addComponent(jLabel11))
                        .addGap(21, 21, 21))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel13)
                            .addComponent(jLabel12))
                        .addGap(18, 18, 18)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtAnchoPantalla, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxtCantidadPantallas, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxtCantBotones, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxtMaterialAsientos, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxtTipoAsiento, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxtMasaje, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(113, 113, 113))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addGap(311, 311, 311))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jbGuardarVehiculos)
                        .addGap(287, 287, 287))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15)
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jtxtVIN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jtxtColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtxtBateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtxtMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtxtAutonomia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtxtMaterialUsado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jtxtCantBotones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jtxtCantidadPantallas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtAnchoPantalla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtxtMaterialAsientos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtxtTipoAsiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtxtMasaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13))))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtTipoVolante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(jbGuardarVehiculos)
                .addGap(63, 63, 63))
        );

        jTabbedPane1.addTab("AGREGAR VEHICULOS", jPanel1);

        jLabel16.setFont(new java.awt.Font("MV Boli", 0, 48)); // NOI18N
        jLabel16.setText("ENSAMBLADORES");

        jLabel14.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel14.setText("Id:");

        jtxtId.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jLabel17.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel17.setText("Nombre:");

        jtxtNombre.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jLabel18.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel18.setText("Edad:");

        jtxtEdad.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jLabel19.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel19.setText("Cantidad de Vehiculos esamblados:");

        JspinnerCant.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        JspinnerCant.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));

        jLabel20.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel20.setText("Genero:");

        jcbGenero.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jcbGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mujer", "Hombre" }));

        jbGuardarEnsambladores.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jbGuardarEnsambladores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Add.png"))); // NOI18N
        jbGuardarEnsambladores.setText("Agregar Ensambladores");
        jbGuardarEnsambladores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarEnsambladoresActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(252, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addGap(254, 254, 254))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel19)
                                .addGap(18, 18, 18)
                                .addComponent(JspinnerCant, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addGap(18, 18, 18)
                                .addComponent(jtxtId, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel17)
                                .addGap(18, 18, 18)
                                .addComponent(jtxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel18)
                                .addGap(18, 18, 18)
                                .addComponent(jtxtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel20)
                                .addGap(18, 18, 18)
                                .addComponent(jcbGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(371, 371, 371))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jbGuardarEnsambladores)
                        .addGap(293, 293, 293))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel16)
                .addGap(47, 47, 47)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jtxtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jtxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18))
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(JspinnerCant, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20))
                .addGap(61, 61, 61)
                .addComponent(jbGuardarEnsambladores)
                .addContainerGap(82, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("AGREGAR ENSAMBLADORES", jPanel2);

        JTablaVehiculos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(JTablaVehiculos);

        jbtModificarVehiculos.setFont(new java.awt.Font("Century", 0, 24)); // NOI18N
        jbtModificarVehiculos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Edit.png"))); // NOI18N
        jbtModificarVehiculos.setText("Modificar");
        jbtModificarVehiculos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtModificarVehiculosActionPerformed(evt);
            }
        });

        jbtEliminarVehiculos.setFont(new java.awt.Font("Century", 0, 24)); // NOI18N
        jbtEliminarVehiculos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Delete.png"))); // NOI18N
        jbtEliminarVehiculos.setText("Eliminar");
        jbtEliminarVehiculos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtEliminarVehiculosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(253, 253, 253)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(290, 290, 290)
                        .addComponent(jbtModificarVehiculos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbtEliminarVehiculos)))
                .addContainerGap(289, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(98, 98, 98)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtEliminarVehiculos)
                    .addComponent(jbtModificarVehiculos))
                .addContainerGap(323, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("CRUD VEHICULOS", jPanel3);

        JTablaEnsambladores.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(JTablaEnsambladores);

        jbtModificarEnsambladores.setFont(new java.awt.Font("Century", 0, 24)); // NOI18N
        jbtModificarEnsambladores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Edit.png"))); // NOI18N
        jbtModificarEnsambladores.setText("Modificar");
        jbtModificarEnsambladores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtModificarEnsambladoresActionPerformed(evt);
            }
        });

        jbtEliminarEnsambladores.setFont(new java.awt.Font("Century", 0, 24)); // NOI18N
        jbtEliminarEnsambladores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Delete.png"))); // NOI18N
        jbtEliminarEnsambladores.setText("Eliminar");
        jbtEliminarEnsambladores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtEliminarEnsambladoresActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(236, 236, 236)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(277, 277, 277)
                        .addComponent(jbtModificarEnsambladores)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbtEliminarEnsambladores)))
                .addContainerGap(306, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtEliminarEnsambladores)
                    .addComponent(jbtModificarEnsambladores))
                .addContainerGap(312, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("CRUD ENSAMBLADORES", jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(56, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 999, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 649, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbGuardarVehiculosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarVehiculosActionPerformed

    }//GEN-LAST:event_jbGuardarVehiculosActionPerformed

    private void jbtModificarEnsambladoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtModificarEnsambladoresActionPerformed
        if(JTablaEnsambladores.getSelectedRow()>=0){
            // mostrar la segunda pestaña para editar
            jTabbedPane1.setSelectedIndex(2);
            Ensamblador tp = new Ensamblador();
            ArrayList<Ensamblador> ensambladores = tp.ReadFileScannerArrayList();
            this.Ensambladores = ensambladores.get(IdEnsambladores);
            this.jtxtNombre.setText(Ensambladores.getNombre());
            this.jtxtId.setText(Ensambladores.getId()+"");
            this.JspinnerCant.setValue(Ensambladores.getCant_vehiculos());
            this.jcbGenero.setSelectedItem(Ensambladores.getGenero());
            this.jtxtEdad.setText(Ensambladores.getEdad()+"");
        }
    }//GEN-LAST:event_jbtModificarEnsambladoresActionPerformed

    private void jbtEliminarEnsambladoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtEliminarEnsambladoresActionPerformed
        if(JTablaEnsambladores.getSelectedRow()>=0){
            // eliminar
            Ensamblador tp = new Ensamblador();
            ArrayList<Ensamblador> ensambladores = tp.ReadFileScannerArrayList();
            ensambladores.remove(IdEnsambladores);
            this.IdEnsambladores = -1;
            tp.WriteFileMod(ensambladores);
            recargarTablaEnsambladores(JTablaEnsambladores);
            JOptionPane.showMessageDialog(this, "Se Elimino correctamente");
        }
    }//GEN-LAST:event_jbtEliminarEnsambladoresActionPerformed

    private void jbtModificarVehiculosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtModificarVehiculosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtModificarVehiculosActionPerformed

    private void jbtEliminarVehiculosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtEliminarVehiculosActionPerformed
         if(JTablaVehiculos.getSelectedRow()>=0){
            // eliminar
            Vehiculos tp = new Vehiculos();
            ArrayList<Vehiculos> vehiculos = tp.ReadFileScannerArrayList();
            vehiculos.remove(IdEnsambladores);
            this.IdVehiculos = -1;
            tp.WriteFileMod(vehiculos);
            recargarTablaVehiculos(JTablaVehiculos);
            JOptionPane.showMessageDialog(this, "Se elimino correctamente");
        }
    }//GEN-LAST:event_jbtEliminarVehiculosActionPerformed

    private void jbGuardarEnsambladoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarEnsambladoresActionPerformed
        this.Genero =  (String) jcbGenero.getSelectedItem();
        this.Puntuacion =  (Integer) JspinnerCant.getValue();
        boolean valido = true;
        if (this.jtxtId.getText() == null || "".equals(this.jtxtId.getText())) {
            JOptionPane.showConfirmDialog(this, "Ingrese el Id");
            valido = false; 
        }
        if (this.jtxtNombre.getText() == null || "".equals(this.jtxtNombre.getText())) {
            JOptionPane.showConfirmDialog(this, "Ingrese el nombre");
            valido = false;       
        }
        if (this.jtxtEdad.getText() == null || "".equals(this.jtxtEdad.getText())) {
            JOptionPane.showConfirmDialog(this, "Ingrese la edad");
            valido = false;
        }
        if (this.Genero == null || "".equals(this.Genero)) {
            JOptionPane.showConfirmDialog(this, "Ingrese el genero del programa");
            valido = false;
        }
        if (this.Puntuacion == -1 || "".equals(this.Puntuacion)) {
            JOptionPane.showConfirmDialog(this, "Ingrese la puntuacion");
            valido = false;       
        }  if (valido && this.IdEnsambladores <0) {
            // int Puntos, int YearLanzamiento, String Nombre, String Tipo, String Genero
            Ensamblador ensambladores = new Ensamblador( jtxtNombre.getText(), this.Genero, Integer.parseInt(jtxtId.getText()),this.Puntuacion,Integer.parseInt(jtxtEdad.getText()));
            ensambladores.WriteFile();
            JOptionPane.showMessageDialog(this, "Se agrego correctamente");
        } else if(this.IdEnsambladores>=0) {
            Ensamblador tp = new Ensamblador();
            ArrayList<Ensamblador> ensambladores = tp.ReadFileScannerArrayList();
            Ensamblador ensambladorActualizar = ensambladores.get(IdEnsambladores);
            ensambladorActualizar.setCant_vehiculos(Puntuacion);
            ensambladorActualizar.setId(Integer.parseInt(jtxtId.getText()));
            ensambladorActualizar.setNombre(jtxtNombre.getText());
            ensambladorActualizar.setGenero(Genero);
            ensambladorActualizar.setEdad(Integer.parseInt(jtxtEdad.getText()));
            // this.Id = -1;
            tp.WriteFileMod(ensambladores);
            this.IdEnsambladores = -1;
           JOptionPane.showMessageDialog(this, "Se actualizo correctamente");
        }
        recargarTablaEnsambladores(JTablaEnsambladores);
       
    }//GEN-LAST:event_jbGuardarEnsambladoresActionPerformed

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
            java.util.logging.Logger.getLogger(Menu_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu_Frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable JTablaEnsambladores;
    private javax.swing.JTable JTablaVehiculos;
    private javax.swing.JSpinner JspinnerCant;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton jbGuardarEnsambladores;
    private javax.swing.JButton jbGuardarVehiculos;
    private javax.swing.JButton jbtEliminarEnsambladores;
    private javax.swing.JButton jbtEliminarVehiculos;
    private javax.swing.JButton jbtModificarEnsambladores;
    private javax.swing.JButton jbtModificarVehiculos;
    private javax.swing.JComboBox<String> jcbGenero;
    private javax.swing.JTextField jtxtAutonomia;
    private javax.swing.JTextField jtxtBateria;
    private javax.swing.JTextField jtxtCantBotones;
    private javax.swing.JTextField jtxtCantidadPantallas;
    private javax.swing.JTextField jtxtColor;
    private javax.swing.JTextField jtxtEdad;
    private javax.swing.JTextField jtxtId;
    private javax.swing.JTextField jtxtMasaje;
    private javax.swing.JTextField jtxtMaterial;
    private javax.swing.JTextField jtxtMaterialAsientos;
    private javax.swing.JTextField jtxtMaterialUsado;
    private javax.swing.JTextField jtxtNombre;
    private javax.swing.JTextField jtxtTipoAsiento;
    private javax.swing.JTextField jtxtTipoVolante;
    private javax.swing.JTextField jtxtVIN;
    private javax.swing.JTextField txtAnchoPantalla;
    // End of variables declaration//GEN-END:variables
}
