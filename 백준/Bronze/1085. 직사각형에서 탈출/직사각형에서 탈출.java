import java.io.BufferedReader;
import java.io.InputStreamReader;
// 1085번
public class Main {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			String text[] = br.readLine().split(" ");
			
			int x = Integer.parseInt(text[0]);
			int y = Integer.parseInt(text[1]);
			int w = Integer.parseInt(text[2]);
			int h = Integer.parseInt(text[3]);
			
			int x_min = Math.min(x, w-x);
			int y_min = Math.min(y, h-y);
			
			int res = x_min>y_min?y_min:x_min;
			
			System.out.println(res);
			
		}catch(Exception e) {
			System.out.println(e.toString());
		}
	}
}