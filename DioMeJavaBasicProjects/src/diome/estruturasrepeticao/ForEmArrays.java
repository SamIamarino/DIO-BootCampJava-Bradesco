/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package diome.estruturasrepeticao;

/**
 *
 * @author Samuel Iamarino
 */
public class ForEmArrays {
    public static void main(String[] args) {
        String [] alunos = {"Samuel","Kleber","Cleiton","Josir"};
        
        for(int i = 0 ; i < alunos.length;i++){
            System.out.println("O aluno " + alunos[i] + " esta no indice " + i);
        }
    }
}
