import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
// 2480번
public class Main {
	public static void main(String[] args) throws IOException{	
		try {
			BufferedReader rd = new BufferedReader(new InputStreamReader (System.in));
			String text[] = rd.readLine().split(" ");
			
			int A = Integer.parseInt(text[0]);
			int B = Integer.parseInt(text[1]);
			int C = Integer.parseInt(text[2]);
			int max=0;
			
			if(A==B && A==C && B==C) {
				System.out.println(10000+(A*1000));
			}else if (A==B || A==C) {
				System.out.println(1000+(A*100));
			}else if (B==C) {
				System.out.println(1000+B*100);
			}else {				
				System.out.println(Math.max(A,Math.max(B,C))*100);
			}
		}
		catch(IOException e) {
			System.out.println("error");
		}
	}
}