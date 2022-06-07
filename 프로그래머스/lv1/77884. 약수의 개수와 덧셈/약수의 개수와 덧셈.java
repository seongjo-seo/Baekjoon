class Solution {
    public int solution(int left, int right) {
        int count = 1;
        int res=0;
        
        for(int i=left;i<=right;i++) {
            for(int j=2; j<=right; j++) {
                if(i%j==0) {
                    count++;
                }
            }
            if(count%2==0) {
                res += i;
            }
            if(count%2==1) {
                res -= i;
            }
            count=1;
        }
        
        return res;
    }
}