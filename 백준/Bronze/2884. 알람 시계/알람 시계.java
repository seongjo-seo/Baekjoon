import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		try {
			BufferedReader rd = new BufferedReader(new InputStreamReader (System.in));
			String text[] = rd.readLine().split(" ");
			int H = Integer.parseInt(text[0]);
			int M = Integer.parseInt(text[1]);
			
            // H이 24을 넘지 않는다.
			// M이 60을 넘지 않는다.
			if(H>23) {
				H=0;
			}
			if(M>60) {
				M=0;
			}
            
			if(M<45) {
				H--;
				M =(60-(45-M));
				M = Math.abs(M);
				if(H<0) {
					H=23;
				}
			}else if (M>=45) {
				M-=45;
			}
			System.out.println(H + " "+ M);
		}
		catch(IOException e) {
			System.out.println("error");
		}
	}
}