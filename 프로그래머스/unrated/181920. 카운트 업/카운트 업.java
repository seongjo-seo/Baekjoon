import java.util.ArrayList;

class Solution {
    public int[] solution(int start, int end) {
        ArrayList<Integer> request = new ArrayList<>();
        
        for (int i = start; i <= end; i++){
            request.add(i);
        }
        
        int[] result = new int[request.size()];
        
        for (int i = 0; i < request.size(); i++){
            result[i] = request.get(i);
        }
        
        return result;
    }
}