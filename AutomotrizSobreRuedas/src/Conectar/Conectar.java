
package Conectar;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conectar {
     static String db ="ejemplo";
    static String login="ppablo";
    static String password="Nicol.123";
    static String url="jdbc:derby://localhost:1527/"+db;

    
    Connection conn = null;
    
    public Conectar() 
    {
        try {
         Class.forName("org.apache.derby.jdbc.ClientDriver");
         conn = DriverManager.getConnection(url,login,password);
         if(conn != null)
         {
         System.out.println("Conexion a base de datos " + db + ". Lista!!!!");
         }
        
        }catch(SQLException e){
          System.out.println(e);
        }catch(ClassNotFoundException e)
                {
                System.out.println(e);
                }
    
    }
    public Connection getConnection(){
    return conn;
    }
    
    public void desconectar(){
    conn=null;
    }

}
