import java.util.Arrays;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[]args) throws IOException {
    	try {
    		// 최댓값
    		final int MAX = 1000000;
			BufferedReader s_rd = new BufferedReader(new InputStreamReader (System.in));
			String text[] = s_rd.readLine().split(" ");
			// M = 시작 N = 끝
			int M = Integer.parseInt(text[0]);
			int N = Integer.parseInt(text[1]);
			// 소수 값 확인을 위한 배열 선언 및 최대 크기 지정
			boolean is_Prime[]= new boolean[MAX];
			// 모든 배열 Arrays 클래스를 사용해서 false로 변경
			Arrays.fill(is_Prime, false);
			// 0과 1은 소수가 아니다. = true 값으로 변경
			is_Prime[0] = is_Prime[1]=true;
			
			for(int i=2;i<=N;i++){
				for(int j=2;i*j<=N;j++) {
					is_Prime[i*j]=true;
				}
			}
			for(int i=M;i<=N;i++){
				if(is_Prime[i]==false)
					System.out.println(i);
			}
		}
		catch(IOException e) {
		}
	}
}