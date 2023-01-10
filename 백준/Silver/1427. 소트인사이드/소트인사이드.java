import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			int sortNumber = Integer.parseInt(br.readLine());
			int array[] = new int[10];
			int i=0;
						
			for(;sortNumber>0;i++) {
				array[i] = sortNumber % 10;
				sortNumber /=10;
			}
			
			Arrays.sort(array);
			
			for(int j=9; j>9-i; j--) {
				System.out.print(array[j]);
			}
			
		}catch(IOException e) {
			System.out.println("error");
		}
	}
}