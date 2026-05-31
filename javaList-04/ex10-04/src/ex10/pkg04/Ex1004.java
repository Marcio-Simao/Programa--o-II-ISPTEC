/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex10.pkg04;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author LENOVO
 */
public class Ex1004 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        ArrayList<Integer> numList = new ArrayList<>();
        //preenchendo o ArrayList
        for(int i = 0; i < 20 ; i++){
            int n;
            n = rand.nextInt(11);
            numList.add(n);
        }
        //Apresentando o ArrayList
        System.out.print(numList);
        
        //Pegando o número novo
        System.out.println();
        System.out.print("Digite o número que deseja inserir: ");
        int novoNum = rand.nextInt(10);
        System.out.println(novoNum);
        
        // inserir depois de qual número
        System.out.print("Depois de qual número? ");
        int ref = rand.nextInt(5);
        System.out.println(ref);
        
        //pegando a posição
        int posicao = numList.indexOf(ref);
        System.out.println("Posição: "+ posicao);
        
        numList.add(posicao, novoNum);
        
        //Apresentando o ArrayList
        System.out.print(numList);
    }
}
