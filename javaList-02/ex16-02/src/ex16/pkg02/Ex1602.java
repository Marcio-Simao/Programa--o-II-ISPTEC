/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex16.pkg02;
import java.util.Scanner;
/**
 *
 * @author LENOVO
 */
public class Ex1602 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int I; 
        Double A, B, C; 
        
        System.out.print("I: ");
        I = input.nextInt();
        
        System.out.print("A: ");
        A = input.nextDouble();
        
        System.out.print("B: ");
        B = input.nextDouble();
        
        System.out.print("C: ");
        C = input.nextDouble();
        
        if(I == 1)
        {
            if(A > B && A > C)
            {
                if(B > C)
                {
                    System.out.println(A+" "+B+" "+C);
                }else{
                    System.out.println(A+" "+C+" "+B);
                }
            }else{
                if(B > A && B > C)
                {
                    if(A > C)
                    {
                        System.out.println(B+" "+A+" "+C);
                    }else{
                        System.out.println(B+" "+C+" "+A);
                    }
                }else{
                    if(A > B)
                    {
                        System.out.println(C+" "+A+" "+B);
                    }else{
                        System.out.println(C+" "+B+" "+A);
                    }
                }
            }
        }else{
            if(I == 2)
            {
                if(A > B && A > C)
                {
                    if(B > C)
                    {
                        System.out.println(C+" "+B+" "+A);
                    }else{
                        System.out.println(B+" "+C+" "+A);
                    }
                }else{
                    if(B > A && B > C)
                    {
                        if(A > C)
                        {
                            System.out.println(C+" "+A+" "+B);
                        }else{
                            System.out.println(A+" "+C+" "+B);
                        }
                    }else{
                        if(A > B)
                        {
                            System.out.println(B+" "+A+" "+C);
                        }else{
                            System.out.println(A+" "+B+" "+C);
                        }
                    }
                }
            }else{
                if(I == 3)
                {
                    if(A > B && A > C)
                    {
                        if(B > C)
                        {
                            System.out.println(C+" "+B+" "+A);
                        }else{
                            System.out.println(B+" "+C+" "+A);
                        }
                    }else{
                        if(B > A && B > C)
                        {
                            if(A > C)
                            {
                                System.out.println(C+" "+A+" "+B);
                            }else{
                                System.out.println(A+" "+C+" "+B);
                            }
                        }else{
                            if(A > B)
                            {
                                System.out.println(B+" "+A+" "+C);
                            }else{
                                System.out.println(A+" "+B+" "+C);
                            }
                        }
                    }
                }else{
                    System.out.println("Valor invalido!");
                }
            }            
        }
        
    }
}
