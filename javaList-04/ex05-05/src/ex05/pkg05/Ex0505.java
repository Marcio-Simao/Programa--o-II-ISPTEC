/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex05.pkg05;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author LENOVO
 */
public class Ex0505 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        ArrayList<String> nomes = new ArrayList<>();

        String opcao;

        do {
            System.out.print("Digite um nome: ");
            nomes.add(sc.nextLine());

            System.out.print("Deseja continuar? (s/n): ");
            opcao = sc.nextLine();

        } while (opcao.equalsIgnoreCase("s"));

        System.out.println("Lista final: " + nomes);
    }
    
}
