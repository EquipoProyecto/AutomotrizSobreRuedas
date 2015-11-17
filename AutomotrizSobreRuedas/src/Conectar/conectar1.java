/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conectar;
import java.sql.*;
import javax.swing.*;

public class conectar1 {
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
//      public static void main(String[] args) throws ClassNotFoundException, ServletException, SQLException 
//      {
//              try
//        {
//            Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/?user=servtinf_ppablo&password="); 
//            Statement   s = (Statement) conn.createStatement();
//            int result = s.executeUpdate("CREATE DATABASE databasename");
//        }
//
//
//        catch ( Exception e)
//        {
//            e.printStackTrace();
//        }
//  }
//
//    private static class ServletException extends Exception {
//
//        public ServletException() {
//        }
//    }

