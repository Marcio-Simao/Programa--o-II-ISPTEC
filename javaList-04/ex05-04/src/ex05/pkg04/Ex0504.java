/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex05.pkg04;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author LENOVO
 */
public class Ex0504 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int [] num = new int[30];
        Random ale = new Random();
        
        for(int i = 0; i < 30; i++ )
        {
            num[i] = ale.nextInt((10 - 1) + 1) + 1; 
        }
        System.out.println("Olá Lua");
    }
    
}
