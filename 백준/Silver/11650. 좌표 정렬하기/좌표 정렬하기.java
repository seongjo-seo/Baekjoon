import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			int testCase = Integer.parseInt(br.readLine());
			
			int array[][] = new int[testCase][2];
			
			for(int i=0; i<testCase; i++) {
				String text[] = br.readLine().split(" ");
				array[i][0] = Integer.parseInt(text[0]);
				array[i][1] = Integer.parseInt(text[1]);
			}
			
			Arrays.sort(array, (x, y)->{
				if(x[0] == y[0]) {
					return x[1] - y[1];
				}
				else {
					return x[0] - y[0];
				}
			});
			
			for(int j=0; j<testCase; j++) {
				System.out.println( array[j][0] + " " + array[j][1]);
			}
			
		}catch(IOException e) {
			System.out.println("error");
		}
	}
}