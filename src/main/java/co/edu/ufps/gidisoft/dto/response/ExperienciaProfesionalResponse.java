package co.edu.ufps.gidisoft.dto.response;

import co.edu.ufps.gidisoft.entities.Investigador;

public record ExperienciaProfesionalResponse(
        Long id,
        String cargo,
        String empresa,
        Integer anioInicio,
        Integer mesInicio,
        Integer anioFin,
        Integer mesFin,
        InvestigadorResponse investigador,
        Boolean actualemente
) {
}
