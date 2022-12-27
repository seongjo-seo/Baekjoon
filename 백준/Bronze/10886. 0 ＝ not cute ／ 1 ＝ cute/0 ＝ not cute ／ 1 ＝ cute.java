import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		try {
			BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
			
			int input = Integer.parseInt(rd.readLine());
			int count = 0;
			
			for(int i=0; i<input; i++){
	            int number = Integer.parseInt(rd.readLine()); 
	            
	            if( number == 0){
	            	count++;
	            }
	            else if( number == 1 ){
	            	count--;
	            }
	        }
			
			if( count > 0 ){
	            System.out.println("Junhee is not cute!");
	        }
	        else if( count < 0 ){
	            System.out.println("Junhee is cute!");
	        }
			
		}catch(IOException e) {
			System.out.println("error");
		}
	}
}
