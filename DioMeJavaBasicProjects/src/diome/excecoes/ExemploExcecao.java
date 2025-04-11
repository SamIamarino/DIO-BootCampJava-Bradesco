/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package diome.excecoes;

import java.text.NumberFormat;
import java.text.ParseException;

/**
 *
 * @author Samuel Iamarino
 */
public class ExemploExcecao {
    public static void main(String[] args) throws ParseException {
        try{
            
            Number valor = NumberFormat.getInstance().parse("a1.75");
            
        }catch(NumberFormatException e){
            
            e.printStackTrace();
            
        }
        
    }
   
}
