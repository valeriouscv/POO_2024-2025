package aula16;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex03 {

	public static void main(String[] args) {
		Pattern p = Pattern.compile("a+");
		Matcher m = p.matcher("bb ana aaa");
		if(m.matches()) {
			System.out.println("Padrao encontrado");
		}else {
			System.out.println("Padrao nao encontrado");
		}

	}

}
