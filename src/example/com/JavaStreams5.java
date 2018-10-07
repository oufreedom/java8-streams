package example.com;

import java.io.IOException;
import java.util.Arrays;

public class JavaStreams5 {

    public static void main(String[] args) throws IOException {

        // 5. Stream form Array, sort, filter and print
        String[] names = {"Al", "Ankit", "Kushal", "Brent", "Sarika", "amanda", "Hans", "Shivika", "Sarah"};
        Arrays.stream(names)
                .filter(x -> x.startsWith("S"))
                .sorted()
                .forEach(System.out::println);

    }
}


