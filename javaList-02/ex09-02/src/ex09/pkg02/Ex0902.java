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
                if((mes >= 1) && (mes <= 12))
                {
                    if(mes == 02)
                    {
                        if((dia >= 1) && (dia <= 29))
                        {
                            System.out.println("Data Valida!");
                            System.out.println("O ano é bissexto!");
                        }    
                    }else{
                        if((mes == 04) || (mes == 06) || (mes == 09) || (mes == 11))
                        {
                            
                        }    
                    }    
                }else{
                    System.out.println("Mês invalido!");
                }    
            }else{
                
            }    
                    
        }else{
            System.out.println("ano Invalido!");
        }    
    }
    
}
