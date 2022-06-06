import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
// 25238번
public class Main {
	public static void main(String[] args) throws IOException {
		try {
			BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
			int num = Integer.parseInt(rd.readLine());
			int count=1;
			
			if(num==1) {
				System.out.print(count);
			}
			else {
				int cal=2;
				while(cal<=num) {
					cal+=count*6;
					count++;
				}
				System.out.print(count);
			}
		}catch(IOException e) {
			System.out.println("error");
		}
	}
}