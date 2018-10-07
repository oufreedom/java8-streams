package example.com;

import java.io.IOException;
import java.util.stream.IntStream;

public class JavaStreams2 {

    public static void main(String[] args) throws IOException {

        // 2.
        IntStream
                .range(1, 10)
                .skip(5)
                .forEach(x -> System.out.println(x));
    }
}

