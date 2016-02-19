/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Controller.UserBean;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ACAMPOS
 */
public class CrudAdmin {
    
 static String query;


    static Statement stn = null;
    static ResultSet rst = null;
    
    public static List<UserBean> ConsultarUsuarios() {

         List<UserBean> Usuarios = new ArrayList<UserBean>();
 try {

     
            query = "SELECT * FROM  user ";

            Connection conexion = Connect.Conexion();
            if (conexion == null) {
                String mensaje = "No hay conexión a la base de datos...!";

            } else {
                stn = conexion.createStatement();
                rst = stn.executeQuery(query);
           
                while (rst.next()) {
                    UserBean user;
                    user = new UserBean(rst.getString("name"),rst.getString("lastname"),rst.getString("type"),rst.getString("email"));
                    Usuarios.add(user);
                }
                return Usuarios;
            }
        } catch (SQLException ex) {

        }
       return null;
     }
}
