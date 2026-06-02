package ex14.pkg04;

import java.util.Scanner;
import java.util.ArrayList;

public class Ex1404 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList <Integer> lista1 = new ArrayList<>();
        ArrayList <Integer> lista2 = new ArrayList<>();
        ArrayList <Integer> lista3 = new ArrayList<>();
        ArrayList <ArrayList<Integer>> grupos = new ArrayList<>();
        
        System.out.print("Quantos números quês colocar na lista 1: ");
        int l1 = input.nextInt();
        System.out.print("Quantos números quês colocar na lista 2: ");
        int l2 = input.nextInt();
        System.out.print("Quantos números quês colocar na lista 3: ");
        int l3 = input.nextInt();
        System.out.println("Lista 1");
        for(int i = 0; i < l1; i++){
            System.out.print("Insira o número: ");
            int n = input.nextInt();
            lista1.add(n);
        }
        System.out.println("Lista 2");
        for(int i = 0; i < l2; i++){
            System.out.print("Insira o número: ");
            int n = input.nextInt();
            lista2.add(n);
        }
        System.out.println("Lista 3");
        for(int i = 0; i < l3; i++){
            System.out.print("Insira o número: ");
            int n = input.nextInt();
            lista3.add(n);
        }
        System.out.println(lista1);
        System.out.println(lista2);
        System.out.println(lista3);
        
        grupos.add(lista1);
        grupos.add(lista2);
        grupos.add(lista3);
        System.out.println(grupos);  
        
        System.out.print("Digite um número: ");
        int num = input.nextInt();
        
        for(int i = 0; i < grupos.size(); i++){
            ArrayList<Integer> lista = grupos.get(i);
            if(lista.contains(num) == true){
                grupos.remove(i);
                i--;
            }
        }
        System.out.println(grupos);         
    }
}
