package InciandoNoSpring.PrimeiraAplicacao.Model.Locacao;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "locacao")
public class M_Locacao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_locacao;
    private Long id_Usuario;
    private Long id_Quarto;
    private String data_ent_locacao;
    private String data_saida_locacao;
    private String data_cad_locacao;
    private String chave_locacao;

    public Long getId_locacao() {
        return id_locacao;
    }

    public void setId_locacao(Long id_locacao) {
        this.id_locacao = id_locacao;
    }

    public Long getId_Usuario() {
        return id_Usuario;
    }

    public void setId_Usuario(Long id_Usuario) {
        this.id_Usuario = id_Usuario;
    }

    public Long getId_Quarto() {
        return id_Quarto;
    }

    public void setId_Quarto(Long id_Quarto) {
        this.id_Quarto = id_Quarto;
    }

    public String getData_ent_locacao() {
        return data_ent_locacao;
    }

    public void setData_ent_locacao(String data_ent_locacao) {
        this.data_ent_locacao = data_ent_locacao;
    }

    public String getData_saida_locacao() {
        return data_saida_locacao;
    }

    public void setData_saida_locacao(String data_saida_locacao) {
        this.data_saida_locacao = data_saida_locacao;
    }

    public String getData_cad_locacao() {
        return data_cad_locacao;
    }

    public void setData_cad_locacao(String data_cad_locacao) {
        this.data_cad_locacao = data_cad_locacao;
    }

    public String getChave_locacao() {
        return chave_locacao;
    }

    public void setChave_locacao(String chave_locacao) {
        this.chave_locacao = chave_locacao;
    }
}
