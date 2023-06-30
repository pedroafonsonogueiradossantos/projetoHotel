package InciandoNoSpring.PrimeiraAplicacao.Controller;

import InciandoNoSpring.PrimeiraAplicacao.Model.M_Usuario;
import InciandoNoSpring.PrimeiraAplicacao.Service.S_Usuario;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;


@Controller
@SessionAttributes("usuario")
public class C_Cadastro {

    @GetMapping("/cadastro")
    public String cadastro() {
        return "Cadastro/cadastro";
    }

    @PostMapping("/cadastro")
    public String processLogin(@RequestParam("documento") String documento, @RequestParam("senha") String senha, @RequestParam("nome") String nome,
                               @RequestParam("dataNasc") String dataNasc, @RequestParam("endereco") String endereco, @RequestParam("email") String email,
                               @RequestParam("tipo") String tipo, HttpSession session, HttpServletRequest request) {
        S_Usuario.cadastrar_usuario(nome,documento,tipo,dataNasc,senha,endereco,email);
        return "Login/login"; //
    }

}
