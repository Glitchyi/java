import java.util.*;;
public class SwapNums {
    public static void main(String[] args) {
                int a,b;
                System.out.print("Enter the two numbers to be swapped: \n");
                Scanner sc = new Scanner(System.in);
                a=sc.nextInt();
                b=sc.nextInt();
                System.out.print("Initial Values: "+a+" "+b+"\n");
                a+=b;b=a-b;a=a-b;
                System.out.print("Final Values: "+a +" "+b+"\n");
                sc.close();

    }
}
