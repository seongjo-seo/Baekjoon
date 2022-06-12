import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;
// 5635번
public class Main {
	public static void main(String[] args) throws IOException {
		try {
			BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
			
			int n = Integer.parseInt(rd.readLine());
			String text[][] = new String[n][4];
			
			for(int i=0; i<n;i++) {
				StringTokenizer st = new StringTokenizer(rd.readLine());
				text[i][0] = st.nextToken();
				text[i][1] = st.nextToken();
				text[i][2] = st.nextToken();
				text[i][3] = st.nextToken();
			}
			
			Arrays.sort(text, new Comparator<String[]>() {
				@Override
				public int compare(String test1[], String test2[]) {
					// 연도가 같은 경우 달을 비교
					if(test1[3].equals(test2[3])) {
						// 달이 같은 경우
						if(test1[2].equals(test2[2])) {
							// 날짜 차이 반환
							return Integer.parseInt(test1[1]) - Integer.parseInt(test2[1]);
						}
						return Integer.parseInt(test1[2]) - Integer.parseInt(test2[2]);
					}
					return Integer.parseInt(test1[3]) - Integer.parseInt(test2[3]);
				}
			});
			System.out.println(text[n - 1][0] + "\n" + text[0][0]);
			
		}catch(IOException e) {
			System.out.println("error");
		}
	}
}