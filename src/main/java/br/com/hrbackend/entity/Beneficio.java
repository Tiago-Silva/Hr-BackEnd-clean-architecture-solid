package br.com.hrbackend.entity;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.sql.Date;

@Entity
@Table(name = "beneficio")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "idbeneficio")
public class Beneficio implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idbeneficio;

    private String nome;

    private String tipo;

    @Column(name = "calculo_saldo")
    private String calculoSaldo;

    @Column(name = "custo_emp_folha")
    private String custoEmpFolha;

    private String descricao;

    @Column(name = "percentual_salario")
    private String percentualSalario;

    @Column(name = "evento_desconto")
    private String eventoDesconto;

    private String operador;

    @Column(name = "data_corte")
    private Date dataCorte;

    @Column(name = "vencimento_contrato")
    private Date vencimentoContrato;

    @Column(name = "custo_emp")
    private String custoEmp;

    @Column(name = "empresa_nome")
    private String empresaNome;

    private int idempresa;

    @ManyToOne
    @JoinColumn(name = "empresa_idempresa")
    private Empresa empresa;
}