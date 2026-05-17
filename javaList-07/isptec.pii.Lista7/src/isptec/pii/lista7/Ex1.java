/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package isptec.pii.lista7;
import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Ex1 {
   public static void taboada(){
        Scanner input = new Scanner(System.in);
        int num;
        System.out.print("Digite um número: ");
        num = input.nextInt();
        
        for(int i = 1; i < 12; i++){
            System.out.print(num + " X " + i + " = " + (num * i));
        }
    } 
}
