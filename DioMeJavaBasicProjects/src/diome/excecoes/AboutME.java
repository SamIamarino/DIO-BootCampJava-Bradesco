/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package diome.excecoes;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Samuel Iamarino
 */
public class AboutME {
    public static void main(String[] args) {
        
        try{

            Scanner teclado = new Scanner(System.in).useLocale(Locale.US);

            System.out.println("Digite seu nome: ");
            String nome = teclado.next();

            System.out.println("Digite seu sobrenome: ");
            String sobrenome = teclado.next();

            System.out.println("Digite sua idade: ");
            int idade = teclado.nextInt();

            System.out.println("Digite sua altura: ");
            double altura = teclado.nextDouble();
        
        }catch(InputMismatchException e){
            System.err.println("Os campos idade e altura precisam ser numericos.");
        }
    }
}
