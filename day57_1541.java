import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class day57_1541 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();
        String[] strArr1 = input.split("\\-");

        int minSum = 0;
        for (int i = 0; i < strArr1.length; i++) {

            String[] strArr2 = strArr1[i].split("\\+");

            int tempSum = 0;
            for (String x : strArr2) {

                tempSum += Integer.parseInt(x);
            }

            if (i == 0) tempSum *= -1;

            minSum -= tempSum;
        }

        System.out.println(minSum);
    }
}
