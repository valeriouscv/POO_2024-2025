public class Banco {
    //metodos
    public static boolean transferencia(Conta origem, Conta destino, double quantia){
        if(origem.podeLevantar(quantia)){
            //na origem
            int novoSaldo = origem.getSaldo() - quantia;
            origem.setSaldo(novoSaldo);
            
            //no destino
            novoSaldo = destino.getSaldo() + quantia;
            destino.setSaldo(novoSaldo);
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        //implementar
    }
}
