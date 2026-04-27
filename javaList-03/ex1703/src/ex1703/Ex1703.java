/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex1703;
import java.util.Scanner;
/**
 *
 * @author LENOVO
 */
public class Ex1703 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        String nome, nomeVelha = "", nomeMulher = "";
        int idade,maiorIdade = 0,sexo, i = 0; 
        int idadeMulher = 0, soma = 0, c = 0;
        int quantHomens = 0, quantMulheres = 0;
        float media;
        
        
        do
        {
            System.out.println("Quer continuar?");
            System.out.println("[1] - Sim: ");
            System.out.println("[0] - Nao: ");
            System.out.print(">> ");
            i = input.nextInt();
            input.nextLine();
            
            switch(i)
            {
                case 1:
                    System.out.print("Nome: ");
                    nome = input.nextLine();
                    System.out.println("Sexo");
                    System.out.println("[1]-Masculino");
                    System.out.println("[2]-Femenino");
                    sexo = input.nextInt();
                    System.out.print("Idade: ");
                    idade = input.nextInt();
                    if(maiorIdade < idade)
                    {
                        maiorIdade = idade;
                        nomeVelha = nome;
                    }
                    if(idadeMulher == 0 && sexo == 2)
                    {
                        idadeMulher = idade;
                        nomeMulher = nome;
                    }else{
                        if(idadeMulher > idade && sexo == 2)
                        {
                            idadeMulher = idade;
                            nomeMulher = nome;
                        }
                    }
                    if(idade > 30 && sexo == 1)
                    {
                        quantHomens++;
                    }
                    if(idade < 18 && sexo == 2)
                    {
                        quantMulheres++;
                    }
                    soma+= idade;
                    c++;
                    
                break;
                case 0:
                    
                break;
                default:
                    System.out.println("Valor incorreto!");
                break;
                
            }
            
        }while(i != 0);
        media = soma / c;
        System.out.println("A mulher mais jovem: "+ nomeMulher);
        System.out.println("A pessoa mais velha: "+ nomeVelha);
        System.out.println("A média de idade do grupo: "+ media);
        System.out.println("tem "+ quantHomens + " homens com mais de 30 anos");
        System.out.println("tem "+ quantMulheres + " Mulheres com menos de 18 anos");
    }
    
}
