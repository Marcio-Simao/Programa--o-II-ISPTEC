/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex02;
import java.util.Scanner;
/**
 *
 * @author LENOVO
 */
public class Ex02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Casting Implícito (Automático do menor para o maior)
        int numInt = 100;
        double numDouble = numInt;
        System.out.println("Casting (int para double): "+numDouble);
    }
    
}
