import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
// 15829번
public class Main {
    public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			int num = Integer.parseInt(br.readLine());
			String text = br.readLine();

			long sum =0;
			long res=1;

			for(int i=0;i<num;i++) {
				sum += ((text.charAt(i)-96)*res)%1234567891;
				res = (res*31)%1234567891;
			}
			System.out.println(sum%1234567891);
		}catch(IOException e) {
			System.out.println(e.toString());
		}
	}
}