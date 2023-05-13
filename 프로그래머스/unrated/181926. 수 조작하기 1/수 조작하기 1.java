class Solution {
    public int solution(int n, String control) {
        int answer = n;
        
        String temp[] = control.split("");
        
        for(int i = 0; i < control.length(); i++){
            if (temp[i].equals("w")){
                answer += 1;
            }else if ( temp[i].equals("s") ){
                answer -= 1;
            }else if ( temp[i].equals("d") ){
                answer += 10;
            }else if ( temp[i].equals("a") ){
                answer -= 10;
            }
        }
        
        return answer;
    }
}