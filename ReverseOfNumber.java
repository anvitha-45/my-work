import java.util.Scanner;
public class ReverseOfNumber{
    int reverseNum(int n){
        int sum=0;
        while(n!=0){
            int r=n%10;
            sum=sum*10+r;
            n=n/10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        ReverseOfNumber rn=new ReverseOfNumber();
        System.out.println("Enter a number");
        int n=sc.nextInt();
        System.out.println(rn.reverseNum(n));
    }
}