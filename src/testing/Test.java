package testing;

import java.util.Scanner;

public class Test {
    static void calculate(int arr[],int n,int k)
    {

        int cost[][]=new int[n][n];
        for(int i=0;i<n;i++)
        {
            cost[i][i]=k-arr[i];
            for(int j=i+1;j<n;j++)
            {
                cost[i][j]=cost[i][j-1]-arr[j]-1;
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                if(cost[i][j]<0) cost[i][j]=Integer.MAX_VALUE;
                else cost[i][j]=cost[i][j]*cost[i][j];
            }
        }

        int min[]=new int[n];
        int ans[]=new int[n];
        for(int i=n-1;i>=0;i--)
        {
            min[i]=cost[i][n-1];
            ans[i]=n;
            for(int j=n-1;j>i;j--)
            {
                if(cost[i][j-1]==Integer.MAX_VALUE) continue;
                if(min[i]>cost[i][j-1]+min[j])
                {
                    min[i]=cost[i][j-1]+min[j];
                    ans[i]=j;
                }
            }
        }

        for(int i=0;i<n;i=ans[i])
        {
            System.out.println((i+1)+"-"+(ans[i]));
        }
    }
    public static void main(String []args)
    {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int k;
        k=sc.nextInt();
        calculate(arr,n,k);
    }
}
