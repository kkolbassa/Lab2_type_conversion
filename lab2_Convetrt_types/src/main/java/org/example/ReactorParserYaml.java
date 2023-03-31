package org.example;

import org.yaml.snakeyaml.Yaml;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Map;

public class ReactorParserYaml {
    public ArrayList<Reactor> parse(String filePath) throws FileNotFoundException {
        Yaml yaml = new Yaml();
        ArrayList<Map<String, Object>> reactors = yaml.load(new FileInputStream(filePath));
        ArrayList<Reactor> result = new ArrayList<>();

        for (Map<String, Object> reactor : reactors) {
            String name = reactor.keySet().iterator().next();
            Map<String, Object> reactorData = (Map<String, Object>) reactor.get(name);
            Reactor r = new Reactor(
                    name,
                    (String) reactorData.get("class"),
                    Double.valueOf(String.valueOf( reactorData.get("burnup"))),
                    Double.valueOf(String.valueOf( reactorData.get("kpd"))),
                    Double.valueOf(String.valueOf( reactorData.get("enrichment"))),
                    Double.valueOf(String.valueOf( reactorData.get("termal_capacity"))),
                    Double.valueOf(String.valueOf( reactorData.get("electrical_capacity"))),
                    (int) reactorData.get("life_time"),
                    Double.valueOf(String.valueOf(  reactorData.get("first_load"))),
                    "yaml"
            );
            result.add(r);
        }
        return result;
    }
}
