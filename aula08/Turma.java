import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Turma {
    private ArrayList<Aluno> lista;

    public Turma() {
        lista = new ArrayList<>();
    }

    public void carregarAlunos() throws FileNotFoundException {
        File fich = new File("./aula08/alunos.csv");
        System.out.println(fich.getAbsolutePath());
        if (fich.exists()) {
            // ler o conteudo do ficheiro
            Scanner ler = new Scanner(fich);
            while (ler.hasNextLine()) {
                String linha = ler.nextLine();
                // separar por ponto e virgula, cada linha do ficheiro
                String[] sep = linha.split(";");
                // dados para criar um aluno
                String nome = sep[0];
                int idade = Integer.parseInt(sep[1]);
                String telefone = sep[2];
                Aluno aluno = new Aluno(nome, idade, telefone);
                // inserir o aluno na lista
                lista.add(aluno);
            }
        } else {
            System.out.println("o ficheiro '" + fich.getName() + "' não foi encontrado");
        }
    }

    public void inserirAlunoNaLista(Aluno aluno) {
        lista.add(aluno);
    }

    public void inserirAlunoNaLista() {
        // Criar um objeto de leitura
        Scanner ler = new Scanner(System.in);
        // solicitar ao utilizado os dados do aluno
        System.out.println("Nome: ");
        String nome = ler.nextLine();
        System.out.println("Idade: ");
        int idade = ler.nextInt();
        ler.nextLine(); //limpar o buffer do teclado
        System.out.println("Telefone: ");
        String telefone = ler.nextLine();
        // criar o aluno
        Aluno aluno = new Aluno(nome, idade, telefone);
        // inserir aluno na lista
        lista.add(aluno);
    }
    public void listar() {
        if (lista.isEmpty()) {
            System.out.println("A lista esta vazia");
        } else {
            System.out.println("------> Lista de Alunos <-----------");
            for (Aluno aluno : lista) {
                System.out.println(aluno);
            }
        }
    }
}
