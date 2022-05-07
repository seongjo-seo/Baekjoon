import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{
    public static void main(String[]args) throws IOException {
		
		try {
			BufferedReader s_br = new BufferedReader(new InputStreamReader (System.in));
			
			byte text = (byte)s_br.readLine().charAt(0);			
			System.out.println(text);
		}
		catch(IOException e) {
		}
	}
}