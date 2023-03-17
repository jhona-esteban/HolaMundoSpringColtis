
package com.coltis.HolaMundoSpring.dao;


import com.coltis.HolaMundoSpring.domain.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioDao extends JpaRepository<Usuario, Long>{
    Usuario findByUsername(String username);
}
