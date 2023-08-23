/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;
/*
Celsius, Fahrenheit, Kelvin
*/
/**
 *
 * @author belugallardo
 */
public class Conversor {
    private int temperaturaCelcius;

    public Conversor(int temperaturaCelcius) {
        this.temperaturaCelcius = temperaturaCelcius;
    }

    public Conversor() {
    }

    public int getTemperaturaCelcius() {
        return temperaturaCelcius;
    }

    public void setTemperaturaCelcius(int temperaturaCelcius) {
        this.temperaturaCelcius = temperaturaCelcius;
    }
    
    
}
