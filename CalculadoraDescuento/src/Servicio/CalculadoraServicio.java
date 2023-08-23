/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Calculadora;
/*
Crea una clase DiscountCalculator que calcule el descuento aplicado a un producto.
Escribe pruebas unitarias para verificar que el cálculo del descuento se realiza correctamente
para diferentes escenarios (por ejemplo, descuento del 10%, descuento máximo, sin descuento, etc.).
*/
/**
 *
 * @author belugallardo
 */
public class CalculadoraServicio {
    Calculadora cd = new Calculadora();
    
   
    
    public int calcularDescuento(int precio, int descuento){
       int desc = (precio * descuento) / 100;
       int total = precio - desc;
       return total;
    }
}
