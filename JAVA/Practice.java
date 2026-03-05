import java.util.*;
public class Practice{
	public static void main(String[] args){
		System.out.println("enter a number");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		for(int i=1;i<=10;i++){
			System.out.println(number+"*"+i+"="+number*i);
		}
	}
}