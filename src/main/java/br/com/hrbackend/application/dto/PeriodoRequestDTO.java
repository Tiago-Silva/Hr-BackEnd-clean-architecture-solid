package br.com.hrbackend.application.dto;

import java.sql.Time;

public record PeriodoRequestDTO(
        Time entrada,
        Time saida,
        Time intervaloEntrada,
        Time intervaloSaida,
        String jornada,
        String tipo,
        EmpresaResponseDTO empresa
) {
}
