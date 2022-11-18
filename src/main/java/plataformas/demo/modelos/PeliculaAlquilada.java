package plataformas.demo.modelos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class PeliculaAlquilada {
        @Id 
        private long idAlquilada;

        @Column
        private long idPelicula;

        @Column
        private String email;
}