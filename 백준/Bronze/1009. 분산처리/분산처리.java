import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			int testCase = Integer.parseInt(br.readLine());
			
			for (int i=0; i<testCase; i++) {
				String data[] = br.readLine().split(" ");
				int A = Integer.parseInt(data[0]);
				int B = Integer.parseInt(data[1]);
				
				int res = 1;
				
				for (int j=0; j<B; j++) {
					res = (res*A)%10;
				}
                
                if(res == 0) {
                    res=10;
				}
				
				System.out.println(res);
			}
			
		}catch(IOException e) {
			System.out.println("error");
		}
	}
}