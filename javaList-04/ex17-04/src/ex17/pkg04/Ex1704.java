
package ex17.pkg04;
import java.util.Scanner;
import java.util.Arrays;
public class Ex1704 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("quantos números no vetor 1: ");
        int n1 = input.nextInt();
        int[] vetor1 = new int[n1];
        
        System.out.print("quantos números no vetor 1: ");
        int n2 = input.nextInt();
        int[] vetor2 = new int[n2];
        
        int n3 = n1 + n2;
        int[] vetor3 = new int[n3];
        
        System.out.println("Vetor 1");
        for(int i = 0; i < n1; i++){
            System.out.print("Insira um número: ");
            vetor1[i] = input.nextInt();
        }
        
        System.out.println("Vetor 2");
        for(int i = 0; i < n2; i++){
            System.out.print("Insira um número: ");
            vetor2[i] = input.nextInt();
        }
        
        System.arraycopy(vetor1, 0, vetor3, 0, n1);
        int j = 0;
        for(int i = n1 + 1; i < n3; i++){
            
            vetor3[i] = vetor2[j];
            j++;
        }
        System.out.println(Arrays.toString(vetor1));
        for(int i = 0; i < n3; i++){
            
            System.out.println(vetor3[i]); 
            
        }
        System.out.println(Arrays.toString(vetor2));
        System.out.println(Arrays.toString(vetor3));
    }
    
}
