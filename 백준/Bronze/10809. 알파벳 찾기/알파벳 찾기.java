import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
// 10809번
public class Main {
	public static void main(String[] args) {
		
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			String text = br.readLine();
			
			for(char a = 'a'; a<='z';a++) {
				System.out.print(text.indexOf(a)+ " ");
			}
			
		}catch(IOException e) {
			e.toString();
		}
	}
}