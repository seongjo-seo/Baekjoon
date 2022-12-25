import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
            
            while(true){
            String text[] = br.readLine().split(" ");
            
            int x = Integer.parseInt(text[0]);
            int y = Integer.parseInt(text[1]);
            
            if(x == 0 && y == 0) {
            	break;       		
            }
	            if(x>y)
					System.out.println("Yes");
				else {
					System.out.println("No");
	            }
        	}
        }
        catch(IOException e) {
            System.out.println("error");
        }
    }
}