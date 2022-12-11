import java.util.*;

public class ASCIIOfChar {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Input the char to find the ASCII value of: ");
            int valueASCII = sc.next().charAt(0);
            System.out.print(valueASCII);
        }
    }
}
