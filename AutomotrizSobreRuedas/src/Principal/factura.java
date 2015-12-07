package Principal;

import Conectar.conectar1;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class factura {
          conectar1 cc = new conectar1();
            Connection con = cc.conexion();
    private String ingreso1acc = "insert into detalle_factura (compra,accesorio,estado) values (?,?,?)";
    private String ingreso2acc = "insert into detalle_factura (compra,accesorio,estado) values (?,?,?)";
    private String EstadoCompra,EstadoAccesorio,EstadoAccesorio2;
    private int cod_cliente, cod_auto, acc1,acc2;
    private Date fecha_compra;

    public factura(String EstadoCompra, String EstadoAccesorio, String EstadoAccesorio2, int cod_cliente, int cod_auto, int acc1, int acc2, Date fecha_compra) {
        this.EstadoCompra = EstadoCompra;
        this.EstadoAccesorio = EstadoAccesorio;
        this.EstadoAccesorio2 = EstadoAccesorio2;
        this.cod_cliente = cod_cliente;
        this.cod_auto = cod_auto;
        this.acc1 = acc1;
        this.acc2 = acc2;
        this.fecha_compra = fecha_compra;
    }

    public factura(String EstadoCompra, String EstadoAccesorio, int cod_cliente, int cod_auto, int acc1, Date fecha_compra) {
        this.EstadoCompra = EstadoCompra;
        this.EstadoAccesorio = EstadoAccesorio;
        this.cod_cliente = cod_cliente;
        this.cod_auto = cod_auto;
        this.acc1 = acc1;
        this.fecha_compra = fecha_compra;
    }
    public factura() {
    }

    public factura(String EstadoCompra, int cod_auto, Date fechacompra) {
        this.EstadoCompra = EstadoCompra;
        this.cod_auto = cod_auto;
        this.fecha_compra = fechacompra;
    }

    public String getEstadoCompra() {
        return EstadoCompra;
    }

    public void setEstadoCompra(String EstadoCompra) {
        this.EstadoCompra = EstadoCompra;
    }

    public int getCod_cliente() {
        return cod_cliente;
    }

    public void setCod_cliente(int cod_cliente) {
        this.cod_cliente = cod_cliente;
    }

    public int getCod_auto() {
        return cod_auto;
    }

    public void setCod_auto(int cod_auto) {
        this.cod_auto = cod_auto;
    }

    public int getAcc1() {
        return acc1;
    }

    public void setAcc1(int acc1) {
        this.acc1 = acc1;
    }


    public Date getFecha_compra() {
        return fecha_compra;
    }

    public void setFecha_compra(Date fecha_compra) {
        this.fecha_compra = fecha_compra;
    }
 public String getEstadoAccesorio2() {
        return EstadoAccesorio2;
    }

    public void setEstadoAccesorio2(String EstadoAccesorio2) {
        this.EstadoAccesorio2 = EstadoAccesorio2;
    }

    public factura(int acc2) {
        this.acc2 = acc2;
    }

    public int getAcc2() {
        return acc2;
    }

    public void setAcc2(int acc2) {
        this.acc2 = acc2;
    }
     
    public String getEstadoAccesorio() {
        return EstadoAccesorio;
    }

    public void setEstadoAccesorio(String EstadoAccesorio) {
        this.EstadoAccesorio = EstadoAccesorio;
    }
    public void ingresarCompra() {

    try {  
      
            int n2;
            if((getAcc1()!=0)&&(getAcc2()==0))
            {
                
            PreparedStatement pst = con.prepareStatement("insert into facturas (fecha_compra,cliente,auto,estado) values (?,?,?,?)",PreparedStatement.RETURN_GENERATED_KEYS);
            pst.setDate(1, new java.sql.Date(fecha_compra.getTime()));
            pst.setInt(2, cod_cliente);
            pst.setInt(3, cod_auto);
            pst.setString(4,EstadoCompra);
            pst.executeUpdate();
            ResultSet rs = pst.getGeneratedKeys();
            if (rs != null && rs.next()) {
            int llave = rs.getInt(1);    
            PreparedStatement pst2 = con.prepareStatement(ingreso1acc);
            pst2.setInt(1,llave);
            pst2.setInt(2,acc1);
            pst2.setString(3,EstadoAccesorio);
            pst2.executeUpdate();
            JOptionPane.showMessageDialog(null,"Venta Agregada con exito","Agregado con Exito",JOptionPane.INFORMATION_MESSAGE);
            }
            }else if((getAcc2()!=0)&&(getAcc1()!=0))
            {
            PreparedStatement pst5 = con.prepareStatement("insert into facturas (fecha_compra,cliente,auto,estado) values (?,?,?,?)",PreparedStatement.RETURN_GENERATED_KEYS);
            pst5.setDate(1, new java.sql.Date(fecha_compra.getTime()));
            pst5.setInt(2, cod_cliente);
            pst5.setInt(3, cod_auto);
            pst5.setString(4,EstadoCompra);
            pst5.executeUpdate();
            ResultSet rs = pst5.getGeneratedKeys();
            if (rs != null && rs.next()) {
            int llave = rs.getInt(1);  
              PreparedStatement pst3 = con.prepareStatement(ingreso1acc);
              pst3.setInt(1,llave);
              pst3.setInt(2,acc1);
              pst3.setString(3,EstadoAccesorio);
              pst3.executeUpdate();
               PreparedStatement pst4 = con.prepareStatement(ingreso2acc);
              pst4.setInt(1,llave);
              pst4.setInt(2,acc2);
              pst4.setString(3,EstadoAccesorio2);
              pst4.executeUpdate();
            JOptionPane.showMessageDialog(null,"Factura Ingresada con exito!","Agregado con Exito",JOptionPane.ERROR_MESSAGE);
            }
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(factura.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
