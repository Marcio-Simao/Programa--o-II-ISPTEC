package ex05.pkg05;
public class Agenda {
    // Campos do registo (atributos privados)
    private String nome;
    private int numero;
    // Construtor vazio
    public Agenda(){}
    // Construtor com todos os campos
    public Agenda(String nome, int numero){
        this.nome = nome;
        this.numero = numero;
    }
    // Getters — lêem os valores dos campos
    public String getNome(){return nome;}
    public int getNumero(){return numero;}
    // Setters — alteram os valores dos campos
    public void setNome(String nome){this.nome = nome;}
    public void setNumero(int numero){this.numero = numero;}
    // mostra número
    public void mostrarnumero(){
        System.out.println("Número: "+ numero);
    }
}
