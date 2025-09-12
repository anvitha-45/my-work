import java.util.ArrayList;
import java.util.Scanner;
public class PrimeOrNot {
    boolean isPrime(int n){
        ArrayList<Integer> al=new ArrayList<>();
        int count=0;
        if(n==1||n==0)
        return false;
        for (int i=2;i*i<=n;i++){
            if(n%i==0)
            count++;
        }
        if(count>1)
        return false;
        else
        return true;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        PrimeOrNot pn=new PrimeOrNot();
        System.out.println("Enter a number");
        int n=sc.nextInt();
        System.out.println(pn.isPrime(n));
    }
}
