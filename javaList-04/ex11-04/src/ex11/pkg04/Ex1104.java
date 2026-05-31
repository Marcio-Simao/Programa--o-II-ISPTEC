/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex11.pkg04;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author LENOVO
 */
public class Ex1104 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random rand = new Random();
        ArrayList<Integer> numList = new ArrayList<>();
        
        for(int i = 0; i < 10; i++){
            int n;
            n = rand.nextInt(10);
            numList.add(n);
        }
        
        System.out.println(numList);
        
        
    }
    
}
