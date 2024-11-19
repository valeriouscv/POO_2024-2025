public class Automovel{
    //atributos
    private String marca;
    private String matricula;
    private int cilindrada;

    //construtores
    public Automovel(String marca, String matricula, int cilindrada){
        this.marca = marca;
        this.matricula = matricula;
        this.cilindrada = cilindrada;
    }
    public Automovel(String marca, String matricula){
        this.marca = marca;
        this.matricula = matricula;
        this.cilindrada = 1000;
    }

    //getters
    public String getMarca(){
        return this.marca;
    }
    public String getMatricula(){
        return this.matricula;
    }
    public int getCilindrada(){
        return this.cilindrada;
    }

    //setters
    public void setMarca(String marca){
        this.marca = marca;
    }
    public void setMatricula(String matricula){
        this.matricula = matricula;
    }
    public void setCilindrada(int cilindrada){
        this.cilindrada = cilindrada;
    }
    //toString
    @Override
    public String toString(){
        return "Automovel com matricula "+this.matricula+"  e' um "+this.marca+"  e tem cilindrada de "+this.cilindrada+" cc."; 
    }
    public static void diffCilindrada(int umaCilindrada,int outraCilindrada){
        int diferenca;
        if(umaCilindrada >= outraCilindrada){
            diferenca = umaCilindrada - outraCilindrada;
        }else{
            diferenca = outraCilindrada - umaCilindrada;
        }
        System.out.println("A diferenca da cilindrada dos 2 automoveis e' de: "+diferenca);
    }
}