package InciandoNoSpring.PrimeiraAplicacao.Model.Locacao;

public class MC_Locacao {
    public String chaveLocacao(M_Locacao locacao){

        String chave = "C"+ locacao.getId_Quarto()+locacao.getId_Usuario();

        return chave;
    }




}
