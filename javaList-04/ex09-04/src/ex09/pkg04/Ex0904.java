/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex09.pkg04;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author LENOVO
 */
public class Ex0904 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int[][] notas = new int[5][3];
        int[][] provas = new int[3][5];
        int piorNota = 0;
        
        for(int i = 0; i < 5; i++)
        {
            for(int j = 0; j < 3; j++)
            {
                notas[i][j] = rand.nextInt(20);
            }
        }
        System.out.printf("%-12s %-12s %-12s %-12s\n", "", "1º PROVA", "2º PROVA", "3º PROVA");
        for(int i = 0; i < 5; i++)
        {
            System.out.printf("%-12s", (i + 1) + "º Aluno:");
            for(int j = 0; j < 3; j++)
            {
                System.out.printf("%-12d", notas[i][j]);
            }
            System.out.println();
        }
        for(int i = 0; i < 5; i++)
        {
            for(int j = 0; j < 3; j++)
            {
                if(piorNota > notas[i][j]){
                    piorNota = notas[i][j];
                    provas[j][i] = i + 1;  
                }
            }
        }
        System.out.println(" ");
        for(int j = 0; j < 3; j++)
        {
            System.out.print((j + 1) + " Prova: ");
            for(int i = 0; i < 5; i++)
            {
                System.out.print(provas[j][i]);
            }
            System.out.println();
        }
        
    }
}
