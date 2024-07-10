package br.com.hrbackend.infrastructure.dto;

import java.sql.Time;

public record PeriodoResponseDTO(
        int idperiodo,
        Time entrada,
        Time saida,
        Time intervaloEntrada,
        Time intervaloSaida,
        String jornada,
        String tipo,
        EmpresaResponseDTO empresa
) {
}
