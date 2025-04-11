/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package diome.metodos;

/**
 *
 * @author Samuel Iamarino
 */
public class SmartTv {
    private int canal;
    private int volume;
    private boolean ligada;
    
    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        this.canal = canal;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean isLigada() {
        return ligada;
    }

    public void setLigada(boolean ligada) {
        this.ligada = ligada;
    }
    
    public int aumentarCanal(){
        ++this.canal;
        
        System.out.println(this.canal);
        
        return this.canal;
    }
    
    public int diminuirCanal(){
        --this.canal;
        
        System.out.println(this.canal);
        
        return this.canal;
    }
    
    public int aumentarVolume(){
        ++this.volume;
        
        System.out.println(this.volume);
        
        return this.volume;
    }
    
    public int diminuirVolume(){
        --this.volume;
        
        System.out.println(this.volume);
        
        return this.volume;
    }
    
    
    
    
    
}
