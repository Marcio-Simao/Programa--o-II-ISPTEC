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
        boolean test = false;
        
        for(int i = 0; i < 50; i++)
        {
            k[i] = random.nextInt((10 - 0) + 1) + 1; 
            System.out.println(k[i]);
        }
        
        for(int j = 0; j < 3; j++)
        {   
            
            for(int i = 2; i < 100; i++)
            {
                if(k[j] != i)
                {
                    if(k[j] % i == 0) 
                    {
                        //não é primo 
                        test = false;
                        System.out.println("nao e primo");
                    }   
                }
                  
            }
            if(test == true)
            {
                P.add(k[j]);
                System.out.println("e primo");
            }
        }
        System.out.println("---");
        System.out.println("P: "+ P);
        
    }
    
}
