package org.example;

import java.io.IOException;
import java.util.ArrayList;

public interface ReactorParser {
    public ArrayList<Reactor> parse(String filePath) throws IOException;
}
