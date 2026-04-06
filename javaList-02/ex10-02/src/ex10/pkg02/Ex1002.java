/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex10.pkg02;
import java.util.Scanner;
/**
 *
 * @author LENOVO
 */
public class Ex1002 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        int diasAluguer, tipoCarro;
        double km, precoDia, precoTot;
        
        System.out.print("quantos dias de aluguer: ");
        diasAluguer = input.nextInt();
        
        System.out.print("quantos Km foram percorridos: ");
        km = input.nextDouble();
        
        System.out.println("Tipo de carro");
        System.out.println("Popular - [1]");
        System.out.println("Luxo - [2]");
        System.out.print(">> ");
        tipoCarro = input.nextInt();
        
        switch(tipoCarro)
        {
            case 1: //Tipo de carro popular
                precoDia = diasAluguer * 25000;
                if((km >= 1) || (km <= 100))
                {
                    precoTot = precoDia + 500;
                    System.out.println("O valor a ser pago: "+ precoTot);
                }else{
                    if(km > 100)
                    {
                        precoTot = precoDia + 250;
                        System.out.println("O valor a ser pago: "+ precoTot);
                    }    
                }
            break;
            case 2: //Tipo de carro Luxo
                precoDia = diasAluguer * 45000;
                if((km >= 1) || (km <= 200))
                {
                    precoTot = precoDia + 850;
                    System.out.println("O valor a ser pago: "+ precoTot);
                }else{
                    if(km > 200)
                    {
                        precoTot = precoDia + 550;
                        System.out.println("O valor a ser pago: "+ precoTot);
                    }    
                }
            break;
            default:
                System.out.println("Valor Invalido!");
            break;       
        }   //kyb4   
                
    }
    
}
