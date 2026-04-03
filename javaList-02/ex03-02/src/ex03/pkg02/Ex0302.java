/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex03.pkg02;
import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Ex0302 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        double velCar;
        
        System.out.print("Digite a velocidade do carro: ");
        velCar = input.nextDouble();
        
        if(velCar > 80)
        {
            System.out.println("O motorista foi multado!");
            System.out.println("Valor da multa: "+ velCar * 5000);
        }    
    }
    
}
