package aula16;

public class Ex01 {
	public static void main(String[] args) {
		String texto="ana;12;feminino";
		String []sep = texto.split(";");
		System.out.println(sep[2]);
	}
}
