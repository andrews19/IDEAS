/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Connect {
    

    static String driver = "com.mysql.jdbc.Driver";
    static String url = "jdbc:mysql://localhost:8888/IdeasBD";
    static String login = "root";
    static String password = "root";


  
    // creamos un metodo de tipo Connection
  public static Connection Conexion()  {
        Connection cn = null;

        try {
            Class.forName(driver).newInstance();//Obtenmos el driver de mysql
            cn = DriverManager.getConnection(url, login, password);//Conectamos a nuestra Bd

        } catch (SQLException e) {

            System.out.println("Error al Conectar DB sql:" + e);

        } catch (Exception e) {
            System.out.println("Error al Conectar DB2:" + e);

        }

        return cn;
    }

}
