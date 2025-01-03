package aula09;

public class Bilhete {
    private int valorEsc;

    public Bilhete(int valorEsc) {
        this.valorEsc = valorEsc;
    }

    public int getValorEsc(){
        return this.valorEsc;
    }

    public void imprimeValor(){
        System.out.println("Valor em Escudos: "+valorEsc);
    }
    
}
