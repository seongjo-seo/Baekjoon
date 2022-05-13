import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        String[] split = rd.readLine().split(" ");
        BigInteger A = new BigInteger(split[0]);
        BigInteger B = new BigInteger(split[1]);
        System.out.println(A.add(B));
    }
}
