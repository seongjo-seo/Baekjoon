import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
// 3052번
public class Main {
	public static void main(String[] args)throws IOException {

		try {
			BufferedReader rd = new BufferedReader(new InputStreamReader (System.in));
			
			int B = 42, count=0;
			int num[] = new int[10];
			
			// 10개의 값 입력 
			for(int i=0;i<=9;i++) {
				int A = Integer.parseInt(rd.readLine());
				num[i] = A%B;
			}

			for(int j=0;j<=9;j++) {
				int res=0;
				for(int i=j+1;i<=9;i++) {
					if(num[i]==num[j]){
						res++;
					}	
				}
				if(res==0) {
					count++;
				}
			}
			System.out.println(count);
		}
		catch(IOException e) {
			System.out.print("error");
		}
	}
}