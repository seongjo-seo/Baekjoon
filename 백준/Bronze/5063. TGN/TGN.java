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
				int r = Integer.parseInt(data[0]);
				int e = Integer.parseInt(data[1]);
				int c = Integer.parseInt(data[2]);
				
				int res = e-c;
				
				if(r>res) {
					System.out.println("do not advertise");
				}else if (res>r) {
					System.out.println("advertise");
				}else {
					System.out.println("does not matter");
				}
			}
			
		}catch(IOException e) {
			System.out.println("error");
		}
	}
}