class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        
        String temp_a = "";
        String temp_b = "";
        
        for(int i = 0; i < num_list.length; i++){
            if( num_list[i] % 2 == 0 ){
                temp_a += Integer.toString(num_list[i]);
            } else {
                temp_b += Integer.toString(num_list[i]);
            }
        }
        answer = Integer.parseInt(temp_a) + Integer.parseInt(temp_b);
        
        return answer;
    }
}