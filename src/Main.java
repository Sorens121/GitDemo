import utilities.FibonacciGenerator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the length for the series");
        int length = Integer.parseInt(br.readLine());
        List<Integer> result = FibonacciGenerator.getSeries(length);
        System.out.println("Output: ");
        for (int i = 0; i < result.size(); i++) {
            System.out.print(result.get(i) + " ");
        }
    }
}