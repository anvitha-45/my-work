import java.util.Scanner;
public class PalindromOrNot {
    boolean numPalindrom(int n){
        int temp=n;
        int rev=0;
        while(n!=0){
            int r=n%10;
            rev=rev*10+r;
            n=n/10;
        }
        if (temp==rev)
        return true;
        else
        return false;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        PalindromOrNot p=new PalindromOrNot();
        System.out.println("Enter a number");
        int n=sc.nextInt();
        System.out.println(p.numPalindrom(n));
    }
}
