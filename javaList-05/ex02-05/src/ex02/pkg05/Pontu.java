package ex02.pkg05;
public class Pontu {
    // Campos do registo (atributos privados)
    private float x;
    private float y;
    // Construtor vazio
    public Pontu(){ }
    
    // Construtor com todos os campos
    public Pontu(float x, float y){
        this.x = x;
        this.y = y;
    }
    // Getters — lêem os valores dos campos
    public float getX(){return x;}
    public float getY(){return y;}
    // Setters — alteram os valores dos campos
    public void getX(float x){this.x = x;}
    public void getY(float y){this.y = y;}
    
    // mostra o ponto no formato (x, y)
    public void mostrarPonto(){
        System.out.println("Ponto -> X: " + x + "  |  Y: " + y);
    }
}
