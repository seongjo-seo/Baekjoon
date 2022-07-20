import java.util.Arrays;
import java.util.Collections;

class Solution {
    public long solution(long n) {
        String answer = Long.toString(n);
        String arr[] = new String[answer.length()];
        
        for(int i=0; i< answer.length();i++){
            arr[i] = answer.substring(i, i+1);
        }
        Arrays.sort(arr, Collections.reverseOrder());
        
        String res = "";
        for (String i:arr){
            res +=i;
        }
        
        return Long.parseLong(res);
    }
}