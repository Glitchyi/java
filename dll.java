public class dll{
    public static void main(String[] args){
        // write a program to print the 10 numbers of the fibbonaci series
        int a=0,b=1,c=0;
        System.out.println(a);
        System.out.println(b);
        for(int i=0;i<8;i++){
            c=a+b;
            System.out.println(c);
            a=b;
            b=c;
        }
        
        
    
    }
}