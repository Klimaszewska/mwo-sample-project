package pl.edu.agh.metric;

import pl.edu.agh.model.PitStop;
import java.util.List;

public class TotalCountMetric implements Metric<Integer> {
    @Override
    public Integer compute(List<PitStop> data) {
        return data.size();
    }
}