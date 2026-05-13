/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex01.pkg06;

/**
 *
 * @author LENOVO
 */
public class Ex0106 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String a, b;
        int r;
        a = "A";
        b = "a";
        r = a.compareTo(b);
        
        if(r < 0)
        {
            System.out.println(a+" é menor que "+b);
        }else{
            if(r > 0)
            {
                System.out.println(a+" é maior que "+b);
            }else{
                System.out.println(a+" = "+b);
            }
        }
        
    }
    
}
