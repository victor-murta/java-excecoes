public class TesteConexao {

    public static void main(String[] args){

        //Fecha automaticamente( tendo implementado o Autoclose)
        try( Conexao con = new Conexao()){
            con.leDados();

        }catch(IllegalStateException ex){
            System.out.println("Deu erro");
        }


        /*
        Conexao con = null;
        try{
            con = new Conexao();
            con.leDados();

        }catch(IllegalStateException ex){
            System.out.println("Erro na conexão");

        }finally {
            if(con != null){
                con.fecha();
            }

        }*/



    }

}
