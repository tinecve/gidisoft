package co.edu.ufps.gidisoft.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "productos_investigacion")
public class ProductoInvestigacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;

    @ManyToOne(targetEntity = SubcategoriaProducto.class)
    @JoinColumn(name = "subcategoria")
    private SubcategoriaProducto subcategoria;

    @OneToOne(targetEntity = Investigador.class)
    private Investigador director;

    @PrimaryKeyJoinColumn(name = "co_director")
    @OneToOne(targetEntity = Investigador.class)
    private Investigador coDirector;
    private Integer anio;
    private Integer mes;
    private String resumen;
    private String doi;
    private String indicador;
    private String beneficios;
    private String impacto;

    @JoinColumn(name = "estado_producto")
    @ManyToOne(targetEntity = EstadoProducto.class)
    private EstadoProducto estadoProducto;

    @Column(name = "areas_investigacion")
    @ManyToMany(targetEntity = AreaInvestigacion.class, fetch = FetchType.EAGER)
    private List<AreaInvestigacion> areasInvestigacion;


}
