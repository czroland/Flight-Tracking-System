package flight.tracking.system.persistence.repository;


import flight.tracking.system.persistence.entity.AirportEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AirportRepository extends JpaRepository<AirportEntity, Long> {

    List<AirportEntity> findAll();

    AirportEntity findById(Long id);

    AirportEntity findByCode(String code);
}
