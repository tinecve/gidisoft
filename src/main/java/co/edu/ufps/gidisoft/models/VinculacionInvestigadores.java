package co.edu.ufps.gidisoft.models;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "vinculacion_investigadores")
public class VinculacionInvestigadores {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "investigador_id")
    private Investigador investigador;
    private String rol;
    private String tipoVinculacion;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private String estado;

}
