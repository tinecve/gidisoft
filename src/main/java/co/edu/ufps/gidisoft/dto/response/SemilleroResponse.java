package co.edu.ufps.gidisoft.dto.response;

public record SemilleroResponse(
        Long id,
        String nombre,
        String descripcion,
        String logo,
        String sitioWeb,
        InvestigadorResponse director
) {
}
