package com.betrayalove;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SpbBaseParser {

    public static List<SpbBase> spbParser() throws IOException {
        FileReader fileReader = new FileReader("base.csv");
        CSVParser csvParser = CSVParser.parse(fileReader, CSVFormat.DEFAULT.withFirstRecordAsHeader());
        List<SpbBase> list = new ArrayList<>();
        for (CSVRecord x : csvParser) {
            SpbBase spbBase = new SpbBase(
                    x.get("number"),
                    x.get("address"),
                    x.get("snapshot"),
                    x.get("number_of_floor"),
                    x.get("appellation"),
                    x.get("prefix_code"),
                    x.get("year_construction"));
            list.add(spbBase);
        }
        return list;
    }
}
