/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex11.pkg02;
import java.util.Scanner;
/**
 *
 * @author LENOVO
 */
public class Ex1102 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        double salarioActual, salarioNovo;
        String genero;
        int  anosTrabalho;
        
        System.out.print("Salário actual: ");
        salarioActual = input.nextDouble();
        
        System.out.print("Anos de trabalho: ");
        anosTrabalho = input.nextInt();
        input.nextLine();
        
        System.out.print("Género(homem, mulher): ");
        genero = input.nextLine();
        
        
        switch (genero.toLowerCase())
        {
            case "homem" :
                if(anosTrabalho < 20)
                {
                   salarioNovo =   salarioActual + (salarioActual * 0.03);
                }else{
                    if((anosTrabalho >= 20) && (anosTrabalho <= 30))
                    {
                        salarioNovo =   salarioActual + (salarioActual * 0.13);
                    }else{
                        if(anosTrabalho > 30)
                        {
                            salarioNovo =   salarioActual + (salarioActual * 0.25);
                        }    
                    }    
                }    
            break;     
            case "mulher" :
                
            break;
            default :
                System.out.println("Não existe esse genero seu/sua panina!!");
            break;    
        }    
    }
    
}
