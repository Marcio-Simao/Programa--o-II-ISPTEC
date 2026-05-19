/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package isptec.pii.lista7;
import java.util.Scanner;
/**
 *
 * @author LENOVO
 */
public class IsptecPiiLista7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in); 
        int num;
        System.out.print("Digite o número do exercicio: ");
        num = input.nextInt();
        if(num == 0 || num < 0){
            System.out.println("Valor invalido!");
        }else{
            if(num == 1){
                Ex1.taboada();
            }else{
                if(num == 2){
                    String nome;
                    input.nextLine();
                    System.out.print("Nome do Aluno: ");
                    nome = input.nextLine();
                    Ex02.relatorio(nome);
                }
            }
        }
        
    }
    
}
