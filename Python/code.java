//stack in java

import java.util.*;

class Code {
    Scanner sc = new Scanner(System.in);
    int top = 0;
    public Code() {
        System.out.println("Instance is created");
    }
    
    public void push(int[] arr,int n, int e) {
        if (top>=n) {
            System.out.println("Stack is overflow");
            return;            
        }
        else{
            arr[top]=e;
            top++;
            return;
        }
    }

    public int show(int[] arr){
         if (top==0) {
             System.out.println("stack underflow");
             return 0;
         }
         else{
            return arr[top-1];
         }       
    }
}

public class code {
    public static void main(String[] args) {
        Code c = new Code();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a length of array");
        int size = sc.nextInt();
        int[] arr = new int[size];
        int ch=-1;
        while(ch!=0){
            System.out.println("enter your choice");
            System.out.println("1 for push");
            System.out.println("2 for pop");
            System.out.println("3 for display");
            System.out.println("0 for out");
            ch = sc.nextInt(); 
            switch (ch) {
                case 1:
                    System.out.println("enter a element which is you enter");
                    int ele = sc.nextInt();
                    c.push(arr, size, ele);
                    break;
                case 3:
                    System.out.println("your stack is:");
                    System.out.println(c.show(arr));
                    break;
                default:
                    System.out.println("not match invalid");
    
            }
        }
    }
}