/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import Conectar.conectar1;
import java.awt.Component;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javax.print.attribute.Size2DSyntax.MM;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Imacosx
 */
public class IngresarCompra extends javax.swing.JInternalFrame {
     public int acce1,acc1,acc2;
     String accestado,accestado2;
    /**
     * Creates new form IngresarCompra
     */
    public IngresarCompra() {
        
        initComponents();
       hidden();
        RellenarAccesorio1();
    }
    /*public void limpiar()
    {
     auto_txt.setText(" ");
     Cliente_txt.setText(" ");
     codaut.setText(" ");
     codclie.setText(" ");
     Accesorio.setSelectedIndex(0);
     
    }*/
     public void hidden()
     {
     idAccesorio.setVisible(false);
     codaut.setVisible(false);
     codclie.setVisible(false);
     }
     public void RellenarAccesorio1()
     {

      String sql = "Select * from accesorios";
 
    
    
      conectar1 cc = new conectar1();
      Connection cn = cc.conexion();
      
    try{
        Statement st = cn.createStatement();
        ResultSet rs = st.executeQuery(sql);
        while(rs.next())
        {
           Accesorio.addItem(rs.getString(2));

        }
    
    }catch(SQLException ex)
    {
        Logger.getLogger(IngresarCompra.class.getName()).log(Level.SEVERE,null,ex);
    
    }
     }
    public boolean ValidarCantidadAccesorios()
    {
      DefaultTableModel modelo = (DefaultTableModel)TablaDetalle.getModel();
      int filas = TablaDetalle.getRowCount(); 
      if(filas==2)
      {
          return true;
      }
      return false;
    }
    public boolean ValidarAccesorio()
    {
        String asd="";
      DefaultTableModel modelo = (DefaultTableModel)TablaDetalle.getModel();
      int filas = TablaDetalle.getRowCount()-1;
       for (int i=0;i<=filas;i++)
       {
           asd=TablaDetalle.getValueAt(i,1).toString();
           if(Accesorio.getSelectedItem()==asd)
           {
             return false;
           }
         
       }
        return true;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        Borrar = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        Accesorio = new javax.swing.JComboBox();
        Estado_Accesorio = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        Estado_Compra = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        Fecha_Compra = new com.toedter.calendar.JDateChooser();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TablaDetalle = new javax.swing.JTable();
        idAccesorio = new javax.swing.JLabel();
        AgregarAccesorio = new javax.swing.JButton();
        LimpiarCampos = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        BuscarCliente = new javax.swing.JButton();
        codclie = new javax.swing.JLabel();
        Nombre_clie = new javax.swing.JTextField();
        ApellidP_clie = new javax.swing.JTextField();
        ApellidoM_clie = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        codaut = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        Marca_auto = new javax.swing.JTextField();
        Modelo_auto = new javax.swing.JTextField();
        Color_auto = new javax.swing.JTextField();
        Precio_auto = new javax.swing.JTextField();
        GuardarFactura = new javax.swing.JButton();
        SalirdelaVentana = new javax.swing.JButton();

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

        Borrar.setText("Borrar Registro");
        Borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BorrarActionPerformed(evt);
            }
        });
        jPopupMenu1.add(Borrar);

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Ingresar Compra");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos de Factura", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP));

        Accesorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AccesorioActionPerformed(evt);
            }
        });

        Estado_Accesorio.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Pendiente" }));

        jLabel5.setText("Estado Compra :");

        Estado_Compra.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Pendiente" }));

        jLabel6.setText("Fecha Compra:");

        Fecha_Compra.setDateFormatString("yyyy-MMM-dd");

        jLabel7.setText("Estado:");

        jLabel3.setText("Accesorio:");

        TablaDetalle.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Accesorio", "Estado"
            }
        ));
        TablaDetalle.setComponentPopupMenu(jPopupMenu1);
        jScrollPane2.setViewportView(TablaDetalle);
        if (TablaDetalle.getColumnModel().getColumnCount() > 0) {
            TablaDetalle.getColumnModel().getColumn(0).setHeaderValue("Codigo");
            TablaDetalle.getColumnModel().getColumn(1).setHeaderValue("Accesorio");
            TablaDetalle.getColumnModel().getColumn(2).setHeaderValue("Estado");
        }

        AgregarAccesorio.setIcon(new javax.swing.ImageIcon("C:\\iconos\\add.png")); // NOI18N
        AgregarAccesorio.setText("Agregar");
        AgregarAccesorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarAccesorioActionPerformed(evt);
            }
        });

        LimpiarCampos.setIcon(new javax.swing.ImageIcon("C:\\iconos\\textfield_delete.png")); // NOI18N
        LimpiarCampos.setText("Limpiar");
        LimpiarCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimpiarCamposActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos del cliente"));

        jLabel1.setText("Nombre:");

        jLabel8.setText("Apellido Paterno:");

        jLabel10.setText("Apellido Materno:");

        BuscarCliente.setIcon(new javax.swing.ImageIcon("C:\\iconos\\table_tab_search.png")); // NOI18N
        BuscarCliente.setText("Buscar");
        BuscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(215, 215, 215)
                                .addComponent(codclie, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(ApellidoM_clie, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addGap(18, 18, 18)
                            .addComponent(ApellidP_clie, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Nombre_clie, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BuscarCliente)
                .addGap(51, 51, 51))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(codclie, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Nombre_clie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ApellidP_clie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(ApellidoM_clie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(BuscarCliente)
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos del Auto"));

        jButton3.setIcon(new javax.swing.ImageIcon("C:\\iconos\\table_tab_search.png")); // NOI18N
        jButton3.setText("Buscar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel2.setText("Marca:");

        jLabel12.setText("Modelo:");

        jLabel13.setText("Color:");

        jLabel14.setText("Precio:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(codaut, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Marca_auto))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(12, 12, 12)
                        .addComponent(Modelo_auto))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14))
                        .addGap(17, 17, 17)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Precio_auto)
                            .addComponent(Color_auto))))
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jButton3)
                .addContainerGap(235, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(codaut, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Marca_auto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(Modelo_auto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(Color_auto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(Precio_auto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(269, 269, 269)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(idAccesorio, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(71, 71, 71)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Estado_Accesorio, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Estado_Compra, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Fecha_Compra, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Accesorio, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LimpiarCampos)
                            .addComponent(AgregarAccesorio))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Accesorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Estado_Accesorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7))
                                .addGap(3, 3, 3))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(AgregarAccesorio)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(LimpiarCampos)
                                .addGap(14, 14, 14)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(idAccesorio, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(4, 4, 4)
                                        .addComponent(Fecha_Compra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addComponent(jLabel6)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(Estado_Compra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(8, 8, 8))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        GuardarFactura.setIcon(new javax.swing.ImageIcon("C:\\iconos\\database_save.png")); // NOI18N
        GuardarFactura.setText("Guardar");
        GuardarFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarFacturaActionPerformed(evt);
            }
        });

        SalirdelaVentana.setIcon(new javax.swing.ImageIcon("C:\\iconos\\door_out.png")); // NOI18N
        SalirdelaVentana.setText("Salir");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(353, 353, 353)
                .addComponent(GuardarFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SalirdelaVentana, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 52, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(GuardarFactura)
                    .addComponent(SalirdelaVentana))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BuscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarClienteActionPerformed
       ListadoCliente lc = new ListadoCliente();
       Vendedor.EscritorioVendedor.add(lc);
       lc.show();
    }//GEN-LAST:event_BuscarClienteActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       ListadoAutos la = new ListadoAutos();
       Vendedor.EscritorioVendedor.add(la);
       la.show();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void AgregarAccesorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarAccesorioActionPerformed
        if(ValidarAccesorio()==true)
        {
            if(ValidarCantidadAccesorios()==false)
            {
        DefaultTableModel modelo=(DefaultTableModel) TablaDetalle.getModel();
        Object [] fila=new Object[3];
            fila[0]=idAccesorio.getText(); 
            fila[1]=Accesorio.getSelectedItem();
            fila[2]=Estado_Accesorio.getSelectedItem();
            modelo.addRow(fila); 
            TablaDetalle.setModel(modelo);
            }else 
            { 
               JOptionPane.showMessageDialog(null,"Ya tienes 2 accesorios ingresados","ATENCION",JOptionPane.WARNING_MESSAGE); 
            }
        }else
        {
           JOptionPane.showMessageDialog(null,"No puedes Agregar 2 veces el mismo accesrio intenta nuevamente con otro","ATENCION",JOptionPane.WARNING_MESSAGE);
        }
        
    }//GEN-LAST:event_AgregarAccesorioActionPerformed

    private void AccesorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AccesorioActionPerformed
         try
         {
             conectar1 cc = new conectar1();
             Connection cn = cc.conexion();
             Statement st = cn.createStatement();
             ResultSet rs = st.executeQuery("select * from accesorios where descripcion ='"+Accesorio.getSelectedItem()+"'");
             rs.next();
             idAccesorio.setText(String.valueOf(rs.getInt("codigo")));
             
         }catch(Exception e)
         {
          JOptionPane.showMessageDialog(null,e);         
         }
    }//GEN-LAST:event_AccesorioActionPerformed

    private void GuardarFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarFacturaActionPerformed
    
             factura fa = new factura();
             Calendar cal;
             int d,m,a;
             cal=Fecha_Compra.getCalendar();
             d=cal.get(Calendar.DAY_OF_MONTH);
             m=cal.get(Calendar.MONTH);
             a=cal.get(Calendar.YEAR)-1900;
             fa.setFecha_compra(new Date(a,m,d));
             fa.setCod_auto(Integer.parseInt(codaut.getText()));
             fa.setCod_cliente(Integer.parseInt(codclie.getText()));
             fa.setEstadoCompra(Estado_Compra.getSelectedItem().toString());
             DefaultTableModel modelo = (DefaultTableModel)TablaDetalle.getModel();
             int filas = TablaDetalle.getRowCount();
             if(filas>0)
             {
             acc1=Integer.parseInt(TablaDetalle.getValueAt(0,0).toString());
             accestado=TablaDetalle.getValueAt(0,2).toString();
             
                 fa.setAcc1(acc1);
                 fa.setEstadoAccesorio(accestado);
             
              if(filas>1)
              {
               acc2=Integer.parseInt(TablaDetalle.getValueAt(1,0).toString());
               accestado2=TablaDetalle.getValueAt(1,2).toString();
               fa.setAcc2(acc2);
               fa.setEstadoAccesorio2(accestado2);
              }     
            
             
            
             }
   
           if(filas<2)
           {
           int resp = JOptionPane.showConfirmDialog(null,""
                     + "\nCodigo Cliente: "+fa.getCod_cliente()
                     + "\nCodigo Automovil: "+fa.getCod_auto()
                     + "\nAccesorio 1: "+fa.getAcc1()
                     + "\nEstado Accesorio 1: "+fa.getEstadoAccesorio()
                     + "\nEstado Compra: "+fa.getEstadoCompra()
                     + "\nFecha Compra: "+fa.getFecha_compra(),"Ingreso de Nueva Facturación", JOptionPane.YES_NO_OPTION);
             if (JOptionPane.OK_OPTION == resp)
             {
                fa.ingresarCompra();
             }else
             {
                 
             }
           }else
           {
           int resp = JOptionPane.showConfirmDialog(null,"¿Deseas guardar esta factura?"
                     + "\n\nCodigo Cliente: "+fa.getCod_cliente()
                     + "\nCodigo Automovil: "+fa.getCod_auto()
                     + "\nAccesorio 1: "+fa.getAcc1()
                     + "\nEstado Accesorio 1: "+fa.getEstadoAccesorio()
                     + "\nAccesorio 2: "+fa.getAcc2()
                     + "\nEstado Accesorio 2: "+fa.getEstadoAccesorio2()       
                     + "\nEstado Compra: "+fa.getEstadoCompra()
                     + "\nFecha Compra: "+fa.getFecha_compra(),"Ingreso de Nueva Facturación", JOptionPane.YES_NO_OPTION);
             if (JOptionPane.OK_OPTION == resp)
             {
                fa.ingresarCompra();
             }else
             {
                 
             }
           }
               
    }//GEN-LAST:event_GuardarFacturaActionPerformed

    private void LimpiarCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimpiarCamposActionPerformed
//        limpiar();
    }//GEN-LAST:event_LimpiarCamposActionPerformed

    private void BorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BorrarActionPerformed
       int resp =JOptionPane.showConfirmDialog(null,"¿Realmente desea eliminar este Accesorio de su lista?","Eliminar Accesorio", JOptionPane.YES_NO_OPTION);
       if (JOptionPane.OK_OPTION == resp)
             {
               DefaultTableModel modelo = (DefaultTableModel)TablaDetalle.getModel(); 
                modelo.removeRow(TablaDetalle.getSelectedRow()); 
             }else
             {
                 
             }

            
       
    }//GEN-LAST:event_BorrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JComboBox Accesorio;
    private javax.swing.JButton AgregarAccesorio;
    public static javax.swing.JTextField ApellidP_clie;
    public static javax.swing.JTextField ApellidoM_clie;
    private javax.swing.JMenuItem Borrar;
    private javax.swing.JButton BuscarCliente;
    public static javax.swing.JTextField Color_auto;
    public static javax.swing.JComboBox Estado_Accesorio;
    public static javax.swing.JComboBox Estado_Compra;
    private com.toedter.calendar.JDateChooser Fecha_Compra;
    private javax.swing.JButton GuardarFactura;
    private javax.swing.JButton LimpiarCampos;
    public static javax.swing.JTextField Marca_auto;
    public static javax.swing.JTextField Modelo_auto;
    public static javax.swing.JTextField Nombre_clie;
    public static javax.swing.JTextField Precio_auto;
    private javax.swing.JButton SalirdelaVentana;
    public static javax.swing.JTable TablaDetalle;
    public static javax.swing.JLabel codaut;
    public static javax.swing.JLabel codclie;
    public static javax.swing.JLabel idAccesorio;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
