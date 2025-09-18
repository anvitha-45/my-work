import java.util.*;
public class Gcd1 {
    int gcd(int n1,int n2){
        int res=1;
        for(int i=1;i<=Math.min(n1,n2);i++){
            if(n1%i==0 && n2%i==0){
                res=i;
            }
        }
        return res;
    }
    public static void main(String args[]){
        Gcd1 g=new Gcd1();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        System.out.println(g.gcd(n1,n2));
    }
}
