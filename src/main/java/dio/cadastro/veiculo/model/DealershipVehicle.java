package dio.cadastro.veiculo.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "tb_dealership_vehicle")
public class DealershipVehicle {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "dealership_vehicle_id")
	private Long id;

	@Column(name = "dealership_vehicle_name")
	private String name;

	@Column(name = "dealership_vehicle_cnpj",unique = true)
	private String cnpj;

	@Column(name = "dealership_vehicle_phone_number",unique = true)
	private String phoneNumber;
	
	@OneToMany(mappedBy = "dealershipVehicle", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Vehicle> vehicle;

}
