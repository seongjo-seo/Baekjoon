public class Main {
	
    public static final int MAX = 10001;
    
	public static void main(String[] args) {
		boolean selfNumber[] = new boolean[MAX];
		
		for(int i=0; i<MAX ;i++) {
			int resN = calculating(i);
			
			if(resN < MAX) {
				selfNumber[resN] = true;
			}
		}
        
		for(int j=0; j<MAX; j++) {
			if(!selfNumber[j]) {
				System.out.println(j);
			}
		}
	}
	
	public static int calculating(int number) {
		int res = number;
		
		while(number!=0){
			res = res + (number % 10);
			number /= 10;
		}
        
		return res;
	}
}