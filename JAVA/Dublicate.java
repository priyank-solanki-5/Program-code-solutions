
// devloper icon
// https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/727/
import java.util.*;

public class Dublicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a length of array");
        int n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<Integer>();
        System.out.println("enter a ");
        int no;
        for (int i = 0; i < n; i++) {
            no = sc.nextInt();
            arr.add(no);
        }
        System.out.println("printed elements");
        System.out.println(arr);
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) == arr.get(j)) {
                    arr.remove(j);
                }
            }
        }
        System.out.println(arr);
        sc.close();
    }
}
