/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex08.pkg02;
import java.util.Scanner;
/**
 *
 * @author LENOVO
 */
public class Ex0802 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        double valorCasa, salarioComprador, prestaçãoMensal;
        int anosPagar;
        
        System.out.print("Digite o seu salário: ");
        salarioComprador = input.nextDouble();
        
        System.out.print("Digite o valor da casa: ");
        valorCasa = input.nextDouble();
        
        System.out.print("Digite quantos anos ele vai: ");
        anosPagar = input.nextInt();
        
        prestaçãoMensal = valorCasa / (anosPagar * 12);
        System.out.println("Prestação: "+ prestaçãoMensal);
        
        if(prestaçãoMensal > 0.3 * salarioComprador)
        {
            System.out.println("30% do salário: "+ 0.3 * salarioComprador);
            System.out.println("Empréstimo recusado!");
        } else{
            System.out.println("30% do salário: "+ 0.3 * salarioComprador);
            System.out.println("Empréstimo Aceito!");
        }    
    }
    
}
