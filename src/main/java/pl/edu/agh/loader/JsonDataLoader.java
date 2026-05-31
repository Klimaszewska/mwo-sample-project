package pl.edu.agh.loader;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.CollectionType;
import pl.edu.agh.model.PitStop;

import java.io.File;
import java.util.List;

public class JsonDataLoader implements IDataLoader {
    @Override
    public List<PitStop> load(String path) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            CollectionType listType = mapper.getTypeFactory()
                    .constructCollectionType(List.class, PitStop.class);
            return mapper.readValue(new File(path), listType);
        } catch (Exception e) {
            throw new RuntimeException("Failed to load data from: " + path, e);
        }
    }
}
