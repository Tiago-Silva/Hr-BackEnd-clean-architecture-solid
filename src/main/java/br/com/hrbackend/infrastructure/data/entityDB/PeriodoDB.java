package br.com.hrbackend.infrastructure.data.entityDB;

import br.com.hrbackend.domain.entity.Period;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serial;
import java.io.Serializable;
import java.sql.Time;

@Entity
@Table(name = "periodo")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "idperiodo")
public class PeriodoDB implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idperiodo;

    private Time entrada;

    private Time saida;

    @Column(name = "intervalo_entrada")
    private Time intervaloEntrada;

    @Column(name = "intervalo_saida")
    private Time intervaloSaida;

    private String jornada;

    private String tipo;

    @ManyToOne
    @JoinColumn(name = "empresa_idempresa")
    private EmpresaDB empresa;

    public PeriodoDB(Period period) {
        this.idperiodo = period.getIdperiodo();
        this.entrada = period.getStartTime();
        this.saida = period.getEndTime();
        this.intervaloEntrada = period.getBreakStart();
        this.intervaloSaida = period.getBreakEnd();
        this.jornada = period.getWorkday();
        this.tipo = period.getType();
        this.empresa = new EmpresaDB(period.getEnterprise());
    }
}
