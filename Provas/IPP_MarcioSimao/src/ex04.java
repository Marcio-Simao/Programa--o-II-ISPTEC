/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author LENOVO
 */
public class ex04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        int num, n, ultimoDigito, soma = 0;
 
        for(int i = 100; i <= 999; i++)
        {
            num = i;
          
            while(num != 0)
            {
                ultimoDigito = num % 10; 
                num = num / 10;
                n =  ultimoDigito * ultimoDigito * ultimoDigito;
                soma += n;
                
                n = 0;
            }
            if(soma == i)
            {
                System.out.println(soma);
            }
            soma = 0;
        }
    }
}
