/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex01.pkg04;
import java.util.Scanner;
/**
 *
 * @author LENOVO
 */
public class Ex0104 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int [] num = new int[5];
        
        for(int i = 0; i < 5; i++)
        {
            System.out.print(i+" num: ");
            num[i] = input.nextInt();
        }
        for(int i = 0; i < 5; i++)
        {
            for(int j = 0; j < 5; j++)
            {
                if(( i != j) && (num[i] == num[j] ))
                {
                    System.out.println("yhe!");
                    System.out.println("i: "+ i);
                    System.out.println("j: "+ j);
                }else{
                    System.out.println(j+" num: "+ num[j]);
                }    
            }   
        }
    }
    
}
