package flight.tracking.system.persistence.repository;

import flight.tracking.system.persistence.entity.AirplaneEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AirplaneRepository extends JpaRepository<AirplaneEntity, Long> {

    List<AirplaneEntity> findAll();

    AirplaneEntity findById(Long id);

    AirplaneEntity findByCode(String code);
}
