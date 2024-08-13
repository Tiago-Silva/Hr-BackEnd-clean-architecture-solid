package br.com.hrbackend.domain.entity;

import lombok.*;

import java.io.Serializable;
import java.sql.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "iddocumentos")
public class Documentos implements Serializable {
    private static final long serialVersionUID = 1L;

    private int iddocumentos;

    private String tipo;

    private String urlDocumento;

    private String nome;

    private String descricao;

    private int idfuncionario;

    private String funcionarioNome;

    private String departamento;

    private int empresa;

    private Date data;

    private int idfalta;

    private Employee employee;
}
