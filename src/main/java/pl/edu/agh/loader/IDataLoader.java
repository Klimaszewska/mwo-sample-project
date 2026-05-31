package pl.edu.agh.loader;

import pl.edu.agh.model.PitStop;

import java.util.List;

public interface IDataLoader {
    List<PitStop> load(String path);
}
