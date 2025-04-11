/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package diome.contabanco;

import java.util.Scanner;
import java.util.Locale;
/**
 *
 * @author Samuel Iamarino
 */
public class ContaBanco {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in).useLocale(Locale.US);
        
        int numeroConta = 0;
        String agencia = "";
        String nomeCliente = "";
        double saldo = 0.0;
        
        System.out.println("Digite o numero da sua conta: ");
        numeroConta = teclado.nextInt();
        
        System.out.println("Digite o nome da sua agencia: ");
        agencia = teclado.next();
        
        System.out.println("Digite seu nome: ");
        nomeCliente = teclado.next();
        
        System.out.println("Digite seu saldo: ");
        saldo = teclado.nextDouble();
        
        System.out.println("Ola " + nomeCliente + ", obrigado por criar uma conta em nosso banco"
                + ", sua agencia eh " + agencia + ", conta " + numeroConta + " e seu saldo " + saldo + " ja esta disponivel.");
        
    }
}
