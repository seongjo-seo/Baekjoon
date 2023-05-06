class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        String temp_a = "";
        String temp_b = "";

        String test = "";
        
        temp_a = String.valueOf(a);
        temp_b = String.valueOf(b);
        
        test = temp_a + temp_b;
        
        if ( Integer.parseInt(test) > ( 2 * Integer.parseInt(temp_a) * Integer.parseInt(temp_b) ) ){
            answer = Integer.parseInt(test);
        }
        else{
            answer = 2 * Integer.parseInt(temp_a) * Integer.parseInt(temp_b);
        }
        
        return answer;
    }
}