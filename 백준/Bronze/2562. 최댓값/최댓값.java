import java.util.Scanner;
// 간단 풀이
public class Main {
    public static void main(String[]args){
    	Scanner sc = new Scanner(System.in);
    	
    	int num[] = new int[10];
    	int max=0, count=0, st_count=0;
    	
    	for(int i=1;i<=9;i++) {
    		num[i] = sc.nextInt();
    		count++;
    		if(num[i]>=max) {
    			max=num[i];
    			st_count=count;
    		}
    	}
    	System.out.println(max);
    	System.out.println(st_count);
    }
}