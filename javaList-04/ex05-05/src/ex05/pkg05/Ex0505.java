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

        int[] K = new int[15];
        ArrayList<Integer> P = new ArrayList<>();

        // Ler os 15 números
        System.out.println("Digite 15 números inteiros:");
        for (int i = 0; i < 15; i++) {
            K[i] = sc.nextInt();
        }

        // Verificar quais são primos
        for (int i = 0; i < 15; i++) {
            int n = K[i];
            boolean ehPrimo = true;

            if (n <= 1) {
                ehPrimo = false;
            } else {
                for (int d = 2; d <= Math.sqrt(n); d++) {
                    if (n % d == 0) {
                        ehPrimo = false;
                        break;
                    }
                }
            }

            if (ehPrimo) {
                P.add(n);
            }
        }

        // Mostrar resultado
        System.out.println("Números primos:");
        System.out.println(P);

        sc.close();
    }
}