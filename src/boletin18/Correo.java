/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin18;

import operacions.calculos;

/**
 *
 * @author acomesanavila
 */
public class Correo {

    private String mensaje;
    private String leido;

    public Correo(String mensaje) {
        this.mensaje = mensaje;
        leido = "No";
    }

    public Correo() {
        
    } 

    public String LeerCorreo() {
        this.leido = "Si";
        return "Mensaje: " + this.mensaje;
    }

    public String FueLeido() {
        return this.leido;
    }


    public String Mensaje() {
        return this.mensaje;
    }
}
