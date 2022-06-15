import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
// 1789번
public class Main {
	public static void main(String[] args) throws IOException {
		
		try {
			BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
			
			Long N = Long.parseLong(rd.readLine());
			Long S = 0L;
			int count=0;
			
			for(int i=1;;i++) {
				if(S>N) {
					break;
				}
				S+=i;
				count++;
			}
			System.out.println(count-1);
		}
		catch(IOException e) {
			System.out.println("error");
		}
	}
}