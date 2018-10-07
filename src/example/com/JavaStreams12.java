package example.com;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JavaStreams12 {

    public static void main(String[] args) throws IOException {

        // 12. Stream rows from CSV file, store fields in HashMap
        Stream<String> rows3 = Files.lines(Paths.get("data.txt"));
        Map<String, Integer> map = new HashMap<>();
        map = rows3
                .map(x -> x.split(","))
                .filter(x -> x.length == 3)
                .filter(x -> Integer.parseInt(x[1]) > 15)
                .collect(Collectors.toMap(
                        x -> x[0],
                        x -> Integer.parseInt(x[1])
                ));
        //rows3.count(); //stream has already been operated upon or closed
        for (String key : map.keySet()) {
            System.out.println(key + " " + map.get(key));
        }

    }
}


