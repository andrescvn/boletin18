/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin18;

import javax.swing.JOptionPane;
import operacions.calculos;

/**
 *
 * @author acomesanavila
 */
public class Boletin18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Buzon bu = new Buzon();
        Correo co = new Correo();
        int p;
        do {
            p = Integer.parseInt(JOptionPane.showInputDialog("OPCIONES:\n1)Crear correo\n2) Numero de correos\n3) Primer correo sin leer\n4) Leer correo\n5) Quedan correos por leer?\n6) Eliminar correo\n7) Salir"));
            switch (p) {
                case 1:
                    bu.añade(new Correo(calculos.pedirString()));
                    break;
                case 2:
                    System.out.println("Tienes: " + bu.numeroDeCorreos() + " correos");
                    break;
                case 3:
                    System.out.println(bu.amosaPrimerNoLeido());
                    co.LeerCorreo();
                    break;
                case 4:
                    int leer = Integer.parseInt(JOptionPane.showInputDialog("Cual quieres ver?"));
                    System.out.println(bu.muestra(leer - 1));
                    break;
                case 5:
                    if (bu.porLer() == true) {
                        System.out.println("Quedan correos por leer");
                    } else {
                        System.out.println("No quedan");
                    }
                    break;
                case 6:
                    int elimina = Integer.parseInt(JOptionPane.showInputDialog("Cual quieres borrar?"));
                    bu.elimina(elimina - 1);
                    break;
            }
        } while (p != 7);

    }
}
