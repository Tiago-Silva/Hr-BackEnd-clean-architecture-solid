package br.com.hrbackend.entity;

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
public class Periodo implements Serializable {
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
    private Empresa empresa;
}
