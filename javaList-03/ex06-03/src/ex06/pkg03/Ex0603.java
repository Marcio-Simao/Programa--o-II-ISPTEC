/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex06.pkg03;
import java.util.Scanner;
/**
 *
 * @author LENOVO
 */
public class Ex0603 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        int n1, n2, soma1 = 0, soma2 = 0;
        
        System.out.print("Digite a 1º número: ");
        n1 = input.nextInt();
        
        System.out.print("Dgite o 2º número: ");
        n2 = input.nextInt();
        
        for(int i = 1; i < 1000; i++)
        {
            if(n1 % i == 0)
            {
                if(n1 != i)
                {
                    soma1 += i;
                }
            }
            if(n2 % i == 0)
            {
                if(n2 != i)
                {    
                    soma2 += i;
                }    
            }
        }
        if(soma2 == n1 && soma1 == n2)
        {
            System.out.println("São amigos!");
        }else{
            System.out.println("Não são amigos!");
        }    
        
    }
    
}
