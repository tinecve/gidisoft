package co.edu.ufps.gidisoft.dto.request;

public record ProductoInvestigacionRequest(
        String titulo,
        Long subcategoria,
        Long director,
        Long coDirector,
        Integer anio,
        Integer mes,
        String resumen,
        String doi,
        String indicador,
        String beneficios,
        String impacto
) {
}
