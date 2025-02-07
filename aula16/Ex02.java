package aula16;

public class Ex02 {

	public static void main(String[] args) {
		String texto = "bb ana aaa";
		if(texto.matches("a+")) {
			System.out.println("Padrao encontrado");
		}else {
			System.out.println("Padrao nao encontrado");
		}

	}

}
