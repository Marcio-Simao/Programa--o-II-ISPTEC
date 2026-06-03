package ex02.pkg05;
import java.util.Scanner;
import java.util.ArrayList;
public class Ex0205 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Pontu> pontus = new ArrayList<>();
        
        for(int i = 0; i < 5; i++){
            Pontu p = new Pontu();
            System.out.println("\n--- Ponto " + i + " ---");
            System.out.print("X: ");
            p.getX(input.nextFloat());
            System.out.print("Y: ");
            p.getY(input.nextFloat());
            pontus.add(p);
        }
        
    }
    
}
