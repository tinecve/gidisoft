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
@Table(name = "publicaciones")
public class Publicacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String tipo;
    private String titulo;
    private String anioPublicacion;
    private String revistaEditorial;
    private String indexacion;
    private String doi;
    private String estado;
    @ManyToMany(mappedBy = "publicaciones")
    private Set<Investigador> investigadores;
}
