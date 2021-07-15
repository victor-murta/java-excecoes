public class FluxoComTratamento {


    public static void main (String[] args){
        System.out.println("Ini do main");

        try{
            metodo1();
        }catch( NullPointerException | ArithmeticException | MinhaExcecao ex){
            String msg = ex.getMessage();
            System.out.println("Exception: " + msg);
            ex.printStackTrace();
        }

        System.out.println("Fim do main");
    }

    //static = método só pode ser chamado a partir de uma referência
    private static void metodo1() throws MinhaExcecao {
        System.out.println("Ini do metodo1");
        metodo2();
        System.out.println("Fim do metodo1");
    }

    private static void metodo2() throws MinhaExcecao{
        System.out.println("Ini do metodo2");

        //ArithmeticException ex = new ArithmeticException("Deu ruim!!!");
        //throw ex;
        //thow só funciona com excessões
        throw new MinhaExcecao("Deu MUITO ruim!!!");

        //System.out.println("Fim do metodo2");
    }

}
