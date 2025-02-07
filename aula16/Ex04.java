package aula16;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex04 {

	public static void main(String[] args) {
		int cont=0;
		Pattern p = Pattern.compile("[0-9]{3}");
		Matcher m = p.matcher("9925");
		while(m.find()) {
			System.out.println(m.group());
			cont++;
		}
		System.out.println("Encontrou "+cont+" vezes");
	}

}
