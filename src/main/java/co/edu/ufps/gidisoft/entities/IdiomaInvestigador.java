package co.edu.ufps.gidisoft.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "idiomas_investigadores")
public class IdiomaInvestigador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(targetEntity = Investigador.class)
    private Investigador investigador;

    @ManyToOne(targetEntity = Idioma.class)
    private Idioma idioma;

    @JoinColumn(name = "nivel_lectura")
    @ManyToOne(targetEntity = NivelIdioma.class)
    private NivelIdioma nivelLectura;

    @JoinColumn(name = "nivel_escritura")
    @ManyToOne(targetEntity = NivelIdioma.class)
    private NivelIdioma nivelEscritura;

    @JoinColumn(name = "nivel_habla")
    @ManyToOne(targetEntity = NivelIdioma.class)
    private NivelIdioma nivelHabla;

    @JoinColumn(name = "nivel_escucha")
    @ManyToOne(targetEntity = NivelIdioma.class)
    private NivelIdioma nivelEscucha;

}
