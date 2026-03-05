import java.util.*;

class BankDetails {
    long acc_no;
    long phone_number;
    String name;

    BankDetails(long acc_no, long phone_number, String name) {
        this.acc_no = acc_no;
        this.phone_number = phone_number;
        this.name = name;
    }

    void show_details(){
        System.out.println(this.acc_no);
        System.out.println(this.phone_number);
        System.out.println(this.name);
    }
}

public class Bank {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a account number=>");
        long acc_no = input.nextLong();
        System.out.println("Enter a phone number=>");
        long phone_number = input.nextLong();
        System.out.println("Enter customer name=>");
        String name = input.next();
        BankDetails cus1 = new BankDetails(acc_no,phone_number,name);
        cus1.show_details();
    }
}
