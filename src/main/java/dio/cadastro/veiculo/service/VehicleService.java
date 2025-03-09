package dio.cadastro.veiculo.service;

import dio.cadastro.veiculo.model.Vehicle;

public interface VehicleService {
	
	Vehicle findById(Long id);
	
	Vehicle create(Vehicle vehicleToCreate);
}
