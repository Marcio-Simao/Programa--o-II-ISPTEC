/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex10.pkg03;
import java.util.Scanner;
/**
 *
 * @author LENOVO
 */
public class Ex1003 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        int n;
        
        System.out.print("Digite um numero inteiro: ");
        n = input.nextInt();
        
        for(int i = 1; i <= n; i++){ // Colunas
            for(int j = 1; j <= n; j++){ // Linhas
                if(j > i || j == i){
                    System.out.print(" * ");
                }else{
                    System.out.print(" . ");
                }
            }
            System.out.println(" ");
        }
        
    }
    
}
