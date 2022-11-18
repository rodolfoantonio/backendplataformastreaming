package plataformas.demo.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import plataformas.demo.modelos.PeliculaAlquilada;

public interface PeliculaAlquiladaRepo extends JpaRepository<PeliculaAlquilada, Long> {
    
}
