package utilities;

import java.util.ArrayList;
import java.util.List;

public class FibonacciGenerator {
    public static List<Integer> getSeries(int N) {
        List<Integer> output = new ArrayList<>();
        int a = 0, b = 1, c = 0;
        if(N == 0){
            output.add(a);
        }
        while(c < N){
            output.add(a);
            int x = a + b;
            a = b;
            b = x;
            c++;
        }

        return output;
    }
}
