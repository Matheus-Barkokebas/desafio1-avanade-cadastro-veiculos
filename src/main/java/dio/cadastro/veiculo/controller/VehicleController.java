package dio.cadastro.veiculo.controller;

import java.net.URI;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import dio.cadastro.veiculo.model.Vehicle;
import dio.cadastro.veiculo.service.VehicleService;

@RestController
@RequestMapping("/vehicle")
public class VehicleController {
	
private final VehicleService vehicleService;
	
	public VehicleController(VehicleService vehicleService) {
		this.vehicleService = vehicleService;
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Vehicle> findById(@PathVariable Long id){
		var vehicle = vehicleService.findById(id);
	    return ResponseEntity.ok(vehicle);
	}
	
	@PostMapping
	public ResponseEntity<Vehicle> create(@RequestBody Vehicle vehicleToCreate){
		var vehicleCreated = vehicleService.create(vehicleToCreate);
		URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(vehicleCreated.getId())
                .toUri();
	    return ResponseEntity.created(location).body(vehicleCreated);
	}
}
