package br.com.hrbackend.domain.entity;

import lombok.*;

import java.io.Serializable;
import java.sql.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "idbeneficio")
public class Beneficio implements Serializable {
    private static final long serialVersionUID = 1L;

    private int idbeneficio;

    private String nome;

    private String tipo;

    private String calculoSaldo;

    private String custoEmpFolha;

    private String descricao;

    private String percentualSalario;

    private String eventoDesconto;

    private String operador;

    private Date dataCorte;

    private Date vencimentoContrato;

    private String custoEmp;

    private String empresaNome;

    private int idempresa;

    private Empresa empresa;
}

