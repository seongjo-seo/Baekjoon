import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Main{
    public static void main(String[]args) throws IOException {
        try {
            InputStreamReader i_num = new InputStreamReader (System.in);
			BufferedReader s_br = new BufferedReader(i_num);
			
			String text[] = s_br.readLine().split(" ");
			
			int A = Integer.parseInt(text[0]);
			int B = Integer.parseInt(text[1]);
			
			if(A<B) {
				System.out.print('<');
			}else if(A>B) {
				System.out.print('>');
			}else if(A==B) {
				System.out.print("==");
			}
		}
		catch(IOException e) {
		}
	}
}