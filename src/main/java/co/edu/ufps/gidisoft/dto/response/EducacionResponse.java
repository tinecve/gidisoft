package co.edu.ufps.gidisoft.dto.response;

public record EducacionResponse(
        Long id,
        String titulo,
        String institucion,
        Integer inioFin,
        NivelEducativoResponse nivelEducativo,
        InvestigadorResponse investigador,
        Boolean enCurso) {
}
