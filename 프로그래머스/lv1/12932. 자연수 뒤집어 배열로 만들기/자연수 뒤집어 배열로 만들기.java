class Solution {
    public int[] solution(long n) {
        String text = ""+n;
        int[] answer = new int[text.length()];
        
        int count =0;
        while(n>0) {
            answer[count]=(int)(n%10);
			 n/=10;
			 ++count;
        }
        return answer;
    }
}