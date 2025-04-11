/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package diome.teminal;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Samuel Iamarino
 */
public class ScannerTeste {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Digite sua altura: ");
        double altura = teclado.nextDouble();
        
        System.out.println("Digite seu nome: ");
        String nome = teclado.nextLine();
        
        System.out.println("Digite seu sobrenome: ");
        String sobrenome = teclado.nextLine();
        
        System.out.println("Digite sua idade: ");
        int idade = teclado.nextInt();
        
        System.out.println(altura);
        System.out.println(nome);
        System.out.println(sobrenome);
        System.out.println(idade);
        
    }
}
