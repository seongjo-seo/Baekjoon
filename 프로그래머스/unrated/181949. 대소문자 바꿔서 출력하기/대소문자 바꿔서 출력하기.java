import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        
        StringBuilder result = new StringBuilder();
        
        for (int i = 0; i < a.length(); i++){
            char Data = a.charAt(i);
            if (Character.isUpperCase(Data)){
                result.append(Character.toLowerCase(Data));
            }else if (Character.isLowerCase(Data)){
                result.append(Character.toUpperCase(Data));
            } else{
                result.append(Data);
            }
        }
        String transformedStr = result.toString();
        System.out.println(transformedStr);
    }
}