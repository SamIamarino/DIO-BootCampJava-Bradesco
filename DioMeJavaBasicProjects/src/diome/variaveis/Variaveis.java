/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package diome.variaveis;

/**
 *
 * @author Samuel Iamarino
 */
public class Variaveis {
    public static void main(String[] args) {
        
        String meuNome = "Samuel Ferla Iamarino";
        System.out.println("Meu nome é: " + meuNome);
        
        double salarioMinimo = 2500.33;
        double salarioMinimo2 = 2500;
        
        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        
        //Casting
        short numeroCurto2 = (short) numeroNormal;
        
        
        //Variavel que pode ser alterada.
        int numero1 = 1;
        numero1 = 2;
        
        System.out.println(numero1);
        
        
        //Variaveis que nao pode ser alterada.
        final double VALOR_DE_PI = 3.14;
        
        System.out.println(VALOR_DE_PI);
        
    }
}
