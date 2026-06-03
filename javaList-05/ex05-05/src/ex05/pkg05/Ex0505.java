package ex05.pkg05;
import java.util.Scanner;
import java.util.ArrayList;
public class Ex0505 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Agenda> agenda = new ArrayList<>();
        int op = 0, pesq = 0;
        do{
            Menu();
            op = input.nextInt();
            switch(op){
                case 0:
                   System.out.println("Encerrado");
                break;    
                case 1:
                   input.nextLine();
                    Agenda age = new Agenda();
                    
                   System.out.print("Nome: ");
                   age.setNome(input.nextLine());
                   
                   System.out.print("Número: ");
                   age.setNumero(input.nextInt());
                   agenda.add(age);
                break;    
                case 2:
                    if(agenda.size() == 0){
                        System.out.println("Agenda vazia");
                    }else{
                        input.nextLine();
                        System.out.print("Nome: ");
                        String nome = input.nextLine();
                        
                        Agenda num = new Agenda();
                        
                        for(int i = 0; i < agenda.size(); i++){
                            if(nome.equalsIgnoreCase(agenda.get(i).getNome()) ){
                                num = agenda.get(i);
                            }
                        }  
                        num.mostraNumero();
                    }
                break;    
                default:
                    System.out.println("Valor incorreto!");
                break;    
            }
        }while(op != 0);
    }
    static void Menu(){
        System.out.println("=========================");
        System.out.println("[1] - Registrar");
        System.out.println("[2] -   pesquisar Pessoa");
        System.out.println("[0] - Sair");
        System.out.print(">> ");
    }
}
