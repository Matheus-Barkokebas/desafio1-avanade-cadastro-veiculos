package dio.cadastro.veiculo.service.impl;

import java.util.NoSuchElementException;

import org.springframework.stereotype.Service;

import dio.cadastro.veiculo.model.Vehicle;
import dio.cadastro.veiculo.model.repository.VehicleRepository;
import dio.cadastro.veiculo.service.VehicleService;

@Service
public class VehicleServiceImpl implements VehicleService{

	private final VehicleRepository vehicleRepository;
	
	public VehicleServiceImpl (VehicleRepository vehicleRepository) {
		this.vehicleRepository = vehicleRepository;
	}
	
	@Override
	public Vehicle findById(Long id) {
		return vehicleRepository.findById(id).orElseThrow(NoSuchElementException::new);
	}

	@Override
	public Vehicle create(Vehicle vehicleToCreate) {
		
		if(vehicleRepository.existsById(vehicleToCreate.getId())) {
			throw new IllegalArgumentException("This Id already exists.");
		}
		return vehicleRepository.save(vehicleToCreate);
	}

}
