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

    private String EstadoCompra,EstadoAccesorio;
    private int cod_cliente, cod_auto, acc1;
    private Date fecha_compra;

    public factura(String EstadoCompra, String EstadoAccesorio, int cod_cliente, int cod_auto, int acc1, Date fecha_compra) {
        this.EstadoCompra = EstadoCompra;
        this.EstadoAccesorio = EstadoAccesorio;
        this.cod_cliente = cod_cliente;
        this.cod_auto = cod_auto;
        this.acc1 = acc1;
        this.fecha_compra = fecha_compra;
    }

    public String getEstadoAccesorio() {
        return EstadoAccesorio;
    }

    public void setEstadoAccesorio(String EstadoAccesorio) {
        this.EstadoAccesorio = EstadoAccesorio;
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

    public void ingresarCompra() {

        try {
            conectar1 cc = new conectar1();
            Connection con = cc.conexion();
            int n2;
            PreparedStatement pst = con.prepareStatement("insert into facturas (fecha_compra,cliente,auto,estado) values (?,?,?,?)",PreparedStatement.RETURN_GENERATED_KEYS);
            pst.setDate(1, new java.sql.Date(fecha_compra.getTime()));
            pst.setInt(2, cod_cliente);
            pst.setInt(3, cod_auto);
            pst.setString(4,EstadoCompra);
            pst.executeUpdate();
            ResultSet rs = pst.getGeneratedKeys();
            if (rs != null && rs.next()) {
            int llave = rs.getInt(1);
            PreparedStatement pst2 = con.prepareStatement("insert into detalle_factura (compra,accesorio,estado) values (?,?,?)");
            pst2.setInt(1,llave);
            pst2.setInt(2,acc1);
            pst2.setString(3,EstadoAccesorio);
            pst2.executeUpdate();
            
            
            }
           /* if (n2 == 1) {
                PreparedStatement pst2 = con.prepareStatement("insert into detalle_factura (codigo,compra,accesorio,estado) select (codigo_factura) from facturas");

            }*/
            
        } catch (SQLException ex) {
            Logger.getLogger(factura.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
