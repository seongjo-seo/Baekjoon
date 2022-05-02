import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[]args) throws IOException {	
    	try {
			BufferedReader s_rd = new BufferedReader(new InputStreamReader (System.in));
			
			String text[] = s_rd.readLine().split(" ");

			double num[] = new double[5];
			int sum=0;			
			for(int i=0;i<5;i++) {
				num[i] = Integer.parseInt(text[i]);
				num[i] = Math.pow(num[i], 2);
				sum +=num[i];
			}
			System.out.print(sum%10);
		}
		catch(IOException e) {
		}
	}
}