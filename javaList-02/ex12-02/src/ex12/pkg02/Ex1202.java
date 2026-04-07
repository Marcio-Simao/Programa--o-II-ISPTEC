/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex12.pkg02;
import java.util.Scanner;
/**
 *
 * @author LENOVO
 */
public class Ex1202 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        double temp;
        
        System.out.print("Digite a temperatura em  graus Celsius: ");
        temp = input.nextDouble();
        
        if(temp < 10)
        {
            System.out.println("Muito Frio! ");
        }else{
            if((temp >= 10) && (temp <= 17))
            {
                System.out.println("Frio");
            }else{
                if((temp > 17) && (temp <= 23))
                {
                    System.out.println("Tempo Bom! ");
                }else{
                    if((temp > 23) && (temp <= 27))
                    {
                        System.out.println("Calor! ");
                    }else{
                        if(temp > 27)
                        {
                            System.out.println("Perigo de exposição solar! ");
                        }
                    }
                }
            }
                    
        }
        
    }
    
}
