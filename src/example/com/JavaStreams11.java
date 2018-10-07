package example.com;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class JavaStreams11 {

    public static void main(String[] args) throws IOException {

        // 11. Stream rows from CSV file, parse data from rows
        Stream<String> rows2 = Files.lines(Paths.get("data.txt"));
        rows2
            .map(x -> x.split(","))
            .filter(x -> x.length == 3)
            .filter(x -> Integer.parseInt(x[1]) > 15)
            .forEach(x -> System.out.println(x[0] + " " + x[1] + " " + x[2]));
        //rows2.count(); //stream has already been operated upon or closed


    }
}


