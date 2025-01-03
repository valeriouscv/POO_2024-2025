package aula09;

public class VIP extends Bilhete{
    private int valorAdicional;

    public VIP(int valorEsc, int valorAdicional){
        super(valorEsc);
        this.valorAdicional=valorAdicional;
    }
    public int valorBilhete(){
        int valorBilhete;
        valorBilhete = super.getValorEsc() + this.valorAdicional;
        return valorBilhete;
    }
}
