import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			int testCase = Integer.parseInt(br.readLine());
			
			int yonsei[] = new int[9];
			int korea[] = new int[9];
			
			for(int i=0; i<testCase; i++) {
				int yonseiTotal = 0;
				int koreaTotal = 0;
				
				for(int j=0; j<9; j++) {
					String countNumber[] = br.readLine().split(" ");	
					yonsei[j] += Integer.parseInt(countNumber[0]);
					yonseiTotal += yonsei[j];
					
					korea[j] += Integer.parseInt(countNumber[1]);
					koreaTotal += korea[j];
				}
				
				if(yonseiTotal > koreaTotal) {
					System.out.println("Yonsei");
				}
				else if(yonseiTotal < koreaTotal) {
					System.out.println("Korea");
				}
				else {
					System.out.println("Draw");
				}
			}
			
		}catch(IOException e) {
			System.out.println("error");
		}
	}
}