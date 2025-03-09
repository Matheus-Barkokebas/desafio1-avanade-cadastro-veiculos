package dio.cadastro.veiculo.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dio.cadastro.veiculo.model.DealershipVehicle;

@Repository
public interface DealershipVehicleRepository extends JpaRepository<DealershipVehicle, Long>{

}
