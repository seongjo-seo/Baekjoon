import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			int Xcm = Integer.parseInt(br.readLine());
			int req = 64;
			int count = 0;
			
			while(Xcm > 0) {
				if(req > Xcm) {
					req /= 2;
				}
				else{
					Xcm -= req;					
					count++;
				}
			}
			
			System.out.println(count);
			
		}catch(IOException e) {
			System.out.println("error");
		}
	}
}