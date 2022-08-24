package poc.youness.restApi.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import poc.youness.restApi.domain.Anomaly;
import poc.youness.restApi.service.AnomalyService;

import java.util.List;

@RestController()
@RequestMapping(path = "/api/anomaly")
@AllArgsConstructor
public class AnomalyController {


    AnomalyService anomalyService;

    @PostMapping(path = "/save", consumes = "application/json", produces = "application/json")
    public void addEmployee(@RequestBody List<Anomaly> anomalyList) {
        anomalyService.saveAnomalies(anomalyList);
    }

    @GetMapping(path = "/getAll", produces = "application/json")
    public List<Anomaly> getAnomalies() {
        List<Anomaly> anomalies = anomalyService.getAnomalies();
        return anomalies;
    }

}
