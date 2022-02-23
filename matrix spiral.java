/*
 * print an array in spiral form
 */
import java.util.Scanner;
class matrix_spiral
{
    static void main()
    {
        Scanner sc=new Scanner (System. in);
        System.out.println("enter number of rows and columns");
        int n=sc.nextInt();
        int a[][]=new int[n][n]; 
        int k=0;
        int r=n, c=n-1 ;
        int x=0, y=-1,z=1;
        while(k<n*n)
        {
            for(int i=0;i<r;i++)
            {
                y=y+z;
                System.out.println("enter a number");
                a[x][y]=sc.nextInt();
                k++;
            }
            for (int j=0;j<c;j++)
            {
                x=x+z;
                System.out.println("enter a number");
                a[x][y]=sc.nextInt();
                k++; 
            }
            r--;
            c--;
            z=-z;
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print (a[i][j]+"\t");
                
            }
            System.out.println();
        }
    }
}



enter number of rows and columns
4
enter a number
1
enter a number
2
enter a number
3
enter a number
4
enter a number
5
enter a number
6
enter a number
7
enter a number
8
enter a number
9
enter a number
10
enter a number
11
enter a number
12
enter a number
13
enter a number
14
enter a number
15
enter a number
16
1	2	3	4	
12	13	14	5	
11	16	15	6	
10	9	8	7