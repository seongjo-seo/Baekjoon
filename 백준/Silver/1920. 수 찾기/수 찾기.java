import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
						
			int N = Integer.parseInt(br.readLine());
			int one_num[] = new int[N];
			
			StringBuilder sb = new StringBuilder();
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			for(int i=0; i<N; i++) {
				one_num[i] = Integer.parseInt(st.nextToken());
			}
			
			Arrays.sort(one_num);
			
			int M = Integer.parseInt(br.readLine());
			st = new StringTokenizer(br.readLine());
			
			
			for(int j=0; j<M; j++) {
				if(binarySearch(one_num, Integer.parseInt(st.nextToken())) >=0) {
					sb.append(1).append("\n");
				}
				else {
					sb.append(0).append("\n");
				}
			}
			System.out.println(sb);
			
		}catch(IOException e){
			System.out.println(e.toString());
		}
	}
	
	public static int binarySearch(int[] array, int target){

		int start = 0;
		int end= array.length-1;

		while(start<=end){
			int mid = (start+end)/2;	

			if(array[mid] == target){
	 			return 1;
			}else if(array[mid] > target){
				end= mid-1;
			}else{
	 			start= mid+1;
	 		}
	 	}
	 	return -1;
	}
}