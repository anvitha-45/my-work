import java.util.Scanner;
import java.util.*;
public class DivisorsOfNumber2 {
    void divisorsOfN2(int n){
        ArrayList<Integer> div=new ArrayList<>();
        for(int i=1;i*i<=n;i++){
            if(n%i==0){
                div.add(i);
                if(i!=n/i)
                div.add(n/i);
            }
        }
        Collections.sort(div);
        for (int i: div){                        //System.out.println(div);
            System.out.println(i);
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        DivisorsOfNumber2 dn=new DivisorsOfNumber2();
        System.out.println("Enter a number");
        int n=sc.nextInt();
        dn.divisorsOfN2(n);
    }
}

