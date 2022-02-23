//keith number checking
import java.util.Scanner;
class keithnumber
{
    static void main()
    {
        Scanner sc=new Scanner(System. in); 
        System.out.println("enter a number");
        int n=sc.nextInt();
        int a[]=new int[n];
        int b[]=new int[n];
        int c=0, k=0, p,x;
        int copy=n;
        while(n>0)
        {
            int d=n%10;
            a[c++]=d;
            n/=10;
        }
        for (int i=c-1;i>=0;i--)
        {
            b[i]=a[k++];
        }
        int digits=c; 
        k=0;
        for(int i=0;;i++)
        {
            p=i;
            x=0;
            for (int j=0;j<digits;j++)
            {
                x=x+b[p++];
            }
            b[c]=x;
            if(b[c]==copy)
            {
                k=1;
                break;
            }
            if(b[c]>copy)
            {
                 break;
            }
            c++;
        }
        if(k==1)
        {
            System.out.println(" Keith Number ");
        }
        else 
        {
            System.out.println("Not a Keith Number");
        }
    }
}


enter a number
14
 Keith Number 