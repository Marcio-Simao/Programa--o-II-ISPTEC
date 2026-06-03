package ex03.pkg05;
public class Aluno {
    // Campos do registo (atributos privados)
    private String nomeAluno;
    private int numAluno;
    private int mediaAluno;
    // Construtor vazio
    public Aluno(){ }
    // Construtor com todos os campos
    public Aluno(String nomeAluno, int numAluno, int mediaAluno){
        this.nomeAluno = nomeAluno;
        this.numAluno = numAluno;
        this.mediaAluno = mediaAluno;
    }
    // Getters — lêem os valores dos campos
    public String getNomeAluno(){return nomeAluno;}
    public int getNumAluno(){return numAluno;}
    public int getMediaAluno(){return mediaAluno;}
    // Setters — alteram os valores dos campos
    public void setNomeAluno(String nomeAluno){this.nomeAluno = nomeAluno;}
    public void setNumAluno(int numAluno){this.numAluno = numAluno;}
    public void setMediaAluno(int mediaAluno){this.mediaAluno = mediaAluno;}
    // mostra melhor Aluno
    public void MelhorAluno(){
        System.out.println("=== Melhor Anulno ===");
        System.out.println("Nome: "+ nomeAluno);
        System.out.println("Número do Aluno: "+ numAluno);
        System.out.println("Média: "+ mediaAluno);
        System.out.println("=====================");
    }
    
}
