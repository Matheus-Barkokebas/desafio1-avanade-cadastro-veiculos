package dio.cadastro.veiculo.service.impl;

import java.util.NoSuchElementException;

import org.springframework.stereotype.Service;

import dio.cadastro.veiculo.model.DealershipVehicle;
import dio.cadastro.veiculo.model.repository.DealershipVehicleRepository;
import dio.cadastro.veiculo.service.DealershipVehicleService;

@Service
public class DealershipVehicleServiceImpl implements DealershipVehicleService {

	private final DealershipVehicleRepository dealershipVehicleRepository;

	public DealershipVehicleServiceImpl(DealershipVehicleRepository dealershipVehicleRepository) {
		this.dealershipVehicleRepository = dealershipVehicleRepository;
	}

	@Override
	public DealershipVehicle findById(Long id) {
		return dealershipVehicleRepository.findById(id).orElseThrow(NoSuchElementException::new);
	}

	@Override
	public DealershipVehicle create(DealershipVehicle dealershipVehicleToCreate) {
		return dealershipVehicleRepository.save(dealershipVehicleToCreate);
	}

}
