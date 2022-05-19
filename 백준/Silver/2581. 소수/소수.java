import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 2581번 소수
public class Main {
	public static void main(String[] args) throws IOException{
		try {
			BufferedReader rd = new BufferedReader(new InputStreamReader (System.in));
			
			int M = Integer.parseInt(rd.readLine());
			int N = Integer.parseInt(rd.readLine());
			int sum=0, min=N;
			
			Loop : for(int i=M;i<=N;i++) {
				if(i==1) {
					continue;
				}
				for(int j=2;j<i;j++) {
					if(i%j==0) {
						continue Loop;
					}			
				}
				sum+=i;
				if(min>i) {
					min=i;
				}
			}
			if(sum==0) {
				System.out.println(-1);
			}else {
				System.out.println(sum);
				System.out.println(min);
			}
		}
		catch(IOException e) {
			System.out.println("error");
		}
	}
}