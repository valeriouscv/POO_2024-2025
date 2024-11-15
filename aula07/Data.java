public class Data{
    //atributos
    private int ano;
    private int mes;
    private int dia;

    //construtor
    public Data(int dia, int mes, int ano){
        setAno(ano);
        setMes(mes);
        setDia(dia);
    }
    //getters 
    public int getAno(){
        return this.ano;
    }
    public int getMes(){
        return this.mes;
    }
    public int getDia(){
        return this.dia;
    }

    //setters
    public void setAno(int ano){
        if(ano <0){
            System.out.println("Ano invalido. Vai ser colocado a um");
            this.ano =1;
            return;
        }
        this.ano = ano;
    }
    public void setMes(int mes){
        if(mes<1 || mes >12){
            System.out.println("Mes invalido. Vai ser colocado a 1");
            this.mes = 1;
            return;
        }
        this.mes = mes;
    }
    public void setDia(int dia){
        if(dia<1 || dia >31){
            System.out.println("Dia invalido. Vai ser colocado a 1");
            this.dia = 1;
            return;
        }
        this.dia=dia;
    }

    //metodo
    public void imprimirData(){
        int nhaAno = this.ano % 100;
        String aa = (nhaAno>9)?""+nhaAno:"0"+nhaAno;
        String mm = (this.mes>9)?""+this.mes:"0"+this.mes;
        String dd = (this.dia>9)?""+this.dia:"0"+this.dia;
        System.out.println(aa+"/"+mm+"/"+dd);
    }
    //toString
    @Override
    public String toString() {
        return dia +"/"+mes+"/"+ano;
    }
}