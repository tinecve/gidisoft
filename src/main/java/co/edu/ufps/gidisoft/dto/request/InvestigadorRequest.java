package co.edu.ufps.gidisoft.dto.request;

public record InvestigadorRequest(
        String nombre,
        String orcid,
        String cvlac,
        String telefono,
        String foto
) {
}
