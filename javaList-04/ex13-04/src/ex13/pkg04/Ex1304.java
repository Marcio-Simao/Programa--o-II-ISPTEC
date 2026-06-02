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

    public static void preenVetor(char a){
        Scanner input = new Scanner(System.in);
        
        for(int i = 0; i < 2; i++){
            
            System.out.print("Digite letra: ");
            
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> alfa = new ArrayList<>();
        String letra;
        String[] vetor1 = new String[2];
        String[] vetor2 = new String[2];
        String[] vetor3 = new String[2];
        String[] vetor4 = new String[2];
        String[] vetor5 = new String[2];
        
        System.out.println("Array 1");
        for(int i = 0; i < 2; i++){
            
            System.out.print("Digite a "+ ( i + 1 ) +"º letra: ");
            vetor1[i] = input.nextLine(); 
            alfa.add(vetor1[i]);
        }
        
        System.out.println("Array 2");
        for(int i = 0; i < 2; i++){
            
           System.out.print("Digite a "+ ( i + 1 ) +"º letra: ");
            vetor2[i] = input.nextLine();
            alfa.add(vetor2[i]);
        }
        System.out.println("Array 3");
        for(int i = 0; i < 2; i++){
            
            System.out.print("Digite a "+ ( i + 1 ) +"º letra: ");
            vetor3[i] = input.nextLine();
            alfa.add(vetor3[i]);
        }
        System.out.println("Array 4");
        for(int i = 0; i < 2; i++){
            
            System.out.print("Digite a "+( i + 1 )+"º letra: ");
            vetor4[i] = input.nextLine();
            alfa.add(vetor4[i]);
        }
        System.out.println("Array 5");
        for(int i = 0; i < 2; i++){
            
            System.out.print("Digite a "+ ( i + 1 ) +"º letra: ");
            vetor5[i] = input.nextLine();
            alfa.add(vetor5[i]);
        }
        
        System.out.print(alfa);
        System.out.print("Digite uma letra: ");
        letra = input.nextLine();
        
    }
    
}
