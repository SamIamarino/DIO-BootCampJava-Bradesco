/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package diome.metodos;

/**
 *
 * @author Samuel Iamarino
 */
public class App {
    public static void main(String[] args) {
        SmartTv tv = new SmartTv();
        
        
        tv.setCanal(10);
        tv.setVolume(10);
        tv.setLigada(true);
        
        System.out.println("Canal: " + tv.getCanal());
        System.out.println("Volume: " + tv.getVolume());
        System.out.println("Esta ligada: " +  tv.isLigada());
        
        tv.aumentarCanal();
        tv.aumentarVolume();
        
        System.out.println("Canal: " + tv.getCanal());
        System.out.println("Volume: " + tv.getVolume());
    }
}
