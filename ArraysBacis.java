import java.util.Scanner;
import java.util.Arrays;
public class ArraysBacis {
    public static void main(String[] args){
        int[] a1={1,2,3,4,5,6};
        Scanner sc=new Scanner(System.in);        
        //Accessing elements 
        System.out.println(a1[0]);
        //Printing an array
        System.out.println(Arrays.toString(a1));
        //Modifying array elements
        System.out.println("Before Modification array"+Arrays.toString(a1));
        a1[1]=66;
        System.out.println("Modified array"+Arrays.toString(a1));
        //creating an array using new keyword
        int[] a2;
        a2=new int[5];
        a2[0]=10;
        a2[1]=30;
        a2[2]=21;
        a2[3]=90;
        a2[4]=78;
        System.out.println(Arrays.toString(a2));
        int len=a2.length;
        System.out.printf("Length of array %d\n",len);
       /*  System.out.println("Enter size of an array");
        int n=sc.nextInt();
        int[] a3=new int[n];
        for(int i=0;i<n;i++){
            a3[i]=sc.nextInt();
        }
        //Accessing elements
        for(int i=0;i<n;i++){
            System.out.println(a3[i]);
        }
        for(int i:a3){
            System.out.println(i);
        }*/
        //Array Concatination
        int[] concat=new int[a1.length+a2.length];
        System.arraycopy(a1,0,concat,2,4);
        System.out.println(Arrays.toString(concat));
        //Array slicing
        int[] sliced=Arrays.copyOfRange(a1,2,4);
        System.out.println(Arrays.toString(sliced));
        //creating two dimensional array
        int[][] a4={
            {34,5,56},
            {33,5,88},
            {12,6,7}
        };
        for(int i=0;i<a4.length;i++){
            for(int j=0;j<a4[0].length;j++){
                System.out.print(a4[i][j]+" ");
            }
        }
        System.out.println("Enter no.of rows");
        int r=sc.nextInt();
        System.out.println("Enter no.of columns");
        int c=sc.nextInt();
        int[][] a5=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                a5[i][j]=sc.nextInt();
            }
        }
        System.out.println(Arrays.deepToString(a5));
    }
}
