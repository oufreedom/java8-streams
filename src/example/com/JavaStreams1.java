package example.com;

import java.io.IOException;
import java.util.stream.IntStream;

public class JavaStreams1 {

    public static void main(String[] args) throws IOException {

        // 1. Integer Stream
        IntStream
                .range(1, 10)
                .forEach(System.out::print); // System.out::print = System.out.print();
                //.forEach(System.out::println); // System.out::print = System.out.println();

    }
}
