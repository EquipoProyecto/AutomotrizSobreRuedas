
package Conectar;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

import java.sql.*;
import javax.swing.*;

public class Conectar {
  Connection connect = null;
  public Connection conexion()
  {
     try{
        Class.forName("com.mysql.jdbc.Driver");
        connect = DriverManager.getConnection("jdbc:mysql://consultashevaro.ddns.net/automotora","prueba","prueba1");
     }catch (Exception e)
     {
        JOptionPane.showMessageDialog(null,"Error"+e);
     }
      return connect;
  }

}
