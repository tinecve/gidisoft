package co.edu.ufps.gidisoft.dto.response;

public record IdiomaInvestigadorResponse(
        Long id,
        IdiomaResponse idioma,
        InvestigadorResponse investigador,
        NivelIdiomaResponse nivelLectura,
        NivelIdiomaResponse nivelEscritura,
        NivelIdiomaResponse nivelHabla,
        NivelIdiomaResponse nivelEscucha
) {
}
