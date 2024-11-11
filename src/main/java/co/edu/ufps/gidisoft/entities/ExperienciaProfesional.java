package co.edu.ufps.gidisoft.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "experiencias_profesionales")
public class ExperienciaProfesional {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String cargo;
    private String empresa;

    @Column(name = "anio_inicio")
    private Integer anioInicio;

    @Column(name = "mes_inicio")
    private Integer mesInicio;

    @Column(name = "anio_fin")
    private Integer anioFin;

    @Column(name = "mes_fin")
    private Integer mesFin;

    @ManyToOne(targetEntity = Investigador.class)
    @JoinColumn(name = "investigador_experiencia")
    private Investigador investigadorExperiencia;

    private Boolean actualmente;

}
