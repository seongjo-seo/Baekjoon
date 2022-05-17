import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
// 4153
public class Main {
	public static void main(String[] args)throws IOException {
		
		try {
			BufferedReader rd = new BufferedReader(new InputStreamReader (System.in));
			for(;;) {
				String test[] = rd.readLine().split(" ");
				int A = Integer.parseInt(test[0]);
				int B = Integer.parseInt(test[1]);
				int C = Integer.parseInt(test[2]);
				
				if(A==0 && B==0 && C==0) {
					break;
				}
				if((Math.pow(A,2)+Math.pow(B,2)==Math.pow(C,2)) || (Math.pow(B,2)+Math.pow(C,2)==Math.pow(A,2))
						|| (Math.pow(A,2)+Math.pow(C,2)==Math.pow(B,2))) {
					System.out.println("right");
				}else {
					System.out.println("wrong");
				}
			}
		}
		catch(IOException e) {
			System.out.println("error");
		}
	}
}