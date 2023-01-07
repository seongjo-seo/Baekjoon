import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			int testCase = Integer.parseInt(br.readLine());
			
			char text[] = br.readLine().toCharArray();

			for (int i=0; i<testCase-1; i++) {
				char data[] = br.readLine().toCharArray();
				
				for(int j=0; j<text.length; j++) {
					if(text[j] != data[j]) {
						text[j] = '?';
					}
				}
			}
			
			System.out.print(text);
			
		}catch(IOException e) {
			System.out.println("error");
		}
	}
}