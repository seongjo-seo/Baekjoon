import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
// 4344번
public class Main {
	public static void main(String[] args) throws IOException {
		
		try {
			BufferedReader rd = new BufferedReader(new InputStreamReader (System.in));
			int num = Integer.parseInt(rd.readLine());
			
			for(int i=0;i<num;i++) {
				int sum=0;
				double res=0;
				String cal[] = rd.readLine().split(" ");
				int student = Integer.parseInt(cal[0]);
				
				for(int j=1;j<=student;j++) {
					sum += Integer.parseInt(cal[j]);
				}
				res = (double)(sum/student);
				int count=0;
			
				for(int k=1;k<=student;k++) {
					if(Integer.parseInt(cal[k])>res) {
						count++;
					}
				}
				System.out.printf("%.3f", 100.0*count/student);
				System.out.println("%");
			}
		}
		catch(IOException e) {
			System.out.println("error");
		}
	}
}