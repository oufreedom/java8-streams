package example.com;

import java.io.IOException;
import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class JavaStreams14 {

    public static void main(String[] args) throws IOException {

        // 14. Reduction -summary statistics
        IntSummaryStatistics summary = IntStream.of(7, 2, 19, 88, 73, 4, 10)
                .summaryStatistics();
        System.out.println(summary.);

    }
}


