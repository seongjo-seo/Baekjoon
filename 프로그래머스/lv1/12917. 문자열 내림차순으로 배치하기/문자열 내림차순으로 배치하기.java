import java.util.Arrays;

class Solution {
    public String solution(String s) {
        String answer ="";
        char text[] = s.toCharArray();
        
        Arrays.sort(text);
        
        for(int i=text.length -1; i>=0;i--){
            answer += text[i];
        }
        return answer;
    }
}