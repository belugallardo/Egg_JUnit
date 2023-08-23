/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Validador;

/**
 *
 * @author belugallardo
 */
public class ValidadorServicio {

    Validador val = new Validador();

    public boolean esValido(String cont) {

        int cant = 8;
        boolean longitud = false;
        boolean carEsp = false;
        boolean may = false;

        if (cont.length() >= cant) {
            longitud = true;
        }

        for (int i = 0; i < cont.length(); i++) {
            char caracter = cont.charAt(i);
            if (caracter == '!' || caracter == '/' || caracter == '(') {
                carEsp = true;
                
            }
            if (Character.isUpperCase(caracter) ){
                may = true;
            }
        }
        return longitud && carEsp && may;
    }
}
