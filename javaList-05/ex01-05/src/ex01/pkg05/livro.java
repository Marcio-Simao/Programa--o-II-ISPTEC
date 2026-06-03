package ex01.pkg05;
public class livro {
    // Campos do registo (atributos publicos)
    public String titulo; 
    public String autor; 
    public float preco;
    
    // Construtor vazio
    public livro() { }
    // Construtor com todos os campos
    public livro(String titulo, String autor, float preco){
        this.titulo = titulo;
        this.autor = autor;
        this.preco = preco;  
    }
}
