import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[]args) throws IOException {	
    	try {
			BufferedReader s_rd = new BufferedReader(new InputStreamReader (System.in));
			
			String text= s_rd.readLine();
			int a = Integer.parseInt(text);
			
			for(int i=1; i<=a;i++) {
				for(int j=a;j>i;j--) {
					System.out.print(" ");
				}
				for(int j=0;j<i;j++) {
					System.out.print("*");					
				}
				System.out.println();
			}
		}
		catch(IOException e) {
		}
	}
}