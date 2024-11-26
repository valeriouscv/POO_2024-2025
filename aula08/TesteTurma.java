import java.io.FileNotFoundException;

public class TesteTurma {
    public static void main(String[] args) throws FileNotFoundException {
        Turma eni2ano1sem = new Turma();
        eni2ano1sem.carregarAlunos();
        Aluno ana = new Aluno("Ana",22,"9234567");
        //eni2ano1sem.inserirAlunoNaLista(ana);
        //eni2ano1sem.inserirAlunoNaLista();
        eni2ano1sem.listar();
    }
}
