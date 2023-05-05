class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        String temp_one = "";
        String temp_two = "";
        
        
        temp_one = String.valueOf(a) + String.valueOf(b);
        temp_two = String.valueOf(b) + String.valueOf(a);
        
        if (Integer.parseInt(temp_one) > Integer.parseInt(temp_two)){
            answer = Integer.parseInt(temp_one);
        }else {
            answer = Integer.parseInt(temp_two);            
        }
        
        
        return answer;
    }
}