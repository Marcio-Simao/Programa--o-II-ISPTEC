package ex04.pkg05;
import java.util.Scanner;
import java.util.ArrayList;
public class Ex0405 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Pessoa> pessoas = new ArrayList<>();
        int op = 0;
        do{
            Menu();
            op = input.nextInt();
            switch(op){
                case 1: 
                    input.nextLine();
                    Pessoa pessoa = new Pessoa();
                    Endereco end = new Endereco();
                    
                    System.out.print("Nome: ");
                    pessoa.setNome(input.nextLine());
                    System.out.print("Data de nascimento: ");
                    pessoa.setDataNasc(input.nextLine());
                    
                    System.out.print("Cidade: ");
                    end.setCidade(input.nextLine());
                    System.out.print("Morada: ");
                    end.setMorada(input.nextLine());
                    System.out.print("Número da porta: ");
                    end.setNumPorta(input.nextInt());
                    
                    pessoa.setEndereco(end);
                    
                    pessoas.add(pessoa);
                break;
                case 2: 
                    if(pessoas.size() == 0){
                        System.out.println("Nenhuma pessoa registrada");
                    }else{
                        for(int i = 0; i < pessoas.size(); i++){
                            pessoas.get(i).mostrarDados();
                        }
                    }
                break;
                default:
                    System.out.println("Valor Incorreto!");
                break;    
            }
        }while(op != 0); 
    }
    static void Menu(){
        System.out.println("=========================");
        System.out.println("[1] - Registrar");
        System.out.println("[2] - Pessoas registradas");
        System.out.println("[0] - Sair");
        System.out.print(">> ");
    } 
}
