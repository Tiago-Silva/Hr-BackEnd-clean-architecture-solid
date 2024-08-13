package br.com.hrbackend.infrastructure.db.entityDB;

import br.com.hrbackend.domain.entity.Periodo;
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

    public PeriodoDB(Periodo period) {
        this.idperiodo = period.getIdperiodo();
        this.entrada = period.getEntrada();
        this.saida = period.getSaida();
        this.intervaloEntrada = period.getIntervaloEntrada();
        this.intervaloSaida = period.getIntervaloSaida();
        this.jornada = period.getJornada();
        this.tipo = period.getTipo();
        this.empresa = new EmpresaDB(period.getEmpresa());
    }
}
