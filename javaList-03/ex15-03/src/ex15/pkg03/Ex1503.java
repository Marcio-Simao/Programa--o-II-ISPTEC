/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex15.pkg03;
import java.util.Scanner;
/**
 *
 * @author LENOVO
 */
public class Ex1503 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        double H = 0; 
        for(double i = 1; i <= 10; i++)
        {
            if(i % 2 == 0)
            {
                H -= (i / (i*i) );
            }else{
                H += (i / (i*i));
            }
        }
        System.out.println(H);
    }
    
}
