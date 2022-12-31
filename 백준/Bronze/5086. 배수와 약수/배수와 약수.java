import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			while(true) {
				String text[]= br.readLine().split(" ");
                
				int firstNumber = Integer.parseInt(text[0]);
				int secondNumber = Integer.parseInt(text[1]);
				
				if(firstNumber == 0 && secondNumber == 0) {
					break;
				}
				
				if(secondNumber % firstNumber == 0) {
					System.out.println("factor");
				}
				else if(firstNumber % secondNumber == 0){
					System.out.println("multiple");
				}
				else {
					System.out.println("neither");
				}
			}
			
		}catch(IOException e) {
			System.out.println("error");
		}
	}
}