/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package diome.condicionais;

/**
 *
 * @author Samuel Iamarino
 */
public class CondicionalEncadeada {
    public static void main(String[] args) {
        int nota = 10;
        
        if(nota>= 7){
            System.out.println("Aprovado");
        }else if(nota >= 5 && nota <7){
            System.out.println("Recuperacao");
        }else{
            System.out.println("Reprovado");
        }
    }
}
