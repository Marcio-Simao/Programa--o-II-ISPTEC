/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex02.pkg06;
import java.util.Scanner;
/**
 *
 * @author LENOVO
 */
public class Ex0206 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int numCar1, numCar2;
        String pala1, pala2;
        
        System.out.println("Digite a primeira palavra: ");
        pala1 = input.nextLine();
        
        System.out.println("Digite a segunda palavra: ");
        pala2 = input.nextLine();
        
        numCar1 = pala1.length();
        numCar2 = pala2.length();
        
        //string1.regionMatches(inicio1, string2, inicio2, quantidade)
        //regionMatches(true, inicio1, string2, inicio2, quantidade)
        if(pala1.regionMatches(true,0,pala2,0,numCar1))
        {
            System.out.println("São iguais");
        }else{
            System.out.println("Não são iguais");
        }
    }
    
}
