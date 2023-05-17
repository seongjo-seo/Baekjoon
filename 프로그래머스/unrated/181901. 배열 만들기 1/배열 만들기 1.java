import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(int n, int k) {
        ArrayList<Integer> answer = new ArrayList<>();
        
        for(int i = 1; i <= n; i++){
            if(i % k == 0){
                answer.add(i);
            }
        }
        
        int[] result = new int[answer.size()];
        for (int i = 0; i < answer.size(); i++) {
            result[i] = answer.get(i);
        }
        
        return result;
    }
}