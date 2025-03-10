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

import dio.cadastro.veiculo.model.DealershipVehicle;
import dio.cadastro.veiculo.service.DealershipVehicleService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/dealership")
@Tag(name = "Concessionária", description = "API para gerenciamento de concessionárias")
public class DealershipVehicleController {

	private final DealershipVehicleService dealershipVehicleService;
	
	public DealershipVehicleController(DealershipVehicleService dealershipVehicleService) {
		this.dealershipVehicleService = dealershipVehicleService;
	}
	
	@GetMapping("/{id}")
    @Operation(summary = "Buscar Concessionárias", description = "Retorna uma lista de Concessionárias cadastrados")
	public ResponseEntity<DealershipVehicle> findById(@PathVariable Long id){
		var dealershipVehicle = dealershipVehicleService.findById(id);
	    return ResponseEntity.ok(dealershipVehicle);
	}
	
	@PostMapping
    @Operation(summary = "Criar Concessionárias", description = "Cria Concessionárias")
	public ResponseEntity<DealershipVehicle> create(@RequestBody DealershipVehicle dealershipVehicleToCreate){
		var dealershipVehicleCreated = dealershipVehicleService.create(dealershipVehicleToCreate);
		URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(dealershipVehicleCreated.getId())
                .toUri();
	    return ResponseEntity.created(location).body(dealershipVehicleCreated);
	}
}
