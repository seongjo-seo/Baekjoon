import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[]args) throws IOException {		
		try {
			BufferedReader s_rd = new BufferedReader(new InputStreamReader (System.in));
			
			String text = s_rd.readLine();
			String text_2 = s_rd.readLine();
			int x = Integer.parseInt(text);
			int y = Integer.parseInt(text_2);
			
			if(x>=0 && y>=0) {
				System.out.println("1");
			}else if(x<0 && y>=0){
				System.out.println("2");
			}else if(x<0 && y<0){
				System.out.println("3");
			}else if(x>=0 && y<0){
				System.out.println("4");
			}
		}
		catch(IOException e) {
		}
	}
}