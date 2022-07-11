import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.io.IOException;

public class Main {
	public static void main(String[] args) {
		try {
			BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
			StringBuilder sb = new StringBuilder();
			
			int num = Integer.parseInt(rd.readLine());
			int nums[]= new int[num];
			
			for(int i=0;i<nums.length;i++) {
				nums[i] = Integer.parseInt(rd.readLine());
			}
			Arrays.sort(nums);
			
			for(int i=0;i<nums.length;i++) {
				sb.append(nums[i]).append('\n');
			}
			System.out.println(sb);
		}catch(IOException e) {
			System.out.println("error");
		}
	}
}