package br.com.hrbackend.infrastructure.data.entityDB;

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
public class RelogioPontoDB implements Serializable {
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
    @JoinColumn(name = "enterprise_id")
    private EnterpriseDB enterprise;
}