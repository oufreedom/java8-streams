package example.com;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JavaStreams13 {

    public static void main(String[] args) throws IOException {

        // 13. Reduction -sum
        double total = Stream.of(7.3, 1.5, 4.8)
                                .reduce(0.0, (Double a, Double b) -> a + b);
        System.out.println("Total = " + total);

    }
}


