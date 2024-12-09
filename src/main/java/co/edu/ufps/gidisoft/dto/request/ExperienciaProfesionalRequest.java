package co.edu.ufps.gidisoft.dto.request;

public record ExperienciaProfesionalRequest(
        String cargo,
        String empresa,
        Integer anioInicio,
        Integer mesInicio,
        Integer anioFin,
        Integer mesFin,
        Long investigador,
        Boolean actualmente
) {
}
