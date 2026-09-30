package rider_service.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import rider_service.Entity.Rider;

public interface RiderRepo extends JpaRepository<Rider, Long> {

}
