import java.util.*;

public class HackerRankArray1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a length of array:");
        int n = sc.nextInt();
        int[] Array1 = new int[n];
        System.out.println("input");
        
        for (int i = 0; i < Array1.length; i++) {
            Array1[i]=sc.nextInt();
        }
        System.out.println("output");     
        for (int i = 1; i < Array1.length; i++) {
            System.out.println(Array1[i]);
        }
        sc.close();
    }
}
