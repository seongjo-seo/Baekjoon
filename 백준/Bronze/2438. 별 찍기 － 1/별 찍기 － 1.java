import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[]args) throws IOException {	
    	try {
			BufferedReader s_rd = new BufferedReader(new InputStreamReader (System.in));
			
			String text[] = s_rd.readLine().split(" ");
			int a = Integer.parseInt(text[0]);
			
			for(int i=0; i<a;i++) {
				for(int j=0;j<=i;j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
		catch(IOException e) {
		}
	}
}