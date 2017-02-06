/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin18;

import java.util.ArrayList;
import operacions.calculos;

/**
 *
 * @author acomesanavila
 */
public class Buzon {

    private Correo[] listaDeCorreos;

    public int numeroDeCorreos() {
        return listaDeCorreos.length;
    }

    public void añade(Correo c) {
        Correo[] arrayTemporal;
        if (listaDeCorreos != null) {
            arrayTemporal = new Correo[listaDeCorreos.length + 1];
        } else {
            arrayTemporal = new Correo[1];
        }
        for (int i = 0; i < arrayTemporal.length - 1; i++) {
            arrayTemporal[i] = new Correo(listaDeCorreos[i].Mensaje());
        }
        arrayTemporal[arrayTemporal.length - 1] = new Correo(c.Mensaje());

        listaDeCorreos = arrayTemporal.clone();
    }

    public boolean porLer() {
        boolean queda = false;
        for (int i = 0; i < listaDeCorreos.length; i++) {
            if ("No".equals(listaDeCorreos[i].FueLeido())) {
                queda = true;

            }
        }
        return queda;
    }

    public String amosaPrimerNoLeido() {
        int i = 0;
        while (i < listaDeCorreos.length && "Si".equals(listaDeCorreos[i].FueLeido())) {
            i++;
        }
        if (i < listaDeCorreos.length) {
            return listaDeCorreos[i].LeerCorreo();
        } else {
            return "No hay mensajes sin leer.";
        }
    }

    public String muestra(int k) {
        if (k < listaDeCorreos.length && k >= 0) {
            return listaDeCorreos[k].LeerCorreo();
        } else {
            return "fuera de rango.";
        }
    }

    public void elimina(int k) {
        if (k < listaDeCorreos.length && k >= 0) {
            Correo[] arrayTemporal = new Correo[listaDeCorreos.length - 1];

            for (int i = 0, iTemporal = 0; iTemporal < listaDeCorreos.length; iTemporal++) {
                if (iTemporal != k) {
                    arrayTemporal[i++] = new Correo(listaDeCorreos[iTemporal].Mensaje());
                }
            }

            listaDeCorreos = arrayTemporal.clone();
        }
    }
}
