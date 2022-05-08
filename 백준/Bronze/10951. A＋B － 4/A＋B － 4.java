import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
// 10951번 EOF 활용한 문제
public class Main {
	public static void main(String[]args) throws IOException {
		try {
			BufferedReader rd = new BufferedReader(new InputStreamReader (System.in));
			String num ="";
			
			while((num =rd.readLine()) !=null && !num.isEmpty()) {
				
				String text[] = num.split(" ");
				int A = Integer.parseInt((text[0]));
				int B = Integer.parseInt((text[1]));
				System.out.println(A+B);
			}
		}
		catch(IOException e) {
			System.out.println("error");
		}
	}
}
