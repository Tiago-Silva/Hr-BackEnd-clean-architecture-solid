package br.com.hrbackend.infrastructure.data.entityDB;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.sql.Date;

@Entity
@Table(name = "documentos")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "iddocumentos")
public class DocumentosDB implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int iddocumentos;

    private String tipo;

    @Column(name = "url_documento")
    private String urlDocumento;

    private String nome;

    private String descricao;

    private int idfuncionario;

    @Column(name = "funcionario_nome")
    private String funcionarioNome;

    private String departamento;

    private int empresa;

    private Date data;

    private int idfalta;

    @ManyToOne
    @JoinColumn(name = "funcionario_idfuncionario")
    private EmployeeDB funcionario;
}