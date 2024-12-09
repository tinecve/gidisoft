package co.edu.ufps.gidisoft.dto.request;

public record IdiomaInvestigadorRequest(
        Long investigador,
        Long idioma,
        Long nivelLectura,
        Long nivelEscritura,
        Long nivelHabla,
        Long nivelEscucha
) {
}
