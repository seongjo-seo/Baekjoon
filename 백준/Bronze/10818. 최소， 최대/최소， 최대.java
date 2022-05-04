import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[]args) throws IOException {
		
		try {
			BufferedReader s_rd = new BufferedReader(new InputStreamReader (System.in));
			
			int num = Integer.parseInt(s_rd.readLine());
	    	int max= -1000000, min=1000000;
	    	int data[] = new int[num];
	    	
			String change_num[] = s_rd.readLine().split(" ");
			
			for(int i=0; i<num; i++) {
				data[i] = Integer.parseInt(change_num[i]);
				
				if(data[i]>max) {
	    			max=data[i];
	    		}
	    		if(data[i]<min) {
	    			min=data[i];
	    		}
			}
	    	System.out.println(min +" " + max);
		}
		catch(IOException e) {
		}
	}
}
