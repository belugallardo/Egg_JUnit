/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadoradescuento;

import Servicio.CalculadoraServicio;

/**
 *
 * @author belugallardo
 */
public class CalculadoraDescuento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       CalculadoraServicio cs = new CalculadoraServicio();
       
       double resultado =  cs.calcularDescuento(100, 10);
        System.out.println(resultado);
       
       
    }
    
}
