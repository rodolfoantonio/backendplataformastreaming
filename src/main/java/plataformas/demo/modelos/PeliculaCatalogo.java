package plataformas.demo.modelos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class PeliculaCatalogo {

    @Id
    private long idPelicula;

    @Column
    private String poster_path;

    @Column
    private String title;

    @Column
    private String release_date;

    @Column
    private String original_language;

    @Column
    private String vote_average;

    @Column
    private String overview;

}
