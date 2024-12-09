package co.edu.ufps.gidisoft.dto.response;

public record ProductoInvestigacionResponse(
        Long id,
        SubcategoriaProductoResponse subcategoria,
        InvestigadorResponse director,
        InvestigadorResponse coDirector,
        Integer anio,
        Integer mes,
        String resumen,
        String dio,
        String indicador,
        String beneficios,
        String impacto
) {
}
