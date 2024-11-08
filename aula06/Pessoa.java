package aula06;
public class Pessoa{
    //atributos
    private String nome;
    private int idade;

    //construtor
    public Pessoa(){
        this.nome="";
        this.idade = 0;
    }
    public Pessoa(String nome, int idade){
        this.nome = nome;
        setIdade(idade);
    }
    public Pessoa(String nome){
        this.nome = nome;
        this.idade = 0;
    }

    //getters & setters
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }
    public void setIdade(int idade){
        if (idade < 0 || idade > 120) {
            System.out.println("Idade invalido");
            return;
        }

        this.idade = idade;
    }
    public int getIdade(){
        return this.idade;
    }

    //toString
    @Override
    public String toString() {
        return "Nome: "+nome+", Idade: "+idade;
    }
}