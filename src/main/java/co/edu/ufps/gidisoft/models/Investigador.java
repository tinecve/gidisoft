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
@Table(name = "investigadores")
public class Investigador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String apellidos;
    @Column(unique = true)
    private String email;
    @Column(unique = true)
    private String orcid;
    @Column(unique = true)
    private String cvlac;
    private String estado;

    @ManyToMany(mappedBy = "investigador")
    private Set<Publicacion> publicaciones;

    @OneToMany(mappedBy = "director")
    private Set<TrabajoGrado> directorTrabajoGrado;

    @OneToMany(mappedBy = "codirector")
    private Set<TrabajoGrado> codirectorTrabajoGrado;

    @ManyToOne
    @JoinColumn(name = "area_expertis")
    private AreaExpertis areaExpertis;

    @OneToMany(mappedBy = "investigador", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<FormacionAcademica> formacionesAcademicas;

    @OneToMany(mappedBy = "investigador", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<VinculacionInvestigadores> vinculaciones;

    @ManyToMany
    @JoinTable(
            name = "investigador_publicacion",
            joinColumns = @JoinColumn(name = "investigador_id"),
            inverseJoinColumns = @JoinColumn(name = "publicacion_id")
    )
    private Set<Publicacion> publicacions;


}
