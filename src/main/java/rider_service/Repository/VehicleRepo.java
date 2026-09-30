package rider_service.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import rider_service.Entity.Vehicle;

@Repository
public interface VehicleRepo extends JpaRepository<Vehicle, Long> {

}
