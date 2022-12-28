import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			int testCase = Integer.parseInt(br.readLine());
			
			for(int i=0; i<testCase; i++) {
				String request[] = br.readLine().split(" ");
				
				double result = Double.parseDouble(request[0]);
				
				for(int j=1; j<request.length; j++) {
					if (request[j].equals("@")) {
						result *=3;
					}else if(request[j].equals("%")) {
						result += 5;
					}else if(request[j].equals("#")) {
						result -= 7;
					}
				}
				
				System.out.printf("%.2f\n", result);
			}
			
		}catch(IOException e) {
			System.out.println("error");
		}
	}
}