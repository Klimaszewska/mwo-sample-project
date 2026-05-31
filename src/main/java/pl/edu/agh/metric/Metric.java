package pl.edu.agh.metric;

import pl.edu.agh.model.PitStop;

import java.util.List;

public interface Metric<T> {

    T compute(List<PitStop> data);

}
