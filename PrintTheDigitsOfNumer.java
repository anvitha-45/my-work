import java.util.Scanner;
public class PrintTheDigitsOfNumer {
    void digitsOfNumber(int n){
        while(n!=0){
            int r=n%10;
            System.out.println(r);
            n=n/10;
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        PrintTheDigitsOfNumer pn=new PrintTheDigitsOfNumer();
        System.out.println("Enter a number");
        int n=sc.nextInt();
        pn.digitsOfNumber(n);
    }
}
