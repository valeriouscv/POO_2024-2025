package aula14;

public class Aluno {
	private String numero;
	private String nome;
	private String telefone;
	private String idade;
	public Aluno(String numero, String nome, String telefone, String idade) {
		this.numero = numero;
		this.nome = nome;
		this.telefone = telefone;
		this.idade = idade;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getIdade() {
		return idade;
	}
	public void setIdade(String idade) {
		this.idade = idade;
	}
	@Override
	public String toString() {
		return "Aluno [numero=" + numero + ", nome=" + nome + ", telefone=" + telefone + ", idade=" + idade + "]";
	}
	
	
	
}
