import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[]args) throws IOException {
    	try {
			BufferedReader s_rd = new BufferedReader(new InputStreamReader (System.in));
			String text[] = s_rd.readLine().split(" ");
			// M = 시작 N = 끝
			int M = Integer.parseInt(text[0]);
			int N = Integer.parseInt(text[1]);
			boolean is_Prime[] = new boolean[N+1];
			
			for(int i=2;i<=N;i++){
				if(is_Prime[i])
					continue;
				// boolean은 초기화시 기본 false을 갖는다.
					
				for(int j=2;i*j<=N;j++) {
					is_Prime[i*j]=true;
				}
			}
			is_Prime[0] = is_Prime[1] =true;
			for(int i=M;i<=N;i++){
				if(is_Prime[i]==false)
					System.out.println(i);
			}
		}
		catch(IOException e) {
		}
	}
}
// https://www.acmicpc.net/source/12599998 참조