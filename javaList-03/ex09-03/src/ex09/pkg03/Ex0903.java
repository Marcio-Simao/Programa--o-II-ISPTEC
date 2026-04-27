/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex09.pkg03;
import java.util.Scanner;
import java.lang.Math;
/**
 *
 * @author LENOVO
 */
public class Ex0903 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        int X,N, f = 1, x, soma = 0;
        
        System.out.println("N deve ser par e maior que 1");
        System.out.print("N: ");
        N = input.nextInt();
        
        System.out.print("X: ");
        X = input.nextInt(); 
        
        if(N > 1 && N % 2 == 0){
           for(int i= 2; i <= N ; i++)
           {
               f = 1;
               for(int c = 1; c <= i; c++){
                   
                   f = f * c;
               }
              
               x = (int) Math.pow(X,i);
               
               soma = soma + ( ( x ) / f );
           }
        }else{
            System.out.println("Valores invalidos!");
            System.out.println("N deve ser par e maior que 1");
        }
        
        System.out.println("O valor de Cos é "+ (1 - soma) );
    }
}
