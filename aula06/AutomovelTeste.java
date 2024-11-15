public class AutomovelTeste{
    public static void main(String []args){
        Automovel karruMileida = new Automovel("Renault", "ST-20-ZN");
        Automovel karruRafa = new Automovel("Ford", "ST-01-WV",1500);
        karruMileida.setCilindrada(999);
        System.out.println(karruMileida); //karruMileida..toString();

        //karruMileida.diffCilindrada(karruRafa.getCilindrada()); //ou
        //karruRafa.diffCilindrada(karruMileida.getCilindrada());
        Automovel.diffCilindrada(karruRafa.getCilindrada(), karruMileida.getCilindrada());
    }
}