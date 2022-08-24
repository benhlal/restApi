package poc.youness.restApi.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import poc.youness.restApi.domain.Anomaly;
import poc.youness.restApi.repository.AnomalyRepository;

import java.util.List;

@AllArgsConstructor
@Service
public class AnomalyServiceImpl implements AnomalyService {
    private AnomalyRepository anomalyRepository;

    @Override
    public void saveAnomalies(List<Anomaly> anomalies) {
        anomalyRepository.saveAll(anomalies);
    }

    @Override
    public List<Anomaly> getAnomalies() {
        List<Anomaly> all = anomalyRepository.findAll();
        return all;
    }
}
