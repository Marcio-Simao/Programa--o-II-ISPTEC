/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ipp_marciosimao;
import java.util.Scanner;
/**
 *
 * @author LENOVO
 */
public class IPP_MarcioSimao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // exercício 2
        Scanner input = new Scanner(System.in);
        
        int temp, hora, mim;
        
        System.out.print("Digite um número: ");
        temp = input.nextInt();
        
        hora = temp / 3600;
        mim = temp % 3600;
        System.out.println("Hora: "+ hora);
        System.out.println("mim: "+ mim);
        
        
        
        
    }
    
}
