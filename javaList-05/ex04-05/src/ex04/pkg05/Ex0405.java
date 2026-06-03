package ex04.pkg05;
import java.util.Scanner;
import java.util.ArrayList;
public class Ex0405 {
    static void Menu(){
        System.out.println("=========================");
        System.out.println("[1] - Registrar");
        System.out.println("[2] - Pessoas registradas");
        System.out.println("[0] - Sair");
        System.out.print(">>");
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Pessoa> pessoas = new ArrayList<>();
        int op = 0;
        do{
            Menu();
            op = input.nextInt();
            
        }while(op != 0);
        
    }
    
    
}
