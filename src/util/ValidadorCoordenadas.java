/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

/**
 *
 * @author FrankluX
 */
public class ValidadorCoordenadas {
    public static boolean esValido(String input){
        return input.matches("^[A-Ja-j](1[0]|[1-9])$");
    }
    
    
}
