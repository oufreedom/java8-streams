package example.com;

import java.io.IOException;
import java.util.stream.Stream;

public class JavaStreams4 {

    public static void main(String[] args) throws IOException {

        // 4. Stream.of, sorted and findFirst
        Stream.of("Ava", "Aneri", "Alberto")
                .sorted()
                .findFirst()
                .ifPresent(System.out::println);
    }
}


