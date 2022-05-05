import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    public static void main(String[]args) throws IOException {	
    	try {
			BufferedReader s_rd = new BufferedReader(new InputStreamReader (System.in));
			BufferedWriter n_rd = new BufferedWriter(new OutputStreamWriter(System.out));
			
			int num = Integer.parseInt(s_rd.readLine());
			
			for(int i=0; i<num;i++) {
				String text = s_rd.readLine();
				n_rd.write(Integer.parseInt(text.split(" ")[0])+Integer.parseInt(text.split(" ")[1])+"\n");
			}
			n_rd.close();
		}
		catch(IOException e) {
		}
	}
}