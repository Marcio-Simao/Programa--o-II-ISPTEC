/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex1803;
import java.util.Scanner;
/**
 *
 * @author LENOVO
 */
public class Ex1803 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int i = 0, produto = 0;
        double totVendas = 0;
        do
        {
            System.out.println("Cantina do Mama Du");
            System.out.println("[1] - registrar compra");
            System.out.println("[0] -  Fechar loja");
            i = input.nextInt();
            switch(i)
            {
                case 1:
                    System.out.println("P r o d u t o s");
                    System.out.println("[1] - Café - 100 kz");
                    System.out.println("[2] - Capuccino – 250 kz ");
                    System.out.println("[3] - Galão - 200 kz ");
                    System.out.println("Total de Vendas: "+ totVendas);
                    produto = input.nextInt();
                    
                    switch(produto)
                    {
                        case 1:
                            
                        break;  
                        case 2:
                            
                        break;
                        case 3:
                            
                        break;
                        default :
                            
                        break;
                    }
                 break;
                case 0: 
                    System.out.println("Loja fechada");
                break;
                default :
                    System.out.println("Valor invalido!");
                break;    
            }
        }while(i != 0);
    }
    
}
