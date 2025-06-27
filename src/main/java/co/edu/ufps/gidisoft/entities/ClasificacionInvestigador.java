package co.edu.ufps.gidisoft.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "clasificaciones_investigador")
public class ClasificacionInvestigador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String clasificacion;
    private String abreviacion;
    private String descripcion;

    @OneToMany(targetEntity = Investigador.class, fetch = FetchType.LAZY, mappedBy = "clasificacion")
    @JsonBackReference
    private List<Investigador> investigadores;

}
