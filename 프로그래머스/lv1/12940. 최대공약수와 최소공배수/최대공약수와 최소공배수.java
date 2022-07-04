class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int max_m=0;
        int min_n=0;
        
        for(int i=1;i<n*m;i++){
            if(n%i==0&&m%i==0){
                max_m=i;
            }
        }
        
        answer[0]=max_m;
        answer[1]=(n*m)/max_m;
        
        return answer;
    }
}