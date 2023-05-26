import java.util.ArrayList;

class Solution {
    public int[] solution(int[] array) {
        ArrayList<Integer> answer = new ArrayList<>();
        int max = 0;
        int idx = 0;
        int count = 0;
        
        for(int n : array){
            if(n > max){
                max = n;
                idx = count;
            }
            count += 1;
        }
        
        answer.add(max);
        answer.add(idx);

        int[] result = new int[answer.size()];
        for (int i = 0; i < answer.size(); i++) {
            result[i] = answer.get(i);
        }
        
        return result;
    }
}