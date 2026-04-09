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
        
        int p1, p2, p3, p4, p5;
        
        System.out.println("Telefonou para a vítima?");
        System.out.println("[1] - Sim");
        System.out.println("[0] - Não");
        System.out.print(">> ");
        p1 = input.nextInt();
        
        System.out.println("Esteve no local do crime?");
        System.out.println("[1] - Sim");
        System.out.println("[0] - Não");
        System.out.print(">> ");
        p2 = input.nextInt();
        
        System.out.println("Mora perto da vítima?");
        System.out.println("[1] - Sim");
        System.out.println("[0] - Não");
        System.out.print(">> ");
        p3 = input.nextInt();
        
        System.out.println("Devia para a vítima?");
        System.out.println("[1] - Sim");
        System.out.println("[0] - Não");
        System.out.print(">> ");
        p4 = input.nextInt();
        
        System.out.println("Já trabalhou com a vítima?");
        System.out.println("[1] - Sim");
        System.out.println("[0] - Não");
        System.out.print(">> ");
        p5 = input.nextInt();
        
        if( (p1 + p2 + p3 + p4 + p5) == 2)
        {
            System.out.println("Suspeito!");
            
        }else {
            if( (p1 + p2 + p3 + p4 + p5) == 3 || (p1 + p2 + p3 + p4 + p5) == 4 )
            {
                System.out.println("Cúmplice!");
                
            }else{
                if((p1 + p2 + p3 + p4 + p5) == 5){
                    System.out.println("Assassino!");
                }else{
                    System.out.println("Inocente!");
                }
            }
        }  
    }
}
