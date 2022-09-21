import java.util.Scanner;

public class QuoAndRem {
    public static void main(String[] args) {
        System.out.print("Enter two number to be divded: \n");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        System.out.print("When "+a+" is divided by "+b+" the Quotient is: "+(a/b) + " and the Reminder is: "+(a%b)+"\n");
    }
}
