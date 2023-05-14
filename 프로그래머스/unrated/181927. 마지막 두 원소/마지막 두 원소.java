import java.util.Arrays;

public class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = Arrays.copyOf(num_list, num_list.length);

        int size = answer.length;
        int last = answer[size - 1];
        int prev = answer[size - 2];

        if (last > prev) {
            answer = Arrays.copyOf(answer, size + 1);
            answer[size] = last - prev;
        } else {
            answer = Arrays.copyOf(answer, size + 1);
            answer[size] = last * 2;
        }

        return answer;
    }
}