public class LivroTeste {
    public static void main(String[] args) {
        Livro a = new Livro("Franz Kafka", "A Metamorfose",112);
        Livro b = new Livro("Baltazar Lopes", "Chiquinho",212);
        Livro c = new Livro("Robert Kiyosaki", "Pai Rico, Pai Pobre",336);

        //System.out.println("Autor  : "+b.getAutor());
        //System.out.println("Título : "+b.getTitulo());
        a.setNumReferencia("8571646856");
        b.setNumReferencia("58");
        a.imprimirDetalhes();
        b.imprimirDetalhes();

    }
}
