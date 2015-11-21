
package Principal;

import Conectar.conectar1;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class persona {
 private String nom,apep,apem;

    public persona(String nom, String apep, String apem) {
        this.nom = nom;
        this.apep = apep;
        this.apem = apem;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getApep() {
        return apep;
    }

    public void setApep(String apep) {
        this.apep = apep;
    }

    public String getApem() {
        return apem;
    }

    public void setApem(String apem) {
        this.apem = apem;
    }
   
    public void AgregarCliente()
    {
     try {
         conectar1 cc = new conectar1();
         Connection con = cc.conexion();
         PreparedStatement pst = con.prepareStatement("insert into clientes (nombre,apellido_p,apellido_m) values (?,?,?)");
         pst.setString(1,nom);
         pst.setString(2,apep);
         pst.setString(3,apem);
         int n=pst.executeUpdate();
            if(n>0)
            {
                JOptionPane.showMessageDialog(null,"Equipo Guardado con Exito!!!");
            }
         
     } catch (SQLException ex) {
         Logger.getLogger(persona.class.getName()).log(Level.SEVERE, null, ex);
     }
       
    }
}
