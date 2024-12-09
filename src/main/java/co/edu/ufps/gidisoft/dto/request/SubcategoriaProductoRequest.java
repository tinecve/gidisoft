package co.edu.ufps.gidisoft.dto.request;

public record SubcategoriaProductoRequest(
        String subcategoria,
        String descripcion,
        Long categoria
) {
}
