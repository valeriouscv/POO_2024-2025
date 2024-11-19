public class Conta {
  //atributos
  private int       numConta;
  private String    nomeCliente;
  private double    saldo;  

  //metodos
  public void levantamento(double quantia){
    if(podeLevantar(quantia)){
      System.out.println("Saldo Anterior   : "+this.saldo);
      System.out.println("Valor a levantar : "+quantia);
      this.saldo = this.saldo - quantia; //fez-se o levantamento. atualizar o saldo
      System.out.println("Saldo Atual      : "+this.saldo);
    }else{
      System.out.println("Nao pode efetuar esta operacao!");
    }
  }
  public boolean podeLevantar(double quantia){
    if(quantia <= saldo) return true;
    return false;
  }

}
