/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex13.pkg03;
import java.util.Scanner;
/**
 *
 * @author LENOVO
 */
public class Ex1303 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        int num, num1, f = 1, ultimoDigito, soma = 0;
        
        System.out.print("Digite um número: ");
        num = input.nextInt();
        
        num1 = num;
        
        while(num != 0)
        {
            ultimoDigito = num % 10;
            num = num / 10;
            for(int i = ultimoDigito; i >= 1; i--)
            {
                f *= i; 
            }
            soma += f; 
            f = 1;
        }
        
        if(soma == num1)
        {
            System.out.println("O numero "+ num1 +" e um numero forte!");
        }else{
            System.out.println("O numero "+ num1 +" nao e um numero forte!");
        }
    }
    
}
