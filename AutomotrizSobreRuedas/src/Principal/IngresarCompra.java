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
import javax.swing.JOptionPane;

/**
 *
 * @author Imacosx
 */
public class IngresarCompra extends javax.swing.JInternalFrame {

    /**
     * Creates new form IngresarCompra
     */
    public IngresarCompra() {
        initComponents();
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Accesorio1 = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        Accesorio2 = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        estado1 = new javax.swing.JComboBox();
        estado2 = new javax.swing.JComboBox();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        cod_cliente = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        cod_Auto = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Ingresar Compra");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ingresar Compra", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        jLabel1.setText("Fecha de Compra:");

        jLabel2.setText("Codigo Cliente:");

        jLabel3.setText("Codigo del Auto:");

        jLabel4.setText("Accesorio 1:");

        Accesorio1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione", "Llantas de aleacion", "Barras porta equipaje", "Luces de neon", "Neblineros", "Funda asientos", "Escape resonador", "Sin accesorios" }));
        Accesorio1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Accesorio1ActionPerformed(evt);
            }
        });

        jLabel5.setText("Accesorio 2:");

        Accesorio2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione", "Llantas de aleacion", "Barras porta equipaje", "Luces de neon", "Neblineros", "Funda asientos", "Escape resonador", "Sin accesorios" }));
        Accesorio2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Accesorio2ActionPerformed(evt);
            }
        });

        jLabel6.setText("Estado:");

        jLabel7.setText("Estado:");

        estado1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione", "Pendiente", "Instalado", "Sin estado" }));
        estado1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estado1ActionPerformed(evt);
            }
        });

        estado2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione", "Pendiente", "Instalado", "Sin estado" }));
        estado2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estado2ActionPerformed(evt);
            }
        });

        jButton4.setText("Buscar Cliente");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Buscar Auto");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Accesorio1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Accesorio2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGap(29, 29, 29)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(estado1, 0, 122, Short.MAX_VALUE)
                            .addComponent(estado2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cod_cliente))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cod_Auto, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton4)
                            .addComponent(jButton5))))
                .addGap(226, 226, 226))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cod_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(cod_Auto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jButton5)))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(Accesorio1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(estado1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(Accesorio2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(estado2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(63, Short.MAX_VALUE))
        );

        jButton1.setText("Ingresar Compra");

        jButton2.setText("Reestablecer ");

        jButton3.setText("Salir");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(133, 133, 133)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
          ListadoCliente lc = new ListadoCliente();
        Component add = Vendedor.EscritorioVendedor.add(lc);
       lc.show();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
       ListadoAutos la = new ListadoAutos();
        Component add = Vendedor.EscritorioVendedor.add(la);
       la.show();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void Accesorio1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Accesorio1ActionPerformed
        conectar1 cc = new conectar1();
     Connection cn = cc.conexion();
     try
     {
         Statement st = cn.createStatement();
          ResultSet rs = st.executeQuery("select * from accesorios");
        while(rs.next())
        {
        if(Accesorio1.getSelectedItem().equals("Seleccione"))
         { 
             estado1.setSelectedItem("Seleccione");
      }else if(Accesorio1.getSelectedItem().equals(rs.getString("CODIGO_AUTO")))
      {
          estado1.setSelectedItem("Pendiente");
      }else if(Accesorio1.getSelectedItem().equals("Barras porta equipaje"))
      {
          estado1.setSelectedItem("Pendiente");
      }else if(Accesorio1.getSelectedItem().equals("Luces de neon"))
      {
          estado1.setSelectedItem("Pendiente");

      }else if(Accesorio1.getSelectedItem().equals("Neblineros"))
      {
         estado1.setSelectedItem("Pendiente");
      }else if(Accesorio1.getSelectedItem().equals("Funda asientos"))
      {
          estado1.setSelectedItem("Pendiente");
      }else if(Accesorio1.getSelectedItem().equals("Escape resonador"))
      {
          estado1.setSelectedItem("Pendiente");
      }else if(Accesorio1.getSelectedItem().equals("Sin accesorios"))
          estado1.setSelectedItem("Sin estado");
         Accesorio2.setSelectedItem("Sin accesorios");
          estado2.setSelectedItem("Sin estado");
        }
     }catch(SQLException ex)
     {
          
     }
    }//GEN-LAST:event_Accesorio1ActionPerformed

    private void estado1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estado1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_estado1ActionPerformed

    private void estado2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estado2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_estado2ActionPerformed

    private void Accesorio2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Accesorio2ActionPerformed

        if(Accesorio1.getSelectedItem().equals("Seleccione"))
         { 
             estado1.setSelectedItem("Seleccione");
      }else if(Accesorio1.getSelectedItem().equals("Llantas de aleacion")&&(Accesorio2.getSelectedItem().equals("Llantas de aleacion")))
      {
         JOptionPane.showMessageDialog(null,"No puede Elegir el mismo accesorio","ERROR",JOptionPane.ERROR_MESSAGE);
         Accesorio2.setSelectedIndex(0);
         estado2.setSelectedIndex(0);
      }else
      {
           estado2.setSelectedItem("Pendiente");
      }
          if(Accesorio1.getSelectedItem().equals("Barras porta equipaje")&&(Accesorio2.getSelectedItem().equals("Barras porta equipaje")))
      {
         JOptionPane.showMessageDialog(null,"No puede Elegir el mismo accesorio","ERROR",JOptionPane.ERROR_MESSAGE);
         Accesorio2.setSelectedIndex(0);
         estado2.setSelectedIndex(0);
      }else
      {
           estado2.setSelectedItem("Pendiente");
      }
          if(Accesorio1.getSelectedItem().equals("Luces de neon")&&(Accesorio2.getSelectedItem().equals("Luces de neon")))
      {
         JOptionPane.showMessageDialog(null,"No puede Elegir el mismo accesorio","ERROR",JOptionPane.ERROR_MESSAGE);
        Accesorio2.setSelectedIndex(0);
         estado2.setSelectedIndex(0);
      }else
      {
           estado2.setSelectedItem("Pendiente");
      }
          if(Accesorio1.getSelectedItem().equals("Neblineros")&&(Accesorio2.getSelectedItem().equals("Neblineros")))
      {
         JOptionPane.showMessageDialog(null,"No puede Elegir el mismo accesorio","ERROR",JOptionPane.ERROR_MESSAGE);
         Accesorio2.setSelectedIndex(0);
         estado2.setSelectedIndex(0);
      }else
      {
           estado2.setSelectedItem("Pendiente");
      }
          if(Accesorio1.getSelectedItem().equals("Funda asientos")&&(Accesorio2.getSelectedItem().equals("Funda asientos")))
      {
         JOptionPane.showMessageDialog(null,"No puede Elegir el mismo accesorio","ERROR",JOptionPane.ERROR_MESSAGE);
        Accesorio2.setSelectedIndex(0);
         estado2.setSelectedIndex(0);
      }else
      {
           estado2.setSelectedItem("Pendiente");
      }
          if(Accesorio1.getSelectedItem().equals("Escape resonador")&&(Accesorio2.getSelectedItem().equals("Escape resonador")))
      {
         JOptionPane.showMessageDialog(null,"No puede Elegir el mismo accesorio","ERROR",JOptionPane.ERROR_MESSAGE);
       Accesorio2.setSelectedIndex(0);
         estado2.setSelectedIndex(0);

      }else
      {
           estado2.setSelectedItem("Pendiente");
      }
    }//GEN-LAST:event_Accesorio2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JComboBox Accesorio1;
    public static javax.swing.JComboBox Accesorio2;
    public static javax.swing.JTextField cod_Auto;
    public static javax.swing.JTextField cod_cliente;
    public static javax.swing.JComboBox estado1;
    public static javax.swing.JComboBox estado2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    public static javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
