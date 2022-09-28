//Write a Java program to find the frequency of a given character in a string.
import java.util.*;
public class CharFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char ch = 'a';
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (ch == str.charAt(i)) {
                count++;
            }
        }
        System.out.println("Frequency of " + ch + " = " + count);
        sc.close();
    }
}
