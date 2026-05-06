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

        System.out.print("Quantos nomes deseja inserir? ");
        int n = sc.nextInt();
        sc.nextLine(); // limpar buffer

        for (int i = 0; i < n; i++) {
            System.out.print("Digite um nome: ");
            String nome = sc.nextLine();
            nomes.add(nome);
        }

        System.out.println("Lista de nomes: " + nomes); 
    }
    
}
