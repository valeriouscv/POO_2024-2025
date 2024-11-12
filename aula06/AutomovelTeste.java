public class AutomovelTeste{
    public static void main(String []args){
        Automovel karruMileida = new Automovel("Renault", "ST-20-ZN");
        karruMileida.setCilindrada(999);
        System.out.println(karruMileida); //karruMileida..toString();
    }
}