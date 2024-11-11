package co.edu.ufps.gidisoft.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "categorias_producto")
public class CategoriaProducto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String category;
    private String descripcion;

    @OneToMany(targetEntity = SubcategoriaProducto.class, fetch = FetchType.LAZY, mappedBy = "categoria")
    private List<SubcategoriaProducto> subcategorias;

}
