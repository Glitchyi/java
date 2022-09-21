import java.util.Scanner;

public class StudentDetails {
    public static void main(String[] args) {
        System.out.print("Enter the students details\n");
        Scanner sc = new Scanner(System.in);
        String arr[] = new String[4];
        String details[]={"Name","Roll No","Class","Sem"};
        System.out.println("---");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(details[i]+": ");
            arr[i]=sc.next();
        }
        sc.close();
        System.out.println("---");
        System.out.print("Details: [");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" "+details[i]+": "+ arr[i]);
            if(i!=arr.length-1){
                System.out.print(",");
            }
        }
        System.out.print("]\n");
    }
}
