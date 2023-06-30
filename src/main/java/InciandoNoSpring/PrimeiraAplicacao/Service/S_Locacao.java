package InciandoNoSpring.PrimeiraAplicacao.Service;

import InciandoNoSpring.PrimeiraAplicacao.Model.Locacao.M_Locacao;
import InciandoNoSpring.PrimeiraAplicacao.Model.M_Usuario;
import InciandoNoSpring.PrimeiraAplicacao.Repository.R_Locacao;
import InciandoNoSpring.PrimeiraAplicacao.Repository.R_Usuario;

public class S_Locacao {
    private static R_Locacao r_locacao;
    public static String cadastrar_locacao(String quarto, String usuario, String entrada, String saida) {

        M_Locacao locacao = new M_Locacao();

        locacao.setId_Quarto(Long.valueOf(quarto));
        locacao.setId_Usuario(Long.valueOf(usuario));
        locacao.setData_ent_locacao(entrada);
        locacao.setData_saida_locacao(saida);

        r_locacao.save(locacao);

        return "/home";
    }
}
