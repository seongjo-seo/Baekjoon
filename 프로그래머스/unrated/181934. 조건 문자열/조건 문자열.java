class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        int answer = 0;
        
        if ( eq.contains("=") ){
            if( ineq.contains(">") ){
                if ( n >= m ){
                    answer = 1;
                }
            }else if( ineq.contains("<") ){
                if ( n <= m ){
                    answer = 1;
                }
            }
        }else if ( eq.contains("!") ){
            if( ineq.contains(">") ){
                if ( !(n > m) == false ){
                    answer = 1;
                }
            }else if ( ineq.contains("<") ){
                if ( !(n < m)  == false ){
                    answer = 1;
                }
            }
        }
        return answer;
    }
}