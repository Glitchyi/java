  
//create a program to copy a file to another file
import java.io.*;
public class FiletoFile {
    public static void main(String[] args) {
        try {
            FileInputStream fin = new FileInputStream("C:\\Users\\user\\Desktop\\test.txt");
            FileOutputStream fout = new FileOutputStream("C:\\Users\\user\\Desktop\\test2.txt");
            int i;
            while ((i = fin.read()) != -1) {
                fout.write(i);
            }
            fin.close();
            fout.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}