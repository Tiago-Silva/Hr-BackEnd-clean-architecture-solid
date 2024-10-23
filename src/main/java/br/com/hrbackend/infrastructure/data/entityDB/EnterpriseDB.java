package br.com.hrbackend.infrastructure.data.entityDB;

import br.com.hrbackend.domain.entity.Enterprise;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "enterprise")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class EnterpriseDB implements Serializable {
	@Serial
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@NotBlank
	@Size(max = 100)
	@Column(name = "trade_name")
	private String tradeName;

	@NotBlank
	@Size(max = 100)
	@Column(name = "enterprise_name")
	private String enterpriseName;

	@NotBlank
	@Size(max = 15)
	private String cnpj;

	@Column(name = "state_registration")
	private String stateRegistration;

	private String neighborhood;

	private String city;

	private String address;

	private String state;

	private String phone;

	private String logo;

	@Column(name = "is_branch")
	private boolean isBranch;

	@Column(name = "enterprise_parent")
	private int enterpriseParent;

	@Column(name = "is_head_office")
	private boolean isHeadOffice;

	private String status;

	@OneToMany(mappedBy = "enterprise", fetch = FetchType.LAZY)
	private List<UsuarioDB> usuarios;

	@OneToMany(mappedBy = "enterprise", fetch = FetchType.LAZY)
	private List<EmployeeDB> employeesDB;

	@OneToMany(mappedBy = "enterprise", fetch = FetchType.LAZY)
	private List<PeriodoDB> periodoDB;

	@OneToMany(mappedBy = "enterprise", fetch = FetchType.LAZY)
	private List<PontoDB> pontos;

	@OneToMany(mappedBy = "enterprise", fetch = FetchType.LAZY)
	private List<RelogioPontoDB> relogios;

	@OneToMany(mappedBy = "enterprise", fetch = FetchType.LAZY)
	private List<BeneficioDB> beneficios;

	public EnterpriseDB(Enterprise enterprise) {
		this.id = enterprise.getId();
		this.tradeName = enterprise.getTradeName();
		this.enterpriseName = enterprise.getEnterpriseName();
		this.cnpj = enterprise.getCnpj();
		this.stateRegistration = enterprise.getStateRegistration();
		this.neighborhood = enterprise.getNeighborhood();
		this.city = enterprise.getCity();
		this.address = enterprise.getAddress();
		this.state = enterprise.getState();
		this.phone = enterprise.getPhone();
		this.logo = enterprise.getLogo();
		this.isBranch = enterprise.isBranch();
		this.enterpriseParent = enterprise.getEnterpriseParent();
		this.isHeadOffice = enterprise.isHeadOffice();
		this.status = enterprise.getStatus();
	}
}