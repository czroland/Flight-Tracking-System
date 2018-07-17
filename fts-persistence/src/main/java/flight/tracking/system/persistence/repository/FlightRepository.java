package flight.tracking.system.persistence.repository;


import flight.tracking.system.persistence.entity.FlightEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.Collection;
import java.util.List;

@Repository
public interface FlightRepository extends JpaRepository<FlightEntity, Long> {

    FlightEntity findById(Long id);

    FlightEntity findByAirplaneId(Long id);

    List<FlightEntity> findByDepartureDateBetweenAndOrderByDepartureDateAtDesc(LocalDateTime from, LocalDateTime to);
}
