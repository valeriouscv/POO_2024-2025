public class Aluno {
    //atributos
    private String nome;
    private int    idade;
    private String telefone;

    //construtores
    public Aluno(){
        this.nome="";
        this.idade=0;
        this.telefone="";
    }
    public Aluno(String nome, int idade, String telefone){
        this.nome=nome;
        this.idade=idade;
        this.telefone=telefone;
    }

    //getters e setters
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
   
    //toString
     @Override
    public String toString() {
        return "Aluno [nome=" + nome + ", idade=" + idade + ", telefone=" + telefone + "]";
    }
    
}

