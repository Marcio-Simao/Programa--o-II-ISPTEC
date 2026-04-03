/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex07.pkg02;
import java.util.Scanner;
/**
 *
 * @author LENOVO
 */
public class Ex0702 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        double n1, n2, n3, media;
        int opcao;
        System.out.print("Primeira Nota: ");
        n1 = input.nextDouble();
        
        System.out.print("Segunda Nota: ");
        n2 = input.nextDouble();
        
        System.out.println("A terceira Avaliação foi feita?");
        System.out.println("[1] - Sim");
        System.out.println("[0] - Não");
        opcao = input.nextInt();
        switch (opcao)
        {
            case 1 :
                System.out.print("Terceira Nota: ");
                n3 = input.nextDouble();
                
                if (n1 > n2)
                {
                    media = (n1 + n3) / 2;
                } else {
                    media = (n2 + n3) / 2;
                }   
                System.out.println("Média: "+ media);
            break;   
            
            case 0 : 
                media = (n1 + n2) / 2;
                System.out.println("Média: "+ media);
            break;
            
            default :
                System.out.println("vavlo incorrecto!");
            break;        
        }    
    }
    
}
