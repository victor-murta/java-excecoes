public class TestaContaComExcecaoChecked {

    public static void main(String[] args) throws MinhaExcecao {
        Conta c = new Conta();
        try {
            c.deposita();
        }catch(MinhaExcecao ex) {
            System.out.println("Tem que tratar");
        }
    }
}
