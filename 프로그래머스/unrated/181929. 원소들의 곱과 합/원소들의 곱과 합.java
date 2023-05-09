class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        
        int temp_a = 1;
        int temp_b = 0;
        
        for ( int i = 0; i < num_list.length ; i++ ){
            temp_a *= num_list[i];
            temp_b += num_list[i];
        }
        
        if ( temp_a < (int)Math.pow(temp_b, 2) ) {
            answer = 1;
        }else if ( temp_a > (int)Math.pow(temp_b, 2) ){
            answer = 0;
        }
        
        return answer;
    }
}