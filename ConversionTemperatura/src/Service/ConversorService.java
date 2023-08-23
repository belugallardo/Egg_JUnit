/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidad.Conversor;
/*
 Conversión de Temperatura:
Crea una clase TemperatureConverter que convierta entre diferentes unidades de temperatura (por ejemplo, Celsius, Fahrenheit, Kelvin).
Escribe pruebas unitarias para asegurarte de que la conversión entre las diferentes unidades se realiza correctamente y produce los resultados esperados.
celcius a fahrenheit  f= cel * 1.8 +32
celcius a kelvin  c= k=cel +273.15

*/
/**
 *
 * @author belugallardo
 */
public class ConversorService {
    Conversor conv = new Conversor();
    
    public double convertirTemperatura(int cel, String str){
        double temp = 0;
        
        switch (str){
            case "f":
                    temp = (cel * 1.8 + 32);
                    break;
            case "k":
                   temp = (cel + 273.15);
                    break;
        }
                
        return temp;
    }
    
}
