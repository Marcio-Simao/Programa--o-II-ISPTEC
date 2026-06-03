package ex04.pkg05;
public class Pessoa {
    // Campos do registo (atributos privados)
    private String nome;
    private int dataNasc;
    private Endereco endereco;
    
    // Construtor vazio
    public Pessoa(){}
    // Construtor com todos os campos
    public Pessoa(String nome, int dataNasc, Endereco endereco){
        this.nome = nome;
        this.dataNasc = dataNasc;
        this.endereco = endereco;
    }
    // Getters — lêem os valores dos campos
    public String getNome(){return nome;}
    public int getDataNasc(){return dataNasc;}
    public Endereco getEndereco(){return endereco;}
    // Setters — alteram os valores dos campos
    public void setNome(String nome){this.nome = nome;}
    public void setDataNasc(int dataNasc){this.dataNasc = dataNasc;}
    public void setEndereco(Endereco endereco){this.endereco = endereco;}
    // mostra
    public void mostrarDados(){
        System.out.println("========== D A D O S =========");
        System.out.println("Nome: "+ nome);
        System.out.println("Data de Nascimento: "+ dataNasc);
        if(endereco != null){
            endereco.MostrarEnderco();
        }
        System.out.println("==============================");
    }
}
