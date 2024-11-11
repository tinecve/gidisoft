package co.edu.ufps.gidisoft.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "niveles_educativos")
public class NivelEducativo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nivel;
    private String description;

    @OneToMany(targetEntity = Educacion.class, fetch = FetchType.LAZY, mappedBy = "nivelEducativo")
    private List<Educacion> educaciones;

}
