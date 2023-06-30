package InciandoNoSpring.PrimeiraAplicacao.Controller;

import InciandoNoSpring.PrimeiraAplicacao.Service.S_Usuario;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("usuario")
public class C_Login {

    @GetMapping("/")
    public String login() {
        return "Login/login";
    }

    @PostMapping("/")
    public String processLogin(@RequestParam("documento_usuario") String usuario, @RequestParam("senha_usuario") String senha, HttpSession session, HttpServletRequest request, Model model) {

        session.setAttribute("documento_usuario",S_Usuario.checarLogin(usuario, senha));
        if (session.getAttribute("documento_usuario") != null) {
            request.setAttribute("documento_usuario", session.getAttribute("documento_usuario"));
            return "Home/home"; // Redirecionar para a página home em caso de sucesso
        } else {
            model.addAttribute("mensagem","Usuario ou senha ERRADESSSS");
            return "redirect:/?error"; // Redirecionar de volta para a página de login com um parâmetro de erro em caso de falha
        }
    }
}
