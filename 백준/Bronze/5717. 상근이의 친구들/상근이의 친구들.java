import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
            
            while(true){
            	String text[] = br.readLine().split(" ");
                
                int boyFriend = Integer.parseInt(text[0]);
                int girlFriend =  Integer.parseInt(text[1]);
                
    			if(boyFriend == 0 && girlFriend == 0) {
    				break;
    			}
    			
    			System.out.println(boyFriend+girlFriend);
    		}
        }
        catch(IOException e) {
            System.out.println("error");
        }
    }
}