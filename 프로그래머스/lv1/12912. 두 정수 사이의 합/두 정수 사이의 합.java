class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        
        if(a-b!=0){
            if(a>b){
                for(int i=b;i<=a;i++){
                    answer+=i;
                }
            }
            if(b>a){
                for(int i=a;i<=b;i++){
                    answer+=i;
                }
            }
        }else if(a==b){
            answer=a+answer;
        }
        
        return answer;
    }
}