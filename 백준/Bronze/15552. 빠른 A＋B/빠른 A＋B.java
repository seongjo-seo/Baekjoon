import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[]args) throws IOException {	
    	try {
			BufferedReader s_rd = new BufferedReader(new InputStreamReader (System.in));
			BufferedWriter n_rd = new BufferedWriter(new OutputStreamWriter(System.out));
			
			int num = Integer.parseInt(s_rd.readLine());
			
			for(int i=0; i<num;i++) {
				String text = s_rd.readLine();
				StringTokenizer st = new StringTokenizer(text);
				n_rd.write(Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken())+"\n");
			}
			n_rd.close();
		}
		catch(IOException e) {
		}
	}
}