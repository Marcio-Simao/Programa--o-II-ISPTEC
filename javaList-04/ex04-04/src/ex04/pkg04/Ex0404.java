/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex04.pkg04;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;
import java.lang.Math;
/**
 *
 * @author LENOVO
 */
public class Ex0404 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        int[] k = new int[5];
        ArrayList<Integer> P = new ArrayList<Integer>();
        Random random = new Random(); 
        
        
        for(int i = 0; i < 5; i++)
        {
            k[i] = random.nextInt((100 - 1) + 1) + 1; 
        }
        
        for(int i = 2; i < 100; i++)
        {
            if((i > 2) && (i < Math.sqrt(k[i]) ) )
            {
                if(k[i] % i == 0) 
                {
                  //primo  
                } 
            }
        }
    }
    
}
