import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			StringBuilder sb = new StringBuilder();
			
			int count = Integer.parseInt(br.readLine());
			
			ArrayList<Integer> list = new ArrayList<>();
			
			for(int i=0; i<count;i++) {
				list.add(Integer.parseInt(br.readLine()));
			}
			
			Collections.sort(list);

			for(int j : list) {
				sb.append(j).append("\n");
			}
			
			System.out.println(sb);
			
		}catch(IOException e) {
			System.out.println("error");
		}
	}
}