public class Fluxo {

    public static void main (String[] args){
        System.out.println("Ini do main");
        metodo1();
        System.out.println("Fim do main");
    }

    //static = método só pode ser chamado a partir de uma referência
    private static void metodo1(){
        System.out.println("Ini do metodo1");
        try {
            metodo2();
        }catch(ArithmeticException | NullPointerException ex){
            String msg =  ex.getMessage();
            System.out.println("Error: " + msg);
            ex.printStackTrace();
        }//catch(NullPointerException ex){
            //String msg =  ex.getMessage();
            //System.out.println("Error: " + msg);
        //}
        System.out.println("Fim do metodo1");
    }

    private static void metodo2() {
        System.out.println("Ini do metodo2");
        for(int i = 1; i <= 5; i++){
            System.out.println(i);
            int a = i /0;
            //Conta c = null;
            //c.deposita();
        }

        System.out.println("Fim do metodo2");
    }


}
