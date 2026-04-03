/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex03;
import java.util.Scanner;
/**
 *
 * @author LENOVO
 */
public class Ex03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // TODO code application logic here
   
        String nome;
        double nota1, nota2, nota3, media;
        
        System.out.println("I S P T E C");
        
        System.out.println("Nome do Aluno: ");
        nome = input.nextLine();
        System.out.println("Digite a primeira Nota: ");
        nota1 = input.nextDouble();
        System.out.println("Digite a segunda Nota: ");
        nota2 = input.nextDouble();
        System.out.println("Digite a Terceira Nota: ");
        nota3 = input.nextDouble();
        
        media = (nota1 + nota2 + nota3) / 3;
        int cast = (int) media;
        if(media >= 10)
        {
            System.out.println("Média: "+cast);
            System.out.println("Aluno "+nome+" Aprovado!");
        }
        else
        {
            System.out.println("Média: "+cast);
            System.out.println("Aluno "+nome+" Aprovado!");
        }
            
    }
    
}
