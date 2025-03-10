package dio.cadastro.veiculo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "tb_vehicle")
public class Vehicle {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "vehicle_id")
	private Long id;

	@Column(name = "vehicle_plate", unique = true)
	private String plate;

	@Column(name = "vehicle_make")
	private String make;

	@Column(name = "vehicle_model")
	private String model;

	@Column(name = "vehicle_version")
	private String version;

	@Column(name = "vehicle_fabrication_year")
	private Integer year;

	@Column(name = "vehicle_color")
	private String color;

	@ManyToOne
	private DealershipVehicle dealershipVehicle;

}
