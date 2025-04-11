/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package diome.excecoes;

/**
 *
 * @author Samuel Iamarino
 */
public class FormatadorCepExemplo {
    public static void main(String[] args) {
        
        
        try{
            String cepFormatado = formataCep("123123");
            System.out.println(cepFormatado);
        }catch(CepInvalidoException e){
            System.err.println("O cep nao corresponde com as regras de negocio.");
        }
    }
    
    private static String formataCep(String cep) throws CepInvalidoException{
        if(cep.length() <8){
            throw new CepInvalidoException();
        }
        return "193-700";
    }
}
