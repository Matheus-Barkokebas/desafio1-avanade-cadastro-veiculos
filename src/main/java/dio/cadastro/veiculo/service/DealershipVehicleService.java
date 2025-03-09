package dio.cadastro.veiculo.service;

import dio.cadastro.veiculo.model.DealershipVehicle;

public interface DealershipVehicleService {

	DealershipVehicle findById(Long id);
	
	DealershipVehicle create(DealershipVehicle dealershipVehicleToCreate);
}
