import java.util.Scanner;
import java.util.*;
public class PrimeOrNot2 {
    void divisorsOfN2(int n){
        ArrayList<Integer> div=new ArrayList<>();
        for(int i=1;i*i<=n;i++){
            if(n%i==0){
                div.add(i);
                if(i!=n/i)
                div.add(n/i);
            }
        }
        if(div.size()==2)
            System.out.println("True");
        else
            System.out.println("False");
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        PrimeOrNot2 dn=new PrimeOrNot2();
        System.out.println("Enter a number");
        int n=sc.nextInt();
        dn.divisorsOfN2(n);
    }
}
