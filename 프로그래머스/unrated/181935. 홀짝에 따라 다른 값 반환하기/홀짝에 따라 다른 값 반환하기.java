class Solution {
    public int solution(int n) {
        int answer = 0;
        
        if (n % 2 == 0){
            answer = evenNum(n);
        }else if (n % 2 == 1){
            answer = oddSum(n);
        }
        
        return answer;
    }
    
    public static int oddSum(int n){
        if (n == 0){
            return 0;
        }
        if (n % 2 == 0){
            return oddSum(n - 1);
        }
        if (n % 2 == 1){
            return n + oddSum(n - 1);
        }
        return oddSum(n - 1);
    }
    
    public static int evenNum(int n){
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                sum += i * i;
            }
        }
        return sum;
    }
}