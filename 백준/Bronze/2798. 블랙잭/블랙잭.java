import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
// 2798번
public class Main {
    public static void main(String[]args) throws IOException {
    	try {
			BufferedReader s_rd = new BufferedReader(new InputStreamReader (System.in));

			String text[] = s_rd.readLine().split(" ");
			// 카드 수, 블랙잭 (커트라인 값)
			int N = Integer.parseInt(text[0]);
			int M = Integer.parseInt(text[1]);
			// 카드 수 초기화
			int card[] = new int[N];
			// 근사치 합 값
			int sum=0, res=0;
			
			// 입력
			String num[] = s_rd.readLine().split(" ");
			for(int i=0;i<N;i++) {
				card[i] = Integer.parseInt(num[i]);
			}
			// 각 자리 수 연산
			for(int i=0;i<N;i++) {
				for(int j=i+1;j<N;j++) {
					for(int k=j+1;k<N;k++) {
						sum = card[i] + card[j] + card[k];
						if(sum<=M && res<sum) {
							res=sum;
						}
					}
				}
			}
			System.out.println(res);
		}
		catch(IOException e) {
			System.out.println("Error");
		}
	}
}