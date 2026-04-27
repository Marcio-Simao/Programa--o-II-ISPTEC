/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aulaarry01;
import java.util.Scanner;
/**
 *
 * @author LENOVO
 */
public class Aulaarry01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        double [] valor = new double[20];
        int j = 9;
        for(int i = 0; i < 20; i++)
        {
            if(i < 9)
            {
                System.out.print(i+" VAlor: ");
                valor[i] = input.nextDouble();
            }else{
                valor[i] = valor[j];
                j--;
            }
        }
    }
    
}
