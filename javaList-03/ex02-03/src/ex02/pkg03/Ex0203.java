/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex02.pkg03;
import java.util.Scanner;
/**
 *
 * @author LENOVO
 */
public class Ex0203 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        int value = 2;
        
        do{
            if(value == 2 || value == 6)
            {
                System.out.println("*");
            }else{
                if(value == 3 || value == 9 || value == 10)
                {
                    System.out.print(value + " ");
                }else{
                    System.out.print(value * 2 + " ");
                }
            }
            value++;
        }while(value < 10);   
    }
    
}
