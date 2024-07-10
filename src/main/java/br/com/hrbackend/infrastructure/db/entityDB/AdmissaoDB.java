package br.com.hrbackend.infrastructure.db.entityDB;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serial;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Table(name = "admissao")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "idadmissao")
public class AdmissaoDB implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idadmissao;

    private Date data;

    @Column(name = "exame_admissional")
    private Date exameAdmissional;

    @Column(name = "periodo_experiencia")
    private String periodoExperiencia;

    @Column(name = "primeiro_emprego")
    private String primeiroEmprego;

    @Column(name = "contribuicao_social")
    private String contribuicaoSocial;

    private String departamento;

    private String cargo;

    private String periodo;

    @ManyToOne
    @JoinColumn(name = "funcionario_idfuncionario")
    private FuncionarioDB funcionario;
}