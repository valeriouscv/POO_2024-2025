package aula09;

public class Aluno extends Pessoa{
    public String matricula;

    public Aluno(String nome, String matricula) {
        super(nome); //instanciar atraves do construtor da classe Pessoa
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "Aluno " + super.toString() + " - matricula=" + matricula;
    }
    
}
