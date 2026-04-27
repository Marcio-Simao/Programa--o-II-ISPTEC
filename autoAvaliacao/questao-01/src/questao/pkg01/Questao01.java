/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package questao.pkg01;
import java.util.Scanner;
import java.time.LocalDate;
/**
 *
 * @author LENOVO
 */
public class Questao01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
         int i;
         
        do
        {    
            System.out.println("M E N U");
            System.out.println("[1] - Avaliação");
            System.out.println("[2] - Gestão Hoteleira");
            System.out.println("[3] - Estrelas");
            System.out.println("[4] - Série");
            System.out.println("[5] - Sair");
            System.out.print(">> ");
            i = input.nextInt();
            
            switch(i)
            {
                //Avaliação
                case 1:
                    double n1, n2, n3, media;
                    System.out.println("* A V A L I A Ç Ã O *");
                    
                    System.out.print("1ª Nota: ");
                    n1 = input.nextDouble();
                    System.out.print("2ª Nota: ");
                    n2 = input.nextDouble();
                    System.out.print("3ª Nota: ");
                    n3 = input.nextDouble();
                    
                    media = (n1 + n2 + n3) / 3;
                    
                    if(media >= 10)
                    {
                        System.out.println("Aluno Aprovado!");
                    }else{
                        if(media < 10 && media >= 7){
                            System.out.println("Aluno em Recuperação!");
                        }else{
                            System.out.println("Aluno Reprovado!");
                        }
                    }        
                break;
                //Gestão hoteleira
                case 2:
                    System.out.println("* G E S T Ã O - H O T E L E I R A *");
                    String[] nomeCliente = new String[30];
                    int[] numDias = new int[30];
                    double[] contaCliente = new double[30];
                    LocalDate[] datas = new LocalDate[30];
                    double ganhoHotel = 0; 
                    String[] nomeOperador = new String[30];  
                    int c = 0, i1 = 0;
                    
                    do{
                        System.out.println("R E G I S T R A R - C L I E N T E S");
                        System.out.println("[1] - Registrar");
                        System.out.println("[2] - Sair");
                        System.out.print(">> ");
                        i1 = input.nextInt();
                        input.nextLine();
                        
                        switch(i1)
                        {
                            //Registrar Cliente
                            case 1: 
                              if(c < 30){
                                System.out.println(" ");
                                
                                System.out.print("Nome do operador: ");
                                nomeOperador[c] = input.nextLine();
                                
                                datas[c] = LocalDate.now();
                                
                                System.out.println("Registrar Cliente");
                           
                                System.out.print("Nome do Cliente: ");
                                nomeCliente[c] = input.nextLine();
                                
                                System.out.println("Deseja ficar quantos dias: ");
                                numDias[c] = input.nextInt();
                                
                                if(numDias[c] < 15){
                                    contaCliente[c] = 35000 + 4000;
                                }else{
                                    if(numDias[c] > 15){
                                        contaCliente[c] = 35000 + 2000;
                                    }else{
                                        contaCliente[c] = 35000 + 3000;
                                    }
                                }
                                ganhoHotel += contaCliente[c];
                                c++;
                                System.out.println(" ");
                              }else{
                                System.out.print("todos os 30 quartos já foram reservados!");
                              }
                              
                            break;
                            
                            case 2: 
                                System.out.println("Saindo...");
                            break;
                            
                            default :
                                System.out.println("Valor invalido!");
                            break;        
                        }
                        
                    }while(i1 != 2);
                    
                    for(int j = 0; j < c; j++){
                       System.out.println(" ");
                                
                        System.out.println("Nome do operador: "+ nomeOperador[j] );
                        System.out.println("Data da reserva: "+ datas[j]);
                        System.out.println("Nome do Cliente: "+ nomeCliente[j]);
                        System.out.println("dias reservados: "+ numDias[j]); 
                        System.out.println("Valor a ser pago: "+ contaCliente[j]);
                    }
                    System.out.println("Total ganho pelo hotel: "+ ganhoHotel);         
                break;
                
                case 3:
                    //Estrelas
                    
                    System.out.println("*Estrelas*");
                    
                    int num;
                    System.out.println("Digite um número inteiro: ");
                    num = input.nextInt();
                    
                    for(int i2 = 1; i2 <= num; i2++){
                        for(int i3 = 1; i3 <= num; i3++){
                           if( ( i2 == i3 ) || ( i2 + i3 == num + 1 ) ){ 
                                System.out.print("*");
                           }else{
                               System.out.print(".");
                           }
                        }
                        System.out.println("");
                    }
                        
                break;
                
                case 4:
                    // Série
                    System.out.println("*Série*");
                    int num1, i4 = 4;
                    System.out.println("Digite um número inteiro: ");
                    num1 = input.nextInt();
                    
                    for(int i2 = 1; i2 <= num1; i2++){
                           System.out.print(i2);
                           System.out.print(i4);
                           System.out.print(i4);
                           i4++;
                    }
                    System.out.println(" ");
                break;
                
                case 5:
                    System.out.println("Saindo...");
                break;
                
                default :
                    System.out.println("Valor invalido");
                break;
            }    
        }while( i != 5);   
    }   
}