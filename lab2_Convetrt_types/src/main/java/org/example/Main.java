package org.example;

import java.io.IOException;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) throws IOException {
        ReactorParserYaml rp = new ReactorParserYaml();
        ArrayList<Reactor> reactors = rp.parse("./data/Reactors_yaml.yaml");
       // ArrayList<Reactor> reactors = rp.parse("./data/Reactors_json.json");
       for (Reactor reactor: reactors) {
            System.out.println(reactor.getClassReactor());
        }
    }
}