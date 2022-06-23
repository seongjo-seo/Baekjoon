import java.util.Calendar;

class Solution {
    public String solution(int a, int b) {
        String answer[] = {"SUN","MON","TUE","WED","THU","FRI","SAT"};
        Calendar calendar = Calendar.getInstance();
        // calendar 클래스의 month는 1월부터 12월을 0부터 11까지로 표현해야 됨
        calendar.set(2016, a-1, b);
        int res = calendar.get(Calendar.DAY_OF_WEEK);
        return answer[res-1];
    }
}