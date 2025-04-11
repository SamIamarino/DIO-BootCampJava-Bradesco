/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package diome.teminal;

/**
 *
 * @author Samuel Iamarino
 */
public class AboutMe {
    public static void main(String[] args) {
        String nome = args[0];
        String sobrenome = args[1];
        
        int idade = Integer.parseInt(args[2]);
        
        double altura = Double.parseDouble(args[3]);
        
        System.out.println("Ola meu nome eh: " + nome + " " + sobrenome);
        System.out.println("Minha idade eh: " + idade);
        System.out.println("Minha altura eh: " + altura);
       
    }
}
