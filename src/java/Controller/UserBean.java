/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;



public class UserBean {
     private int id;
     private String name;
     private String lastname;
     private String tipo;
     private String email;
     private String password;

    public UserBean(int id, String name, String lastname, String tipo, String email, String password) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.tipo = tipo;
        this.email = email;
        this.password = password;
    }

    public UserBean(String name, String lastname, String tipo, String email) {
        this.name = name;
        this.lastname = lastname;
        this.tipo = tipo;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

  
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
  
}
