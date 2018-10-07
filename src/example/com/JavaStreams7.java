package example.com;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class JavaStreams7 {

    public static void main(String[] args) throws IOException {

        // 7. Stream List, filter and print
        List<String> people = Arrays.asList("Al", "Ankit", "Kushal", "Brent", "Sarika", "amanda", "Hans", "Shivika", "Sarah");
        people.stream()
                .map(String::toLowerCase)
                .filter(x -> x.startsWith("a"))
                .forEach(System.out::println);

    }
}


