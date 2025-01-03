package aula09;

public class Normal extends Bilhete{
   public Normal(int valorBilhete){
    super(valorBilhete);
   } 

   public void imprimeBilhete(){
    System.out.println("Bilhete Normal: "+super.getValorEsc());
   }
}
