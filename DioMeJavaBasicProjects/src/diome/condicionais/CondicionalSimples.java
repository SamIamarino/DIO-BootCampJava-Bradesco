/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package diome.condicionais;

/**
 *
 * @author Samuel Iamarino
 */
public class CondicionalSimples {
    public static void main(String[] args) {
        double saldo = 25.0;
        double valorSolicitado = 17.0;
        
        if(valorSolicitado < saldo){
            saldo = saldo - valorSolicitado;
        }
        
        System.out.println(saldo);
    }
}
