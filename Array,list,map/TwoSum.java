import java.util.*;

public class TwoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Scan and print array...
        System.out.println("enter a length of array");
        int len = sc.nextInt();
        int[] a = new int[len];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("array is:");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
            System.out.println();
        }
        System.out.println("enter a target value");
        int targat = sc.nextInt();
        int r1 = -1, r2 = -1;
        for (int j = 0; j < a.length; j++) {
            int v1 = a[j];
            for (int k = j + 1; k < a.length; k++) {
                int v2 = a[k];
                if (v1 + v2 == targat) {
                    r1 = j;
                    r2 = k;
                }
            }
        }
        System.out.println("index of first value:" + r1);
        System.out.println("index of secound value:" + r2);
    }
}
