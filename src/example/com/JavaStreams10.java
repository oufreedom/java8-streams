package example.com;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class JavaStreams10 {

    public static void main(String[] args) throws IOException {

        // 10. Stream rows from CSV file and count
        Stream<String> rows1 = Files.lines(Paths.get("data.txt"));
        int rowCount = (int)rows1
                .map(x -> x.split(","))
                .filter(x -> x.length == 3)
                .count();
        System.out.println(rowCount + " rows.");
        //rows1.count(); //stream has already been operated upon or closed


    }
}


