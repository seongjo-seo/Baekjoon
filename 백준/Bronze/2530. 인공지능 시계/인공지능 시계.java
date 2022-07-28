import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String text[] = br.readLine().split(" ");
			int req = Integer.parseInt(br.readLine());
			
			int A = Integer.parseInt(text[0]); // 시
			int B = Integer.parseInt(text[1]); // 분
			int C = Integer.parseInt(text[2]); // 초
			
			B += req/60;
			C += req%60;
			
			B += C / 60;
			C = C % 60;
			
			A += B / 60;
			B = B % 60;
			
			A = A % 24;
			System.out.println(A + " " + B + " " + C);
			
		}catch(IOException e) {
			System.out.println(e.toString());
		}
	}
}