/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex15.pkg02;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Ex1502 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        int show, quantBil;
        
        System.out.print("Quantidade de bilhetes: ");
        quantBil = input.nextInt();
        //input.nextInt();
        
        System.out.println("S H O W ' S");
        System.out.print("[1] - Tao Tui");
        System.out.print("[2] - Mini Band e os Amigos");
        System.out.print("[3] - Kalê");
        System.out.print("[4] - Raio de Luz");
        show = input.nextInt();
        
        switch(show)
        {
            case 1:
                
               System.out.println("Valor a ser pago: "+ quantBil * 15000);
               System.out.println("Data: 03/04/2023 " + "Hora: 21:00");
            break;
            case 2:
               System.out.println("Valor a ser pago: "+ quantBil * 3500);
               System.out.println("Data: 04/04/2023 " + "Hora: 17:00 ");
            break;
            case 3:
               System.out.println("Valor a ser pago: "+ quantBil * 5000);
               System.out.println("Data: 12/04/2023 " + "Hora: 18:00"); 
            break;
            case 4:
               System.out.println("Valor a ser pago: "+ quantBil * 12000);
               System.out.println("Data: 14/04/2023 " + "Hora: 18:00"); 
            break;
            default :
                System.out.println("Este Show não existe!");
            break;        
        }   
    }
}
