/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package diome.estruturasrepeticao;

import java.util.Random;

/**
 *
 * @author Samuel Iamarino
 */
public class DoWhile {
    public static void main(String[] args) {
        System.out.println("Discando...");
        
        do{
            System.out.println("Telefone tocando...");
        }while( tocando() );
        
        System.out.println("Alo !!!");
    }
    
    private static boolean tocando(){
        boolean atendeu  = new Random().nextInt(3)==1;
        System.out.println("Atendeu? " + atendeu);
        
        return ! atendeu;
    }
    
}
