package InciandoNoSpring.PrimeiraAplicacao.Controller;

import InciandoNoSpring.PrimeiraAplicacao.Service.S_Locacao;
import InciandoNoSpring.PrimeiraAplicacao.Service.S_Usuario;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
@Controller
@SessionAttributes("locacao")
public class C_Locacao {

        @GetMapping("/locacao")
        public String locacao() {
            return "Locacao/locacao";
        }

        @PostMapping("/locacao")
        public String processLogin(@RequestParam("quarto") String quarto, @RequestParam("usuario") String usuario, @RequestParam("entrada") String entrada,
                                   @RequestParam("saida") String saida,  HttpSession session, HttpServletRequest request) {

            S_Locacao.cadastrar_locacao(quarto,usuario,entrada,saida);
            return "cadastro_sucesso"; // ou qualquer outra página de sucesso
        }
}
