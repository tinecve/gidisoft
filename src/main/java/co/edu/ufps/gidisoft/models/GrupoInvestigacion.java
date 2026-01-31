package co.edu.ufps.gidisoft.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "grupo")
public class GrupoInvestigacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true)
    private String nombre;
    private String siglas;
    @Column(name = "categoria_colciencias")
    private String categoriaColciencias;
    private String descripcion;
    private String mision;
    private String vision;
    @Column(name = "logo_url")
    private String logoUrl;
    private String estado;
}
