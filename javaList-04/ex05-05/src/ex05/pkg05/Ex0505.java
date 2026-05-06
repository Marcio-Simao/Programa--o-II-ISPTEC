/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex05.pkg05;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author LENOVO
 */
public class Ex0505 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       ArrayList<String> nomes = new ArrayList<>();

        nomes.add("Ana");
        nomes.add("Carlos");
        nomes.add("Maria");

        System.out.println("Tamanho: "+ nomes.size());
        
        System.out.println("Lista: " + nomes);

        System.out.println("Primeiro nome: " + nomes.get(0));

        nomes.remove("Carlos");

        System.out.println("Lista atualizada: " + nomes);
        
    }
    
}
