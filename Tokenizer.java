//String tokeniser in java
import java.util.StringTokenizer;
public class Tokenizer {
    public static void main(String [] args) {
        System.out.println("Tokenizer constructor");
        String str = "This, is, a, test";
        StringTokenizer st = new StringTokenizer(str,",");
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
    }    
}
