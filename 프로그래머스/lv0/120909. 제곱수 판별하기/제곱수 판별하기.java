class Solution {
    public int solution(int n) {
        int answer = (int)Math.sqrt(n);
        
        if (answer * answer == n ){
            answer = 1;
        }else {
            answer = 2;
        }
        
        return answer;
    }
}