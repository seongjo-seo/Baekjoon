import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
// 1110번
public class Main {
	public static void main(String[] args) throws IOException {
		
		try {
			BufferedReader rd = new BufferedReader(new InputStreamReader (System.in));
			int num = Integer.parseInt(rd.readLine());
			int tmp = num;
			int count=0;
			
			while(true) {
				// 10의 자리 수
				int a = num/10;
				// 1의 자리 수
				int b = num%10;
				// 한자리 숫자는 앞에 0을 붙여서 두 자릿수로 만든다.
                // 두 자리 숫자는 1의 자리가 다음 숫자의 10의 자리가 된다.
				num = b*10+(a+b)%10;
				// 순환 횟수
				count++;
				// 같으면 멈추기
				if(num==tmp) {
					break;
				}
			}
			System.out.println(count);			
		}
		catch(IOException e) {
			System.out.println("error");
		}
	}
}
