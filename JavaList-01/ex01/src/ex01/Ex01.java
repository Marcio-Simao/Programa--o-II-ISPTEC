/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex01;
import java.util.Scanner;
/**
 *
 * @author LENOVO
 */
public class Ex01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        //1. Variaveis e Constantes
        final String Nome_Loja = "Tech Angola";
        int quantidadeSmartPhone = 10;
        double precoUnitario = 1500.50;
        
        System.out.println("Ben-vindo a "+ Nome_Loja);
        
        //2. Operadores Incrementais e Decrementais
        //Chegou uma unidade nova 
        quantidadeSmartPhone++;
        System.out.println("Stock apos nova entrega: "+ quantidadeSmartPhone);
        
        // Venda efectuada
        quantidadeSmartPhone--;
        System.out.println("Stock apos venda: "+ quantidadeSmartPhone);
        
        //3. Expressões Aritméticas e Lógicas 
        double valorTotalStock = quantidadeSmartPhone * precoUnitario;
        boolean stockBaixo = quantidadeSmartPhone < 5;
        
        System.out.println("Valor total em stock: "+ valorTotalStock);
        System.out.println("O stock esta baixo? "+ stockBaixo);
        
        
    }
    
}
