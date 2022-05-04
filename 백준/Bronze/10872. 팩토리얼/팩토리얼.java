import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[]args) throws IOException {
		
		try {
			BufferedReader s_rd = new BufferedReader(new InputStreamReader (System.in));
			
			int num = Integer.parseInt(s_rd.readLine());
	    	int sum=1;
	    	
			for(int i=1;i<=num;i++) {
				sum = sum*i;
			}
			System.out.println(sum);
		}
		catch(IOException e) {
		}
	}
}
