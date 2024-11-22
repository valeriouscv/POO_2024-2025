public class LivroTeste {
    public static void main(String[] args) {
        Livro a = new Livro("Franz Kafka", "A Metamorfose");
        Livro b = new Livro("Baltazar Lopes", "Chiquinho");
        Livro c = new Livro("Robert Kiyosaki", "Pai Rico, Pai Pobre");

        System.out.println("Autor  : "+b.getAutor());
        System.out.println("Título : "+b.getTitulo());
    }
}
