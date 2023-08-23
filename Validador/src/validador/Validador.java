/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validador;

import Servicio.ValidadorServicio;

/*
Validador de Contraseñas:
Crea una clase PasswordValidator que verifique la fortaleza de una contraseña según ciertas reglas (por ejemplo, longitud mínima, presencia de caracteres especiales, letras mayúsculas, etc.).
Escribe pruebas unitarias para asegurarte de que el validador de contraseñas funcione correctamente para diferentes escenarios, incluyendo contraseñas válidas e inválidas.
*/
/**
 *
 * @author belugallardo
 */
public class Validador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ValidadorServicio vs = new ValidadorServicio();
        
        vs.esValido("1gH!fetl");
        
    }
    
}
