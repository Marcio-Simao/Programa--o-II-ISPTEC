/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex14.pkg02;
import java.util.Scanner;
/**
 *
 * @author LENOVO
 */
public class Ex1402 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        String dayString1, dayString2, dayString3;
        int day = input.nextInt();
        
        if(day == 1)
        {
            dayString1 = "Saturday";    
        }else{
            if(day == 2)
            {
                dayString2 = "Sunday";
            }else{
                if(day == 3)
                {
                    dayString3 = "Monday";
                }else{
                    if(day == 4)
                    {
                        dayString1 = "Tuesday";
                    }else{
                        if(day == 5)
                        {
                            dayString2 = "Wednesday";
                        }else{
                            dayString3 = "Invalid day";
                        }
                    }
                }
            }
        }
    }
    
}
