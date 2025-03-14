package dio.cadastro.veiculo.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dio.cadastro.veiculo.model.Vehicle;

@Repository
public interface VehicleRepository extends JpaRepository<Vehicle, Long>{

}
