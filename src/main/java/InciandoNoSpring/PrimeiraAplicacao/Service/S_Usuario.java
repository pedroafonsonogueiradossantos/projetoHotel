package InciandoNoSpring.PrimeiraAplicacao.Service;

import InciandoNoSpring.PrimeiraAplicacao.Model.M_Usuario;
import InciandoNoSpring.PrimeiraAplicacao.Repository.R_Usuario;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Service
public class S_Usuario {

    private static R_Usuario r_usuario;

    public S_Usuario(R_Usuario usuario) {
        this.r_usuario = usuario;
    }

    public static M_Usuario checarLogin(String nome, String senha) {
        return r_usuario.findByUsuarioESenha(nome,senha);
    }
    public static void cadastrar_usuario(String nome, String documento, String tipo, String dataNasc, String senha, String endereco, String email){

        M_Usuario usuario = new M_Usuario();

        usuario.setNome_usuario(nome);
        usuario.setDocumento_usuario(documento);
        usuario.setTipo_usuario(tipo);
        usuario.setData_nasc_usuario(dataNasc);
        usuario.setSenha_usuario(senha);
        usuario.setEndereco_usuario(endereco);
        usuario.setEmail_usuario(email);




        r_usuario.save(usuario);

    }
}
