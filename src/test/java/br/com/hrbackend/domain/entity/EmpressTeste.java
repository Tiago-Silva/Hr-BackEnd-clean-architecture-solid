package br.com.hrbackend.domain.entity;


import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class EmpressTeste {

    private Empress createEmployee() {
        Empress empress = new Empress();
        empress.setIdempresa(1);
        empress.setNomeFantasia("Empresa Teste");
        empress.setRazaoSocial("Empresa Teste LTDA");
        empress.setCnpj("00.000.000/0001-91");
        empress.setMatriz(true);
        empress.setFilial(false);
        empress.setStatus("Ativo");
        return empress;
    }

    @Test
    public void shouldHaveRequiredFields() {
        Empress empress = this.createEmployee();

        assertThat(empress.getIdempresa()).isEqualTo(1);
        assertThat(empress.getNomeFantasia()).isEqualTo("Empresa Teste");
        assertThat(empress.getRazaoSocial()).isEqualTo("Empresa Teste LTDA");
        assertThat(empress.getCnpj()).isEqualTo("00.000.000/0001-91");
        assertThat(empress.isMatriz()).isTrue();
        assertThat(empress.isFilial()).isFalse();
        assertThat(empress.getStatus()).isEqualTo("Ativo");
    }

    @Test
    public void shouldValidateCnpjFalse() {
        Empress empress = this.createEmployee();
        empress.setCnpj("invalid cnpj");

        assertThatThrownBy(() -> {
            assertThat(empress.getCnpj()).matches("\\d{2}\\.\\d{3}\\.\\d{3}\\/\\d{4}-\\d{2}");
        }).isInstanceOf(AssertionError.class);
    }

    @Test
    public void shouldValidateCnpjTrue() {
        Empress empress = this.createEmployee();
        empress.setCnpj("00.000.000/0001-91");

        assertThat(empress.getCnpj()).matches("\\d{2}\\.\\d{3}\\.\\d{3}\\/\\d{4}-\\d{2}");
    }
}