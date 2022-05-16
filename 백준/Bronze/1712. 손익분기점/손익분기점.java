import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
// 1712번
public class Main {
	public static void main(String[] args)throws IOException {
		
		try {
			BufferedReader rd = new BufferedReader(new InputStreamReader (System.in));
			
			String text[] = rd.readLine().split(" ");
			int A = Integer.parseInt(text[0]);
			int B = Integer.parseInt(text[1]);
			int C = Integer.parseInt(text[2]);
			if(C<=B) {
				System.out.println("-1");
			}else {
				System.out.println((A/(C-B))+1);
			}
		}
		catch(IOException e) {
			System.out.println("error");
		}
	}
}
