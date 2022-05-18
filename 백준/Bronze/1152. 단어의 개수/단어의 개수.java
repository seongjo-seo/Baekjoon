import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

// 1152번 단어의 개수
public class Main {
	public static void main(String[] args)throws IOException {
		try {
			BufferedReader rd = new BufferedReader(new InputStreamReader (System.in));
            StringTokenizer s_token = new StringTokenizer(rd.readLine(), " ");
            System.out.println(s_token.countTokens());
		}
		catch(IOException e) {
			System.out.println("error");
		}
	}
}