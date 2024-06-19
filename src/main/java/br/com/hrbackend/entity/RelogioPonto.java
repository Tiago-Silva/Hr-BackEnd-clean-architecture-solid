package br.com.hrbackend.entity;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serial;
import java.io.Serializable;

@Entity
@Table(name = "relogio_ponto")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "idrelogioPonto")
public class RelogioPonto implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idrelogio_ponto")
    private int idrelogioPonto;

    private String rep;

    private String local;

    private String descricao;

    @ManyToOne
    @JoinColumn(name = "empresa_idempresa")
    private Empresa empresa;
}