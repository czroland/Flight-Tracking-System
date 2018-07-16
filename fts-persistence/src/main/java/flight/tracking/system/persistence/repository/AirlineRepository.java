package flight.tracking.system.persistence.repository;


import flight.tracking.system.persistence.entity.AirlineEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AirlineRepository extends JpaRepository<AirlineEntity, Long> {

    List<AirlineEntity> findAll();
}
