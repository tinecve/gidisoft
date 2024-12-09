package co.edu.ufps.gidisoft.dto.response;

public record InvestigadorResponse(
        Long id,
        String nombre,
        String orcid,
        String cvlac,
        String telefono,
        String foto
) {
}
