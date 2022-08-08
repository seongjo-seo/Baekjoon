import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
// 3003번
public class Main {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			String text[] = br.readLine().split(" ");
			int cal[] = new int[text.length];
			int req[] = {1,1,2,2,2,8};
			
			for(int i=0;i<text.length;i++) {
				cal[i]= Integer.parseInt(text[i]);
			}
			
			for(int i=0;i<text.length;i++) {
				cal[i] = req[i]-cal[i];
				System.out.print(cal[i] + " ");
			}
			
		}catch(Exception e) {
			System.out.println(e.toString());
		}
	}
}