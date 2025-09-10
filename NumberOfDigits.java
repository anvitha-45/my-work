import java.util.Scanner;
public class NumberOfDigits{
    int noOfDigits(int n){
        int count=0;
        while(n!=0){
            n=n/10;
            count++;
        }
        return count;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        NumberOfDigits nd=new NumberOfDigits();
        System.out.println("Enter a number");
        int n=sc.nextInt();
        System.out.println(nd.noOfDigits(n));
    }

}
