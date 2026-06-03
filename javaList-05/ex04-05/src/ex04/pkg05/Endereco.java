package ex04.pkg05;
public class Endereco {
    // Campos do registo (atributos privados)
    private String cidade;
    private String morada; 
    private int numPorta;
    // Construtor vazio
    public Endereco(){}
    // Construtor com todos os campos
    public Endereco(String cidade, String morada, int numPorta){
        this.cidade = cidade;
        this.morada = morada;
        this.numPorta = numPorta;
    }
    // Getters — lêem os valores dos campos
    public String getCidade(){return cidade;}
    public String getMorada(){return morada;}
    public int getNumPorta(){return numPorta;}
    // Setters — alteram os valores dos campos
    public void setCidade(String cidade){this.cidade = cidade;}
    public void setMorada(String morada){this.morada = morada;}
    public void setNumPorta(int numPorta){this.numPorta = numPorta;}
    // mostra
    public void MostrarEnderco(){
        System.out.println("Cidade: "+ cidade);
        System.out.println("Morada: "+ morada);
        System.out.println("Número da porta: "+ numPorta);
    }
}
