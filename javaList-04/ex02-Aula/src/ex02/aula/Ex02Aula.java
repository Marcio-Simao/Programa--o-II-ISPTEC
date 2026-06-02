package ex02.aula;

import java.util.Random;
import java.util.Scanner;

public class Ex02Aula {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        float[] num = new float[20];
        for(int i = 0; i < 10; i++){
            float n;
            n = rand.nextFloat(20);
            num[i] = n;
        }
        for(int i = 0; i < 10; i++){
           num[i+ 10] = num[9 - i];
        }
        for(int i = 0; i < 20; i++){
           System.out.printf("%.2f", num[i]);
           System.out.println(" ");
           
        }
        
    }
    
}
