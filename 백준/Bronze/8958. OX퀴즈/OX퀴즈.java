import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
// 8958번 문제
public class Main {
	public static void main(String[] args) throws IOException{	
		try {
			BufferedReader rd = new BufferedReader(new InputStreamReader (System.in));
			
			int text_num = Integer.parseInt(rd.readLine());
            // 합 값, O일 경우 연산용 변수
			int sum=0, O=0;
            // 반복 값 입력
			for(int i=0;i<text_num;i++) {
                // ox 작동할 값, 초기화
				String ox = rd.readLine();
				sum=0;
                O=0;
				for(int j=0;j<ox.length();j++) {
					if(ox.charAt(j)!='O'){
						O=0;
					}else if(ox.charAt(j)=='O') {
						O++;
						sum +=O;
					}
				}
				System.out.println(sum);
			}
		}
		catch(IOException e) {
			System.out.println("error");
		}
	}
}