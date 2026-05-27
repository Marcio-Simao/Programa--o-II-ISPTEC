/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex09.pkg04;
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
        int[][] alunos = new int[10][3];
        Random rand = new Random();
        int aluno, prova;
        
        for(int i = 0; i < 10; i++){
            for(int j = 0; j < 3; j++){
                alunos[i][j] = rand.nextInt(21);
            }
        }
        System.out.println("1ª PROVA | 2ª PROVA | 3ª PROVA");
        for(int i = 0; i < 10; i++){
            for(int j = 0; j < 3; j++){
                System.out.print( "    " + alunos[i][j] + "   ");
            }
            System.out.println(" ");
        }
        
    }
    
}
