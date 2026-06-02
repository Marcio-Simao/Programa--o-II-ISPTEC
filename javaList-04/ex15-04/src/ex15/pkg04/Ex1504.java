package ex15.pkg04;

import java.util.Scanner;
import java.util.ArrayList;
public class Ex1504 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> numList = new ArrayList<>();
        int op = 0;
        do{
            System.out.println("[0] - Sair");
            System.out.println("[1] - Inserir número");
            System.out.print(">> ");
            op = input.nextInt();
            
            switch(op){
                case 0: 
                    System.out.println("");    
                break;
                case 1: 
                    System.out.print("Insira um número: ");
                    int n = input.nextInt();
                    numList.add(n);
                break;
                default: 
                    System.out.println("Valor incorreto!");
                break;         
            }   
        }while(op != 0);
        System.out.println(numList);
        int soma = 0;
        for(int i = 0; i < numList.size(); i++){
            
            for(int j = 1; j < numList.get(i); j++){
                if(numList.get(i) % j == 0){
                    soma += j;
                }
            }
            if(soma == numList.get(i)){
                numList.remove(i);
                i--;
            }
            soma = 0;
        }
        System.out.println(numList);
    }  
}
