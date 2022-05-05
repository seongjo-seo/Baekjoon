import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[]args) throws IOException {	
    	try {
			BufferedReader s_rd = new BufferedReader(new InputStreamReader (System.in));
			
			String text[] = s_rd.readLine().split(" ");
			int a = Integer.parseInt(text[0]);
			
			for(int i=a; i>=1;i--) {
				System.out.println(i);
			}
		}
		catch(IOException e) {
		}
	}
}