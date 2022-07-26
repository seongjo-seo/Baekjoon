import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

// 문자열 비교 1157번
public class Main {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
						
			String text = br.readLine().toUpperCase();
			char Qt = '?';
			int max = 0;
			
			
			int data[] = new int[26];
			
			for(int i=0;i<text.length();i++) {
				data[(int)text.charAt(i) - 'A']++;
			}
			
			for(int j=0;j<data.length;j++) {
				if(max < data[j]) {
					max = data[j];
					Qt = (char)(j + 'A');
				}
				else if(max == data[j]) {
					Qt ='?';
				}
			}
			System.out.println(Qt);
		}catch(IOException e) {
			System.out.println(e.toString());
		}
	}
}