/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package diome.estruturasrepeticao;

import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author Samuel Iamarino
 */
public class While {
    public static void main(String[] args) {
        double mesada = 20.0;
        
        while(mesada > 0){
            double valorDoce = valorAleatorio();
            
            if(valorDoce > mesada){
                valorDoce = mesada;
            }
            
            System.out.println("Doce do valor: " + valorDoce + " Adicionando no carrinho");
            mesada = mesada - valorDoce;
        }
        System.out.println("Mesada: " + mesada);
        System.out.println("Joaozinho gastou td em doces :c");
        
    }
    
    private static double valorAleatorio(){
        return ThreadLocalRandom.current().nextDouble(2,8);
    }
}
