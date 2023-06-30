package InciandoNoSpring.PrimeiraAplicacao.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "usuario")
public class M_Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_usuario;
    private String nome_usuario;
    private String documento_usuario;
    private String tipo_usuario;
    private String data_nasc_usuario;
    private String senha_usuario;
    private String email_usuario;
    private String endereco_usuario;

    public String getEmail_usuario() {
        return email_usuario;
    }

    public void setEmail_usuario(String email_usuario) {
        this.email_usuario = email_usuario;
    }

    public String getEndereco_usuario() {
        return endereco_usuario;
    }

    public void setEndereco_usuario(String endereco_usuario) {
        this.endereco_usuario = endereco_usuario;
    }

    public Long getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(Long id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getNome_usuario() {
        return nome_usuario;
    }

    public void setNome_usuario(String nome_usuario) {
        this.nome_usuario = nome_usuario;
    }

    public String getDocumento_usuario() {
        return documento_usuario;
    }

    public void setDocumento_usuario(String documento_usuario) {
        this.documento_usuario = documento_usuario;
    }

    public String getTipo_usuario() {
        return tipo_usuario;
    }

    public void setTipo_usuario(String tipo_usuario) {
        this.tipo_usuario = tipo_usuario;
    }

    public String getData_nasc_usuario() {
        return data_nasc_usuario;
    }

    public void setData_nasc_usuario(String data_nasc_usuario) {
        this.data_nasc_usuario = data_nasc_usuario;
    }

    public String getSenha_usuario() {
        return senha_usuario;
    }

    public void setSenha_usuario(String senha_usuario) {
        this.senha_usuario = senha_usuario;
    }
}

