/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex16.pkg03;
import java.util.Scanner;
/**
 *
 * @author LENOVO
 */
public class Ex1603 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int i = 1, num, produto;
        boolean triangular = false;
        
        System.out.print("Digite um número: ");
        num = input.nextInt();
        
        while(i * (i + 1) * (i * 2) >= num)
        {
            produto = (i * (i + 1) * (i * 2));
            System.out.println(produto);
            if(produto == num)
            {
                triangular = true;
            }
            i++;
        }
        if(triangular == true){
            System.out.println("O número " + num + " é triangular.");
        }else{
            System.out.println("O número " + num + " não é triangular.");
        }
    }
    
}
