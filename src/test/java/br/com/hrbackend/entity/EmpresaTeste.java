package br.com.hrbackend.entity;


import br.com.hrbackend.domain.entity.Empresa;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

@SpringBootTest
public class EmpresaTeste {

    private Empresa createEmployee() {
        Empresa empresa = new Empresa();
        empresa.setIdempresa(1);
        empresa.setNomeFantasia("Empresa Teste");
        empresa.setRazaoSocial("Empresa Teste LTDA");
        empresa.setCnpj("00.000.000/0001-91");
        empresa.setMatriz(true);
        empresa.setFilial(false);
        empresa.setStatus("Ativo");
        return empresa;
    }

    @Test
    public void shouldHaveRequiredFields() {
        Empresa empresa = this.createEmployee();

        assertThat(empresa.getIdempresa()).isEqualTo(1);
        assertThat(empresa.getNomeFantasia()).isEqualTo("Empresa Teste");
        assertThat(empresa.getRazaoSocial()).isEqualTo("Empresa Teste LTDA");
        assertThat(empresa.getCnpj()).isEqualTo("00.000.000/0001-91");
        assertThat(empresa.isMatriz()).isTrue();
        assertThat(empresa.isFilial()).isFalse();
        assertThat(empresa.getStatus()).isEqualTo("Ativo");
    }

    @Test
    public void shouldValidateCnpjFalse() {
        Empresa empresa = this.createEmployee();
        empresa.setCnpj("invalid cnpj");

        assertThatThrownBy(() -> {
            assertThat(empresa.getCnpj()).matches("\\d{2}\\.\\d{3}\\.\\d{3}\\/\\d{4}-\\d{2}");
        }).isInstanceOf(AssertionError.class);
    }

    @Test
    public void shouldValidateCnpjTrue() {
        Empresa empresa = this.createEmployee();
        empresa.setCnpj("00.000.000/0001-91");

        assertThat(empresa.getCnpj()).matches("\\d{2}\\.\\d{3}\\.\\d{3}\\/\\d{4}-\\d{2}");
    }
}