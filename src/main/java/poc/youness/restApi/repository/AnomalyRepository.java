package poc.youness.restApi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import poc.youness.restApi.domain.Anomaly;

@Repository
public interface AnomalyRepository extends JpaRepository<Anomaly, Long> {
}
