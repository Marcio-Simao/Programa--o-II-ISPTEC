/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex06.pkg02;
import java.util.Scanner;
/**
 *
 * @author LENOVO
 */
public class Ex0602 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        String nome, sexo;
        Double valorCompra, valorDesc;
        
        System.out.println("A U R A B I N");
       
        System.out.print("Nome; ");
        nome = input.nextLine();
        
        System.out.print("sexo: ");
        sexo = input.nextLine();
        
        System.out.print("Valor das compras: ");
        valorCompra = input.nextDouble();
        
        if(sexo.equalsIgnoreCase("masculino"))
        {
            valorDesc = valorCompra + (0.05 * valorCompra);
            System.out.println("Valor das compras com desconto: "+ valorDesc);
        }
        else if(sexo.equalsIgnoreCase("femenino"))
        {
            valorDesc = valorCompra + (0.15 * valorCompra);
            System.out.println("Valor das compras com desconto: "+ valorDesc);
        }
        else
        {
            System.out.println("Valor invalido!");
        }     
        
        input.close();
    }
    
}
