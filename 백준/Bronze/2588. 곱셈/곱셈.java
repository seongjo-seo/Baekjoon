import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
// 2588 번
public class Main {
    public static void main(String[]args) throws IOException {
		
		try {
			BufferedReader s_rd = new BufferedReader(new InputStreamReader (System.in));
			
			String text = s_rd.readLine();
			int A = Integer.parseInt(text);
			
            // 문자열로 입력받은 값을 각 자리로 나눠서 곱을 이뤄준다.
			String texts = s_rd.readLine();			
			int one = Integer.parseInt(texts.substring(2, 3));
			int two = Integer.parseInt(texts.substring(1, 2));
			int three = Integer.parseInt(texts.substring(0, 1));
			
			System.out.println(A*one);
			System.out.println(A*two);
			System.out.println(A*three);
			System.out.println(A*Integer.parseInt(texts));
		}
		catch(IOException e) {
		}
	}
}
