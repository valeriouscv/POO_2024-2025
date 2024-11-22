public class Livro {
    //atributos
    private String  autor;
    private String  titulo;
    private int     paginas;
    private String  numReferencia;

    //construtor
    public Livro(String autor, String titulo, int paginas){
        this.titulo=titulo;
        this.autor=autor;
        this.paginas=paginas;
        this.numReferencia="";
    }

    //modificadores de acesso
    public String getAutor(){
        return this.autor;
    }
    public String getTitulo(){
        return this.titulo;
    }
    public int getPaginas(){
        return this.paginas;
    }
    public String getNumReferencia(){
        return this.numReferencia;
    }

    //setters
    public void setNumReferencia(String numReferencia){
        if(numReferencia.length() > 3){
            this.numReferencia = numReferencia;
        }else{
            System.out.println("Erro. Tamanho do numReferencia inferior ao permitido. Deve ter no mínimo 3 carateres!");
        }
      
    }

    //outros métodos
    public void imprimeAutor(){
        System.out.println("Autor: "+this.autor);
    }
    public void imprimeTitulo(){
        System.out.println("Título: "+this.titulo);
    }
    public void imprimirDetalhes(){
        System.out.println("\n+--------------------------------------+");
        System.out.println("|              --> Livro <---          |");
        System.out.println("+--------------------------------------+");
        System.out.println("  Titulo               : "+this.titulo);
        System.out.println("  Autor                : "+this.autor);
        System.out.println("  Número de páginas    : "+this.paginas);
        System.out.println("  Numéro de Referencia : "+(this.numReferencia.length()==0 ? "ZZZ":this.numReferencia));
        //sem usar o operador ternario
        /*if(this.numReferencia.length() == 0){
            System.out.println("  Numéro de Referencia : ZZZ");
        }else{
            System.out.println("  Numéro de Referencia : "+this.numReferencia);
        }*/
    }
}
