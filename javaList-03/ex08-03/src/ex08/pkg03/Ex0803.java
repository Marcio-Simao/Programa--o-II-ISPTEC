/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex08.pkg03;
import java.util.Scanner;
/**
 *
 * @author LENOVO
 */
public class Ex0803 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int n, i = 0, cont = 0, soma = 0;
        
        System.out.print("Digite um número inteiro: ");
        n = input.nextInt();
      
        while(soma != n || soma < n)
        {
            if(cont % 2 != 0)
            {
                soma += cont;
            }
            cont++;
        }
        System.out.println(soma);
        if(soma == n)
        {
            System.out.println("O número "+ n +" é um número perfeito!");
        }else{
            System.out.println("O número "+ n +" não é um número perfeito!");
        }    
    }
    
}
