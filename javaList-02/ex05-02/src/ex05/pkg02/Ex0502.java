/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex05.pkg02;
import java.util.Scanner;
/**
 *
 * @author LENOVO
 */
public class Ex0502 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        double salarioMensal, salarioNovo;
        String desempenho;
        
        System.out.print("Salario mensal: ");
        salarioMensal = input.nextDouble(); 
        input.nextLine();
        
        System.out.println("Digite a Classificasão do funcionario(Excelente, Bom, Mau): ");
        desempenho = input.nextLine();
        
         switch (desempenho.toLowerCase()) {
            case "excelente" :  
                salarioNovo =  salarioMensal + ( 0.06 * salarioMensal );
                System.out.println("Salario novo: "+ salarioNovo);
            break;
            
            case "bom" :  
                salarioNovo =  salarioMensal + ( 0.04 * salarioMensal );
                System.out.println("Salario novo: "+ salarioNovo);
            break;
 
            case "mau" :  
                salarioNovo =  salarioMensal + ( 0.015 * salarioMensal );
                System.out.println("Salario novo: "+ salarioNovo);
            break;
            
            default :
                System.out.println("Valor invalido!");
        }        
        input.close();
    } 
}
