package InciandoNoSpring.PrimeiraAplicacao.Repository;

import InciandoNoSpring.PrimeiraAplicacao.Model.M_Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface R_Usuario extends JpaRepository<M_Usuario, Long> {
    @Query(value = "SELECT * FROM usuario WHERE documento_usuario = :documento and senha_usuario = :senha limit 1", nativeQuery = true)
    M_Usuario findByUsuarioESenha(@Param("documento") String documento, @Param("senha") String senha);

}