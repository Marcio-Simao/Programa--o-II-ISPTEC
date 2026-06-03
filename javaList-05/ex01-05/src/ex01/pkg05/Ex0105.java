package ex01.pkg05;
import java.util.Scanner;
public class Ex0105 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        livro li = new livro();
        
        System.out.print("Digite Titulo: ");
        li.titulo = input.nextLine();
        
        System.out.print("Digite o nome do autor: ");
        li.autor = input.nextLine();
        
        System.out.print("Digite o preço: ");
        li.preco = input.nextFloat();
        
        System.out.println("=========================");
        System.out.println("Titulo: "+ li.titulo);
        System.out.println("Autor: "+ li.autor );
        System.out.println("Preço: "+ li.preco);
        System.out.println("=========================");
        
        
    }
}
