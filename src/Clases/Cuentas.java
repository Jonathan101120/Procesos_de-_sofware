/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

public class Cuentas {
    private String user;
    private String pass;
    
    //Método constructor
    public Cuentas (String user, String pass){
        this.user=user;
        this.pass=pass;
    }
   
    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj.getClass() != getClass()) {
            return false;
        }
        Cuentas curso = (Cuentas) obj;
        return ((this.getUser().equals(curso.getUser()))&&(this.getPass().equals(curso.getPass())));
    }
 
}
