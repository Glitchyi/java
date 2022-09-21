import java.util.Scanner;

public class StudentDetails {
    public static void main(String[] args) {
        System.out.print("Enter the students details\n");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of Students: ");
        int n = sc.nextInt();
        String arr[][] = new String[n][4];
        String details[]={"Name","Roll No","Class","Sem"};
        System.out.println("---");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(details[j]+": ");
                arr[i][j]=sc.next();
            }
            System.out.println("---");
        }
        sc.close();
        System.out.println("---");
        System.out.print("Details: [\n");
        for (int i = 0; i < n; i++) {
            System.out.print("\t");
            for (int j = 0; j < 4; j++) {
                System.out.print(details[j]+": "+arr[i][j]);  
                if(j!=3){
                    System.out.print(",");
                }
            }
            if(i!=n-1){
                System.out.print("\n");
            }
        }
        System.out.print("\n]\n");
    }
}
