/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex12.pkg04;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;
/**
 *
 * @author LENOVO
 */
public class Ex1204 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        ArrayList<String> nomes = new ArrayList<>(); 
        int op = 0;
        do
        { 
            System.out.println("[1] - Adicionar Nomes");
            System.out.println("[0] - Não Adicionar");
            System.out.print(">> ");
            op = input.nextInt();
            input.nextLine();
            
            switch(op){
                case 0:
                    System.out.println("");
                break;
                case 1:
                    System.out.print("Nome: ");
                    String nome = input.nextLine();
                    nomes.add(nome);
                break;
                default :
                
                break;        
            }
            
        }  while(op != 0);  
        System.out.println(nomes);
        System.out.print("Digite um número: ");
        int num = input.nextInt();
        
        for(int i = nomes.size() - 1; i >= 0; i--){
            System.out.println(i);
            if((nomes.get(i)).length() < num){
               nomes.remove(i);
            }
        }
        System.out.println(nomes);
    }
    
}
