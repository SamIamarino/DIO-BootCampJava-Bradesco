/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package diome.condicionais;

/**
 *
 * @author Samuel Iamarino
 */
public class SwitchCase {
    public static void main(String[] args) {
        String sigla = "M";
        
        switch (sigla) {
            case "P":
                System.out.println("Pequeno");
                break;
                
            case "M":
                System.out.println("Medio");
                break;
                
            case "G":
                System.out.println("Grande");
            default:
                System.out.println("Nenhum dos tamanhos foi escolhido");
        }
    }
}
