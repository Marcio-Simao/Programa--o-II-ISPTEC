/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex04.pkg02;
import java.util.Scanner;
/**
 *
 * @author LENOVO
 */
public class Ex0402 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        int anoNasc, anoAtual, idade, anos;
        
        System.out.print("Digite o seu ano de nascimento: ");
        anoNasc = input.nextInt();
        
        System.out.print("Digite o ano Atual: ");
        anoAtual = input.nextInt();
        
        idade = anoAtual - anoNasc;
        
        if( idade < 18)
        {
            anos = 18 - idade;
            System.out.println("Faltam "+ anos +" anos para o recenseamento");
        }
        else
        {
            anos = idade - 18;
            System.out.println("já se passaram "+ anos +" desde o200 recenseamento");
        }    
    }
    
}
