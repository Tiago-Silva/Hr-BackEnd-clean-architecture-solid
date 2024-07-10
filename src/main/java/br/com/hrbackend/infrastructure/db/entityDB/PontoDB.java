package br.com.hrbackend.infrastructure.db.entityDB;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serial;
import java.io.Serializable;
import java.sql.Date;
import java.sql.Time;

@Entity
@Table(name = "ponto")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "idponto")
public class PontoDB implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idponto;

    private String cracha;

    private Date data;

    private Time hora;

    private Time entrada;

    private Time saida;

    @Column(name = "intervalo_saida")
    private Time intervaloSaida;

    @Column(name = "intervalo_entrada")
    private Time intervaloEntrada;

    private String rep;

    private String nsr;

    private String pis;

    private String funcionario;

    private int idfuncionario;

    private String cnpj;

    @Column(name = "empresa_nome")
    private String empresaNome;

    @Column(name = "atrasado_entrada")
    private boolean atrasadoEntrada;

    @ManyToOne
    @JoinColumn(name = "empresa_idempresa")
    private EmpresaDB empresa;
}