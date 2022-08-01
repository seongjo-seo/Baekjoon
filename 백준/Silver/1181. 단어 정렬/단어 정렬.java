import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.io.IOException;
// 1181번
public class Main {
	public static void main(String[] args) {
		try {
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			int arr_num = Integer.parseInt(br.readLine());
			
			String text[] = new String [arr_num];
			
			for(int i=0;i<arr_num;i++) {
				String data = br.readLine();
				text[i] = data;
			}
			Arrays.sort(text);
			Arrays.sort(text, new Comparator<String>() {
				@Override
				public int compare(String test1, String test2) {
					return test1.length() - test2.length();
				}
			});
			
			text = Arrays.stream(text).distinct().toArray(String[]::new); // 중복 제거
			for(int k=0;k<text.length;k++) {
				System.out.println(text[k]);
			}
		}catch(IOException e) {
			System.out.println(e.toString());
		}
	}
}