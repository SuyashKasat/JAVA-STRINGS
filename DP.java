
import java.util.*;
public class DP{
    static int ways(int A[][],int m,int n){
    A[0][0]=0;
    for(int i=1;i<n;i++){
        A[0][i]=1;
    }
     for(int i=1;i<m;i++){
        A[i][0]=1;
    }
    
    for(int i=1;i<m;i++){
        for(int j=1;j<n;j++){
            A[i][j]=A[i-1][j]+A[i][j-1];
        }
    }

    return A[m-1][n-1];

    }
    public static void main(String []args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter no of rows and columns");
        int m=s.nextInt();
        int n=s.nextInt();

        int A[][]=new int[m][n];
        int x=ways(A,m,n);
        System.out.println("no.of ways are:"+ x);
    }
}