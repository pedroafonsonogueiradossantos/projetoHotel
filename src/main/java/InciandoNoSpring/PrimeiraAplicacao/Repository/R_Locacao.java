package InciandoNoSpring.PrimeiraAplicacao.Repository;

import InciandoNoSpring.PrimeiraAplicacao.Model.Locacao.M_Locacao;
import InciandoNoSpring.PrimeiraAplicacao.Model.M_Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface R_Locacao extends JpaRepository<M_Locacao, Long> {

}
