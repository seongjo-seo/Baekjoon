import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
// 2920번
public class Main {
	public static void main(String[] args)throws IOException {
		
		try {
			BufferedReader rd = new BufferedReader(new InputStreamReader (System.in));
			
			String text[] = rd.readLine().split(" ");
			int num[] = new int[text.length];
			String scale ="";
			
			for(int i=0;i<8;i++) {
				num[i] = Integer.parseInt(text[i]);
			}
			
			for(int i=0;i<num.length-1;i++) {
				if(num[i]==num[i+1]-1) {
					scale = "ascending";
				}else if(num[i]==num[i+1]+1) {
					scale = "descending";
				}else {
					scale = "mixed";
					break;
				}
			}
			System.out.println(scale);
		}
		catch(IOException e) {
			System.out.println("error");
		}
	}
}