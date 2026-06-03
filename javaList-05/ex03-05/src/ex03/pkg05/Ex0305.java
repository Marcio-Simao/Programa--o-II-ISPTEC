package ex03.pkg05;
import java.util.Scanner;
public class Ex0305 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Aluno[] alunos = new Aluno[4];
        for(int i = 0; i < 4; i++){
            alunos[i] = new Aluno();
            System.out.println((i+1)+"º Aluno ");
            System.out.print("Nome do Aluno: ");
            alunos[i].setNomeAluno(input.nextLine());
            System.out.print("Número de Matricula: ");
            alunos[i].setNumAluno(input.nextInt());
            System.out.print("Média do Aluno: ");
            alunos[i].setMediaAluno(input.nextInt());
            input.nextLine();
        }
        Aluno melhor = alunos[0];
        for(int i = 0; i < 4; i++){ 
            if(melhor.getMediaAluno() < alunos[i].getMediaAluno()){
                melhor = alunos[i];
            }
        }
        melhor.MelhorAluno();
    } 
}
