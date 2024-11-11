package co.edu.ufps.gidisoft.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "educaciones")
public class Educacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String institucion;

    @Column(name = "anio_fin")
    private Integer anioFin;

    @JoinColumn(name = "nivel_educativo")
    @ManyToOne(targetEntity = NivelEducativo.class)
    private NivelEducativo nivelEducativo;

    @ManyToOne(targetEntity = Investigador.class)
    private Investigador investigador;

    @Column(name = "en_curso")
    private Boolean enCurso;

}
