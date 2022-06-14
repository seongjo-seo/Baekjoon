import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {		
		BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(rd.readLine());
		int b = Integer.parseInt(rd.readLine());
		System.out.println(a+b);
	}
}