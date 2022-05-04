import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[]args) throws IOException {
		
		try {
			InputStreamReader i_num = new InputStreamReader (System.in);
			BufferedReader s_br = new BufferedReader(i_num);
			
			String text[] = s_br.readLine().split(" ");
			
			int a = Integer.parseInt(text[0]);
			int sum =0;
			
			for(int i=0; i<=a;i++) {
				sum += i;
			}
			System.out.println(sum);
		}
		catch(IOException e) {
		}
	}
}