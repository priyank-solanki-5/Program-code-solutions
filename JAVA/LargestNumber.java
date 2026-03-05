import java.util.*;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] num = new int[n];
        for (int i=0;i<n;i++) {
            num[i]=sc.nextInt();
        }
        String[] numstr = new String[num.length];
        for (int i = 0; i < num.length; i++) {
            numstr[i] = "" + num[i];
        }

        for (int i = 0; i < numstr.length - 1; i++) {
            for (int j = 0; j < numstr.length - i - 1; j++) {
                String first = numstr[j] + numstr[j + 1];
                System.out.println(first);
                String secound = numstr[j + 1] + numstr[j];
                System.out.println(secound);
                if (first.compareTo(secound) < 0) {
                    String temp = numstr[j];
                    numstr[j] = numstr[j + 1];
                    numstr[j + 1] = temp;
                }
            }
        }
        if (numstr[0].equals("0")) {
            System.out.println("0");
            return;
        }

        String result = "";
        for (int i = 0; i < numstr.length; i++) {
            result += numstr[i];
        }

        System.out.println("result is:" + result);
    }
}
