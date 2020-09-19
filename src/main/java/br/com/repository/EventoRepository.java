package br.com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.entity.Evento;

public interface EventoRepository extends JpaRepository<Evento, Long>{

}
