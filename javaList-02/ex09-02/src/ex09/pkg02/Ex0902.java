/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex09.pkg02;
import java.util.Scanner;
/**
 *
 * @author LENOVO
 */
public class Ex0902 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int dia, mes, ano;
        
        System.out.print("Dia: ");
        dia = input.nextInt();
        
        System.out.print("Mês: ");
        mes = input.nextInt();
        
        System.out.print("Ano: ");
        ano = input.nextInt();
        
        if((ano >= 1000) && (ano <= 1999))
        {
            if((ano % 4 == 0) || (ano % 400 == 0))
            {
                //Ano Bissexo
                switch(mes)
                {
                    case 01:
                        
                    break; 
                    case 02:
                        
                    break;
                    case 03:
                        
                    break;
                    case 04:
                        
                    break;
                    case 05:
                        
                    break;
                    case 06:
                        
                    break;
                    case 07:
                        
                    break;
                    case 08:
                        
                    break;
                    case 09:
                        
                    break;
                    default:
                        System.out.println("Mês Invalido!");
                    break;
                }
                    
            }else{
                
            }    
                    
        }else{
            System.out.println("ano Invalido!");
        }    
    }
    
}
