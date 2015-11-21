/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import Conectar.conectar1;
import java.security.Principal;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Imacosx
 */
public class ListadoCliente extends javax.swing.JInternalFrame {

    /**
     * Creates new form ListadoAutos
     */
    public ListadoCliente() {
        initComponents();
        ListadoClientes();
    }
    public void ListadoClientes()
    {
        DefaultTableModel model;   
    String titulos[] = {"Codigo Cliente","Nombre","Apellido"};
    String registro[] = new String [3];
    
    String sql = "Select * from clientes ";
    model = new DefaultTableModel(null,titulos);
    
    
      conectar1 cc = new conectar1();
      Connection cn = cc.conexion();
      
    try{
        Statement st = cn.createStatement();
        ResultSet rs = st.executeQuery(sql);
        while(rs.next())
        {
          registro[0] = rs.getString("CODIGO_CLIENTE");
          registro[1] = rs.getString("NOMBRE");
          registro[2] = rs.getString("APELLIDO");
          model.addRow(registro);
          ListadodeClientes.setModel(model);
        }
    
    }catch(SQLException ex)
    {
        Logger.getLogger(ListadoCliente.class.getName()).log(Level.SEVERE,null,ex);
    
    }
    
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ListadodeClientes = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Lisado de Clientes");

        jLabel1.setText("Buscar :");

        ListadodeClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        ListadodeClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ListadodeClientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(ListadodeClientes);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ListadodeClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ListadodeClientesMouseClicked
        int fila = ListadodeClientes.getSelectedRow();
        try 
        {
          if(fila == -1)
          {
            JOptionPane.showMessageDialog(null,"Debe seleccionar un registro");
          }else
              IngresarCompra.cod_cliente.setText(ListadodeClientes.getValueAt(ListadodeClientes.getSelectedRow(),0).toString());
               dispose();
        }catch(Exception e)
        {
            
        }
    }//GEN-LAST:event_ListadodeClientesMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTable ListadodeClientes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
