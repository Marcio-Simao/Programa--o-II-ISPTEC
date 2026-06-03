package ex02.pkg05;
import java.util.Scanner;
import java.util.ArrayList;
public class Ex0205 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Pontu> pontus = new ArrayList<>();
        // ler os 5 pontos
        for(int i = 0; i < 5; i++){
            Pontu p = new Pontu();
            System.out.println("\n--- Ponto " + i + " ---");
            System.out.print("X: ");
            p.setX(input.nextFloat());
            System.out.print("Y: ");
            p.setY(input.nextFloat());
            pontus.add(p);
        }
        // encontrar o ponto com menor X
        Pontu menorX = pontus.get(0); // assume o primeiro como menor
        for(Pontu P :  pontus){
            if(menorX.getX() > P.getX()){
                menorX = P;
            }
        }
        // encontrar o ponto com menor y
        Pontu menorY = pontus.get(0); // assume o primeiro como menor
        for(Pontu p : pontus){
            if(menorY.getY() > p.getY()){
                menorY = p;
            }
        }
        // mostrar resultados
        System.out.println("\n=== RESULTADOS ===");
        System.out.print("ponto com menor X: ");
        menorX.mostrarPonto();
        System.out.print("ponto com menor y: ");
        menorY.mostrarPonto();
    }
}
