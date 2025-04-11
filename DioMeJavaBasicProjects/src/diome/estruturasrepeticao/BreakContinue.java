/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package diome.estruturasrepeticao;

/**
 *
 * @author Samuel Iamarino
 */
public class BreakContinue {
    public static void main(String[] args) {
        for(int numero = 1; numero <= 5; numero++){
            if(numero == 3){
                continue;
            }else{
                System.out.println("Numero eh: " + numero);
            }
        }
    }
}
