/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Scanner;
        
/**
 *
 * @author LENOVO
 */
public class ex03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        double salario, novoSalario, s = 100000;
        int numFaltas;
        
        System.out.print("Salário: ");
        salario = input.nextDouble();
        
        System.out.print("Número de faltas: ");
        numFaltas = input.nextInt();
        
        if(numFaltas == 0 && salario < s)
        {
            novoSalario = salario + (salario * 0.11);
            System.out.println("Novo Salário: "+ novoSalario);
        }else{
            if(numFaltas == 0 && salario >= s)
            {
                novoSalario = salario + (salario * 0.08);
                System.out.println("Novo Salário: "+ novoSalario);
            }else{
                System.out.println("O funcionario não recebera aumento!");
            }
        }
    }
    
}
