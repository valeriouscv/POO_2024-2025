package aula06;

public class PessoaTeste {
    public static void main(String[] args) {
        Pessoa samara = new Pessoa("Samara");
        Pessoa mileida = new Pessoa("Mileida",20);
        Pessoa mickael = new Pessoa("Micael",-7);

        //samara.idade=22;
        //mickael.nome="Mickael Netson";
        //mickael.idade=-7;
        
        
        //mickael.setNome("Mickael");
        mickael.setIdade(18);

        System.out.println(mickael);
    }
}
