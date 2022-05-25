import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
// 2609번
public class Main {
	public static void main(String[] args)throws IOException {
		try {
			BufferedReader rd = new BufferedReader(new InputStreamReader (System.in));
			
			String text[] = rd.readLine().split(" ");
			
			int A = Integer.parseInt(text[0]);
			int B = Integer.parseInt(text[1]);

			for(int i=B;i>0;i--) {
				if(A%i==0 && B%i==0) {
					System.out.println(i);
					break;
				}
			}
			for(int i=A;i<Math.pow(10000,2);i++) {
				if(i%A==0 && i%B==0) {
					System.out.println(i);
					break;
				}
			}
			
		}
		catch(IOException e) {
			System.out.println("error");
		}
	}
}