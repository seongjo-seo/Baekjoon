import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
// 10430번 간단한 사칙연산 
public class Main {
    public static void main(String[]args) throws IOException {
		
		try {
			BufferedReader s_rd = new BufferedReader(new InputStreamReader (System.in));
			
			String text[] = s_rd.readLine().split(" ");
			
			int A = Integer.parseInt(text[0]);
			int B = Integer.parseInt(text[1]);
			int C = Integer.parseInt(text[2]);
			
			System.out.println((A+B)%C);
			System.out.println(((A%C) + (B%C))%C);
			System.out.println((A*B)%C);
			System.out.println(((A%C)*(B%C))%C);
			
		}
		catch(IOException e) {
		}
	}
}
