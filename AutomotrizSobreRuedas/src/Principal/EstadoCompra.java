
package Principal;

import Conectar.conectar1;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HECTOR
 */
public class EstadoCompra extends javax.swing.JInternalFrame {

   
    public EstadoCompra() {
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

        jLabel1 = new javax.swing.JLabel();
        cod = new javax.swing.JTextField();
        buscar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        nombre_auto = new javax.swing.JLabel();
        modelo_auto = new javax.swing.JLabel();
        color_auto = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        estado_compra = new javax.swing.JComboBox();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        accesorio1 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        Estado_accesorio = new javax.swing.JComboBox();
        modificar_c = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        nombre = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        accesorios = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        marcaa = new javax.swing.JLabel();
        modeloo = new javax.swing.JLabel();
        colorr = new javax.swing.JLabel();
        modifica_e = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        coda = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        estadoc = new javax.swing.JLabel();

        setClosable(true);
        setResizable(true);
        setTitle("Modificar Estado de Compra. AUTOMOTRÍZ SOBRE RUEDAS");

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel1.setText("Ingrese el Código de la compra:");

        buscar.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        buscar.setIcon(new javax.swing.ImageIcon("C:\\iconos\\table_tab_search.png")); // NOI18N
        buscar.setText("Buscar Código");
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("Datos del Vehículo:");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel3.setText("Marca:");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel4.setText("Modelo:");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel5.setText("Color:");

        nombre_auto.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N

        modelo_auto.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N

        color_auto.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel9.setText("Estado de la Compra:");

        estado_compra.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        estado_compra.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione...", "Pendiente", "Preparado", "Entegado" }));
        estado_compra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estado_compraActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel10.setText("Datos de Accesorios:");

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel11.setText("Nombre Accesorio:");

        accesorio1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N

        jLabel15.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel15.setText("Estado Accesorio:");

        Estado_accesorio.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        Estado_accesorio.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione...", "Pendiente", "Instalado" }));
        Estado_accesorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Estado_accesorioActionPerformed(evt);
            }
        });

        modificar_c.setIcon(new javax.swing.ImageIcon("C:\\iconos\\update.png")); // NOI18N
        modificar_c.setText("Modificar Compra");
        modificar_c.setEnabled(false);
        modificar_c.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificar_cActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setText("Datos Cliente:");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel7.setText("Nombre cliente:");

        nombre.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N

        accesorios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        accesorios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                accesoriosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(accesorios);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel8.setText("Lista de Accesorios:");

        marcaa.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N

        modeloo.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N

        colorr.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N

        modifica_e.setIcon(new javax.swing.ImageIcon("C:\\iconos\\update.png")); // NOI18N
        modifica_e.setText("Modificar Estado");
        modifica_e.setEnabled(false);
        modifica_e.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifica_eActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel12.setText("Código Accesorio:");

        coda.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N

        jLabel13.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel13.setText("Estado Actual de la Compra:");

        estadoc.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(339, 339, 339)
                        .addComponent(jLabel8))
                    .addComponent(jLabel6))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(accesorio1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addGap(51, 51, 51)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(modeloo, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(colorr, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(58, 58, 58)
                                        .addComponent(marcaa, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addComponent(cod, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel9)
                                            .addComponent(jLabel15))
                                        .addGap(2, 2, 2)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(estado_compra, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Estado_accesorio, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(30, 30, 30)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(modifica_e, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(modificar_c, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel13)
                                        .addGap(18, 18, 18)
                                        .addComponent(estadoc, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nombre_auto, javax.swing.GroupLayout.DEFAULT_SIZE, 9, Short.MAX_VALUE)
                                    .addComponent(modelo_auto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(color_auto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(20, 20, 20))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 721, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel10))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel12)
                        .addGap(18, 18, 18)
                        .addComponent(coda, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buscar))
                .addGap(26, 26, 26)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(nombre_auto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(marcaa, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(modelo_auto, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel9)
                                        .addComponent(estado_compra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(modificar_c)))
                                .addGap(28, 28, 28)
                                .addComponent(color_auto, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(colorr, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5)
                                    .addComponent(modeloo, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(45, 45, 45)
                                .addComponent(jLabel10)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addComponent(accesorio1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Estado_accesorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel15)
                                    .addComponent(modifica_e))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(coda, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(nombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(72, 72, 72))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(estadoc, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
       int codigo = Integer.parseInt(cod.getText());
        if (cod.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null,"Debe ingresar un código de compra para consultar","Advertencia",JOptionPane.WARNING_MESSAGE); 
        }
        
        else{ 
             DefaultTableModel model;
            String [] titulos = {"ID","Nombre Accesorio", "Estado de Accesorio"};
            String [] registros = new String[4];
            
            String sql="SELECT accesorios.descripcion,accesorios.codigo, detalle_factura.estado FROM accesorios INNER JOIN detalle_factura where detalle_factura.compra = '"+codigo+"' and detalle_factura.accesorio = accesorios.codigo";
            model = new DefaultTableModel(null,titulos);
            
            conectar1 cc= new conectar1();
            Connection cn =cc.conexion();
            
           try {  
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            while(rs.next()){
             registros[0]=rs.getString("accesorios.codigo");
             registros[1]=rs.getString("accesorios.descripcion");
             registros[2]=rs.getString("detalle_factura.estado");
             model.addRow(registros);
             accesorios.setModel(model);
             
             
             
             
            
            }
        } catch (SQLException ex) {
            Logger.getLogger(EstadoCompra.class.getName()).log(Level.SEVERE, null, ex);
        }
           
            String sql2="SELECT autos.marca, autos.modelo, autos.color, facturas.estado FROM facturas INNER JOIN autos where facturas.codigo_factura = '"+codigo+"' and facturas.auto = autos.codigo_auto";
            model = new DefaultTableModel(null,titulos);
            

            
            
           try {  
            Statement st = cn.createStatement();
            ResultSet rst = st.executeQuery(sql2);
            
            while(rst.next()){
             marcaa.setText(rst.getString("autos.marca")); 
             colorr.setText(rst.getString("autos.modelo"));
             modeloo.setText(rst.getString("autos.color"));
             estadoc.setText(rst.getString("facturas.estado"));
        
       
         }
           }catch (SQLException ex) {
            Logger.getLogger(EstadoCompra.class.getName()).log(Level.SEVERE, null, ex);
        }
           
           String sql3 = "SELECT clientes.nombre, clientes.apellido_p FROM facturas INNER JOIN clientes where facturas.codigo_factura = '"+codigo+"' and facturas.cliente = clientes.codigo_cliente";
           
           try {  
            Statement st = cn.createStatement();
            ResultSet rslt = st.executeQuery(sql3);
            
            while(rslt.next()){
             nombre.setText(rslt.getString("clientes.nombre") +" "+ rslt.getString("clientes.apellido_p")); 
             //app.setText(rslt.getString("clientes.apellido_p"));
        
       
         }
           }catch (SQLException ex) {
            Logger.getLogger(EstadoCompra.class.getName()).log(Level.SEVERE, null, ex);
        }
           
           
           
           
           
           
        }
    }//GEN-LAST:event_buscarActionPerformed

    private void accesoriosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_accesoriosMouseClicked
        int fila = accesorios.getSelectedRow();
        try {
        if(fila==-1)
            {
                JOptionPane.showMessageDialog(null,"Debe seleccionar un Accesorio","Advertencia",JOptionPane.WARNING_MESSAGE);
            }else{
         coda.setText(accesorios.getValueAt(accesorios.getSelectedRow(), 0).toString());
         accesorio1.setText(accesorios.getValueAt(accesorios.getSelectedRow(), 1).toString());
        
             }
        } catch (Exception e) {
      }
    }//GEN-LAST:event_accesoriosMouseClicked

    private void modificar_cActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificar_cActionPerformed
           if (cod.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null,"Debe ingresar un código de compra para modificar su estado.","Advertencia",JOptionPane.WARNING_MESSAGE); 
        }
        
           else{       
        try {
            conectar1 cc = new conectar1();
            Connection cn = cc.conexion();
            PreparedStatement pst = cn.prepareStatement("UPDATE facturas SET estado='"+estado_compra.getSelectedItem().toString()+"'WHERE codigo_factura='"+cod.getText()+"'");
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null,"Datos del la compra Actualizados!!");
            estado_compra.setSelectedIndex(0);
            
            String sql2="SELECT autos.marca, autos.modelo, autos.color, facturas.estado FROM facturas INNER JOIN autos where facturas.codigo_factura = '"+cod.getText()+"' and facturas.auto = autos.codigo_auto";
         
            Statement st = cn.createStatement();
            ResultSet rst = st.executeQuery(sql2);
            
            while(rst.next()){
             marcaa.setText(rst.getString("autos.marca")); 
             colorr.setText(rst.getString("autos.modelo"));
             modeloo.setText(rst.getString("autos.color"));
             estadoc.setText(rst.getString("facturas.estado"));
        
       
         }
           
            
            //        PreparedStatement pst = cn.prepareStatement(UPDATE ingresos SET tipo='"+t_tipo.getText()+"',marca='"+t_marca.getText()+"',modelo='"+t_modelo.getText()+"',serie='"+t_serie.getText()+"',problema='"+t_problema.getText()+"',estado='"+t_estado.getText()+"'");
            } catch (SQLException ex) {
                Logger.getLogger(EstadoCompra.class.getName()).log(Level.SEVERE, null, ex);
            }
           }
    }//GEN-LAST:event_modificar_cActionPerformed

    private void modifica_eActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifica_eActionPerformed

        if (accesorio1.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null,"Debe seleccionar un accesorio de tabla.","Advertencia",JOptionPane.WARNING_MESSAGE);
        }else{
        
        try {
            conectar1 cc = new conectar1();
            Connection cn = cc.conexion();
            PreparedStatement pst = cn.prepareStatement("UPDATE detalle_factura SET estado='"+Estado_accesorio.getSelectedItem().toString()+"'WHERE accesorio='"+coda.getText()+"'");
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null,"Datos del la compra Actualizados!!");
            
             DefaultTableModel model;
            String [] titulos = {"ID","Nombre Accesorio", "Estado de Accesorio"};
            String [] registros = new String[4];
            
            String sql="SELECT accesorios.descripcion,accesorios.codigo, detalle_factura.estado FROM accesorios INNER JOIN detalle_factura where detalle_factura.compra = '"+cod.getText()+"' and detalle_factura.accesorio = accesorios.codigo";
            model = new DefaultTableModel(null,titulos);
            
        
            
           try {  
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            while(rs.next()){
             registros[0]=rs.getString("accesorios.codigo");
             registros[1]=rs.getString("accesorios.descripcion");
             registros[2]=rs.getString("detalle_factura.estado");
             model.addRow(registros);
             accesorios.setModel(model);
             
             
             Estado_accesorio.setSelectedIndex(0);
             
            
            }
        }catch (SQLException ex) {
                Logger.getLogger(EstadoCompra.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
            //        PreparedStatement pst = cn.prepareStatement(UPDATE ingresos SET tipo='"+t_tipo.getText()+"',marca='"+t_marca.getText()+"',modelo='"+t_modelo.getText()+"',serie='"+t_serie.getText()+"',problema='"+t_problema.getText()+"',estado='"+t_estado.getText()+"'");
            } catch (SQLException ex) {
                Logger.getLogger(EstadoCompra.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_modifica_eActionPerformed

    private void estado_compraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estado_compraActionPerformed
        
        if(estado_compra.getSelectedItem().equals("Seleccione..."))
        {
          modificar_c.setEnabled(false);
        }
        else 
        {
            modificar_c.setEnabled(true);
        }
        
    }//GEN-LAST:event_estado_compraActionPerformed

    private void Estado_accesorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Estado_accesorioActionPerformed
        if(Estado_accesorio.getSelectedItem().equals("Seleccione..."))
        {
          modifica_e.setEnabled(false);
        }
        else 
        {
            modifica_e.setEnabled(true);
        }
        
    }//GEN-LAST:event_Estado_accesorioActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JComboBox Estado_accesorio;
    public static javax.swing.JLabel accesorio1;
    private javax.swing.JTable accesorios;
    private javax.swing.JButton buscar;
    private javax.swing.JTextField cod;
    private javax.swing.JLabel coda;
    public static javax.swing.JLabel color_auto;
    private javax.swing.JLabel colorr;
    public static javax.swing.JComboBox estado_compra;
    private javax.swing.JLabel estadoc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel marcaa;
    public static javax.swing.JLabel modelo_auto;
    private javax.swing.JLabel modeloo;
    private javax.swing.JButton modifica_e;
    private javax.swing.JButton modificar_c;
    public static javax.swing.JLabel nombre;
    public static javax.swing.JLabel nombre_auto;
    // End of variables declaration//GEN-END:variables
}
