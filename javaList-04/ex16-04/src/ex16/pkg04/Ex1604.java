package ex16.pkg04;
import java.util.Scanner;
import java.util.ArrayList;
public class Ex1604 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> lista1 = new ArrayList<>();
        ArrayList<Integer> lista2 = new ArrayList<>();
        ArrayList<Integer> lista3 = new ArrayList<>();
        
        System.out.print("Qauntos números queres inserir na lista 1: ");
        int n1 = input.nextInt();
        System.out.print("Qauntos números queres inserir na lista 2: ");
        int n2 = input.nextInt();
        //recebendo os valores na lista 1
        System.out.println("lista 1");
        for(int i = 0; i < n1; i++){
            System.out.print("Insira um número: ");
            int n = input.nextInt();
            lista1.add(n);
        }
        //recebendo os valores na lista 2
        System.out.println("lista 2");
        for(int i = 0; i < n2; i++){
            System.out.print("Insira um número: ");
            int n = input.nextInt();
            lista2.add(n);
        }
        //inserisndo os valores na lista 3
        for(int i = 0; i < n1; i++){
            lista3.add(lista1.get(i));
        }
        for(int i = 0; i < n2; i++){
            lista3.add(lista2.get(i));
        }
        //apresentando as listas
        System.out.println(lista1);
        System.out.println(lista2);
        System.out.println(lista3);
    
    }
}
