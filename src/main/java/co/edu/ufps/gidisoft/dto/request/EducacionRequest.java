package co.edu.ufps.gidisoft.dto.request;

public record EducacionRequest(
        String titulo,
        String institucion,
        Integer anioFin,
        Long nivelEducativo,
        Long investigador,
        Boolean enCurso
) {
}
