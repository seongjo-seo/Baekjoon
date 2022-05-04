import java.util.Scanner;
public class Main{
    public static void main(String[]args) {
	 Scanner sc = new Scanner(System.in);
	 int i_num = sc.nextInt();
	 if(i_num<=100 && i_num>=90) {
		 System.out.print("A");
	 }
	 else if(i_num<=89 && i_num>=80) {
		 System.out.print("B");
	 }
	 else if(i_num<=79 && i_num>=70) {
		 System.out.print("C");
	 }
	 else if(i_num<=69 && i_num>=60) {
		 System.out.print("D");
	 }
	 else{
		 System.out.print("F");
	 } 
 }
}
