package poc.youness.restApi.service;


import poc.youness.restApi.domain.Anomaly;

import java.util.List;

public interface AnomalyService {

    void saveAnomalies(List<Anomaly> anomalies);

    List<Anomaly> getAnomalies();

}
