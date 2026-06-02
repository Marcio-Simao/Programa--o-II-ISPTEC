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
        for(int i = 0; i < l1; i++){
            System.out.print("Insira o número: ");
            int n = input.nextInt();
            lista1.add(n);
        }
        for(int i = 0; i < l2; i++){
            System.out.print("Insira o número: ");
            int n = input.nextInt();
            lista2.add(n);
        }
        for(int i = 0; i < l3; i++){
            System.out.print("Insira o número: ");
            int n = input.nextInt();
            lista3.add(n);
        }
        System.out.println(lista1);
        System.out.println(lista2);
        System.out.println(lista3);
            
    }
}
