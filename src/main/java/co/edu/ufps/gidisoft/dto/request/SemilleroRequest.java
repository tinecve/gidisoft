package co.edu.ufps.gidisoft.dto.request;

public record SemilleroRequest(
        String nombre,
        String descripcion,
        String logo,
        String sitioWeb,
        Long director
) {
}
