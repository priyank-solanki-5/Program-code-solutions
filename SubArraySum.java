import java.util.*;

public class SubArraySum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int arr1[] = new int[n];
        int arrSum = 0;

        System.out.println("Enter the numbers:");
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }

        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
            arrSum += arr1[i];  // Corrected to add array elements
        }

        for (int i = 0; i < arr1.length; i++) {
            for (int j = i + 1; j < arr1.length; j++) {
                if (arr1[i] == 0 || arr1[j] == 0) {
                    arrSum += 10;
                }
            }
        }

        System.out.println("Sum: " + arrSum);
        sc.close();  // Close the Scanner
    }
}
// import java.util.Scanner;

// public class SubArraySum {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the size of the array:");
//         int n = sc.nextInt();
//         int[] arr = new int[n];
        
//         System.out.println("Enter the elements of the array:");
//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }

//         System.out.println("The sum of all subarrays is: " + subArraySum(arr));
//         sc.close();
//     }

//     public static long subArraySum(int[] arr) {
//         int n = arr.length;
//         long sum = 0;

//         for (int i = 0; i < n; i++) {
//             sum += arr[i] * (i + 1) * (n - i);
//         }

//         return sum;
//     }
// }
