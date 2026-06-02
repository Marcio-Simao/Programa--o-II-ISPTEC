/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex13.pkg04;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author LENOVO
 */

public class Ex1304 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<char[]> lista = new ArrayList<>();
        char letra;
        char[] vetor1 = new char[2];
        char[] vetor2 = new char[2];
        char[] vetor3 = new char[2];
        char[] vetor4 = new char[2];
        char[] vetor5 = new char[2];
        
        System.out.println("Array 1");
        for(int i = 0; i < 2; i++){
            System.out.print("Digite a "+ ( i + 1 ) +"º letra: ");
            vetor1[i] = input.next().charAt(0); 
        }
        
        System.out.println("Array 2");
        for(int i = 0; i < 2; i++){
            
           System.out.print("Digite a "+ ( i + 1 ) +"º letra: ");
            vetor2[i] = input.next().charAt(0);
        }
        System.out.println("Array 3");
        for(int i = 0; i < 2; i++){
            
            System.out.print("Digite a "+ ( i + 1 ) +"º letra: ");
            vetor3[i] = input.next().charAt(0);
        }
        System.out.println("Array 4");
        for(int i = 0; i < 2; i++){
            System.out.print("Digite a "+( i + 1 )+"º letra: ");
            vetor4[i] = input.next().charAt(0);
        }
        System.out.println("Array 5");
        for(int i = 0; i < 2; i++){
            System.out.print("Digite a "+ ( i + 1 ) +"º letra: ");
            vetor5[i] = input.next().charAt(0);
        }
        lista.add(vetor1);
        lista.add(vetor2);
        lista.add(vetor3);
        lista.add(vetor4);
        lista.add(vetor5);
        System.out.print(lista);
        System.out.print("Digite uma letra: ");
        letra = input.next().charAt(0);
        
    }
    
}
