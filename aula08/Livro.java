public class Livro {
    //atributos
    private String autor;
    private String titulo;

    //construtor
    public Livro(String autor, String titulo){
        this.titulo=titulo;
        this.autor=autor;
    }

    //modificadores de acesso
    public String getAutor(){
        return this.autor;
    }
    public String getTitulo(){
        return this.titulo;
    }
}
