package pl.edu.agh.metric;

import pl.edu.agh.model.PitStop;

import java.util.List;

public class LongestPitMetric implements Metric<PitStop> {

    @Override
    public PitStop compute(List<PitStop> data) {
        PitStop pitStop = data.get(0);
        double longest = 0.0;

        for (PitStop pS : data) {
            if (longest < pS.getPitDuration()) {
                longest = pS.getPitDuration();
                pitStop = pS;
            }
        }
        return pitStop;
    }
}
