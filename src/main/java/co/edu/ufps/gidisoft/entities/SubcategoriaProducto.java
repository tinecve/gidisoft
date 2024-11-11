package co.edu.ufps.gidisoft.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "subcategorias_producto")
public class SubcategoriaProducto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String subcategoria;
    private String descripcion;

    @ManyToOne(targetEntity = CategoriaProducto.class)
    private CategoriaProducto categoria;

    @OneToMany(targetEntity = ProductoInvestigacion.class, fetch = FetchType.LAZY, mappedBy = "subcategoria")
    private List<ProductoInvestigacion> productos;


}
