import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[]args) throws IOException {
    	try {
			BufferedReader s_rd = new BufferedReader(new InputStreamReader (System.in));

			int count_num = Integer.parseInt(s_rd.readLine());
			int count=0, stack=0;
			
			StringTokenizer st_num = new StringTokenizer(s_rd.readLine());
			int num;
			
			for(int i=0;i<count_num;i++) {
				num = Integer.parseInt(st_num.nextToken());
				for(int j=1;j<=num;j++) {
					if(num%j==0) {
						count++;
					}
				}
				if(count==2)
					stack++;
				count=0;
			}
			System.out.println(stack);
			
		}
		catch(IOException e) {
		}
	}
}