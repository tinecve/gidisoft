package co.edu.ufps.gidisoft.dto.response;

public record SubcategoriaProductoResponse(
        Long id,
        String subcategoria,
        String descripcion,
        CategoriaProductoResponse categoria
) {
}
