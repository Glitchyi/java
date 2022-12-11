import java.util.Scanner;
public class ExceptionHandling {
    public static void main(String[] args) throws ArithmeticException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elmts: ");
        int i=0,n = sc.nextInt(),A[] = new int[n], sum = 0;
        do {
            try {
                int x = sc.nextInt();
                if (x<5){
                    throw new ArithmeticException("Cannot Add elements less than 5");
                }
                else{
                    A[i]=x;
                    i++;
                }
            } 
            catch (ArithmeticException a){
                System.out.println("" + a);
            }
            finally{
                System.out.println("-----");
            }
        } while (i<n);
        sc.close();
        for (int j : A) {
            sum+=j;
        }
        System.out.println("Average of the numbers: " + sum/n);
    }
}
