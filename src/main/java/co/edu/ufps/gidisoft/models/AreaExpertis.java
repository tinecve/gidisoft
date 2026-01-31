package co.edu.ufps.gidisoft.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "areas_expertis")
public class AreaExpertis {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true)
    private String nombre;
    private String descripcion;

    @OneToMany(mappedBy = "area_expertis")
    private Set<Investigador> investigadores;
}
