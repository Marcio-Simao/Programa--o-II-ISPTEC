/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex14.pkg03;
import java.util.Scanner;
/**
 *
 * @author LENOVO
 */
public class Ex1403 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        int numCarta, numMultas, opicao, maiorMulta = 0;
        double valorMultas, dividaMotorista, totRecursos = 0, maior = 0;
        do
        {
            System.out.println("* D N V T *");
            System.out.println("[1] - registrar");
            System.out.println("[2] - Terminar");
            opicao = input.nextInt();
            switch(opicao)
            {
                case 1:
                    dividaMotorista = 0;
                    System.out.println("Número da Carta de condução: ");
                    numCarta = input.nextInt();
                    
                    System.out.println("Número de multas: ");
                    numMultas = input.nextInt();
                    
                    for(int i = 1; i <= numMultas; i++)
                    {
                        System.out.println(" Valor da multa "+ i +": ");
                        valorMultas = input.nextDouble();
                        
                        dividaMotorista += valorMultas; 
                    }
                    System.out.println("Total de divida: "+ dividaMotorista);
                    totRecursos += dividaMotorista;
                    if(maior < numMultas)
                    {
                        maiorMulta = numCarta;
                        maior = numMultas;
                    }
                break;
                
                case 2: 
                    System.out.println("* D N V T *");
                    System.out.println("Total de recursos arrecadados: "+ totRecursos);
                    System.out.println("Motorista com maior número de multas: "+ maiorMulta);
                break;
                  
                default :
                    
                break;
            }
            
        }while(opicao != 2);
    }
    
}
