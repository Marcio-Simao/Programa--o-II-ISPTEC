package ex01.pkg03;
import java.util.Scanner;

public class Ex0103 {

  public class Fatorial {
    
    // Método para calcular o fatorial de forma iterativa
    public static long calcularFatorial(int n) {
        long resultado = 1;
        for (int i = 2; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite um número inteiro positivo: ");
            
            // Verifica se a entrada é um número inteiro
            if (!scanner.hasNextInt()) {
                System.out.println("Erro: Por favor, insira um número inteiro válido.");
                return;
            }

            int numero = scanner.nextInt();

            // Valida se o número é positivo
            if (numero < 0) {
                System.out.println("Erro: O número deve ser não negativo.");
                return;
            }

            long fatorial = calcularFatorial(numero);
            System.out.printf("%d! = %d%n", numero, fatorial);

        } catch (Exception e) {
            System.out.println("Ocorreu um erro: " + e.getMessage());
        }
    }
}
    }
    
