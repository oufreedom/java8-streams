package example.com;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class JavaStreams9 {

    public static void main(String[] args) throws IOException {

        // 9. Stream rows from text file and save to List
        List<String> bands2 = Files.lines(Paths.get("bands.txt"))
                .filter(x -> x.contains("Sa"))
                .collect(Collectors.toList());

        bands2.forEach(System.out::println);
        //bands.count();  //stream has already been operated upon or closed

    }
}


