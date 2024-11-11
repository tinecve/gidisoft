package co.edu.ufps.gidisoft.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "investigadores")
public class Investigador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String orcid;
    private String cvlac;
    private String telefono;
    private String foto;

    @ManyToOne(targetEntity = ClasificacionInvestigador.class)
    private ClasificacionInvestigador clasificacion;

    @OneToMany(targetEntity = Educacion.class, fetch = FetchType.LAZY, mappedBy = "investigador")
    private List<Educacion> educaciones;

    @OneToMany(targetEntity = ExperienciaProfesional.class, fetch = FetchType.LAZY, mappedBy = "investigadorExperiencia")
    private List<ExperienciaProfesional> experienciasProfesionales;

}
