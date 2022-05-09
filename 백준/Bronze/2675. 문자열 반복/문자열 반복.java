import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
// 2675번 문제
public class Main {
	public static void main(String[]args) throws IOException {
		try {
			BufferedReader rd = new BufferedReader(new InputStreamReader (System.in));
			
			// 첫째 줄에 테스트 케이스의 개수가 주어진다.
			int T = Integer.parseInt(rd.readLine());
			
			for(int i=0; i<T; i++) {
				// 문자열 S를 입력 받는다.
				String S[] = rd.readLine().split(" ");
				// 반복할 값을 입력 받는다.
				int R = Integer.parseInt(S[0]);
				// 공백으로 잘라냈기 때문에 S의 1번에 들어오는 값은 문자의 첫번 째 값이다.
				String text = S[1];
				
				// text에 입력된 S[] 배열값을 반복해서 출력
				for(int j=0;j<text.length();j++) {
					for(int k=0;k<R;k++) {
                        // 스트링 타입을 문자열로 출력한다.
						System.out.print(text.charAt(j));
					}
				}
				System.out.println();
			}
		}
		catch(IOException e) {
			System.out.println("error");
		}
	}
}