package example.com;

import java.io.IOException;
import java.util.stream.IntStream;

public class JavaStreams3 {

    public static void main(String[] args) throws IOException {

        // 3.
        System.out.println(IntStream
                                    .range(1, 10)
                                    .sum());

    }
}
