package aula09;

public class BilheteTeste {
   public static void main(String[] args) {
        Bilhete b = new Bilhete(500);
        b.imprimeValor();    

        VIP bilheteVIP = new VIP(500, 150);
        System.out.println("Valor Bilhete (VIP): "+bilheteVIP.valorBilhete());
        
        Normal bilheteNormal = new Normal(500);
        bilheteNormal.imprimeBilhete();
    } 
}
