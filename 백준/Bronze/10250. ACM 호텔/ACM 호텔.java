import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
    	try {
			BufferedReader rd = new BufferedReader(new InputStreamReader (System.in));
			int T = Integer.parseInt(rd.readLine());
			for(int i=0;i<T;i++){
			    String text[] = rd.readLine().split(" ");
			    // 호텔의 층수
			    int H = Integer.parseInt(text[0]);
		        // 각 층의 방수
			    int W = Integer.parseInt(text[1]);
			    // 몇 번째 손님
			    int N = Integer.parseInt(text[2]);
			    
			    int F = N%H;
			    int R = N/H;
			    
			    if(F==0){
			        System.out.println(H*100+R);
			    }else{
			        System.out.println(F*100+R+1);
			    }
			}
		}
		catch(IOException e) {
		    System.out.println("error");
		}
	}
}