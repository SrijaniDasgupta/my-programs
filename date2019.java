/*
 * Design a program to accept a day number (between 1 and 366), year (in 4 digits) from the user to generate and display the 
 * corresponding date. Also, accept 'N' (1 <= N <= 100) from the user to compute and display the future date corresponding to 'N' 
 * days after the generated date. Display an error message if the value of the day number, year and N are not within the limit or 
 * not according to the condition specified.
 */
import java.util.Scanner;
class date2019
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        int md[]={0,31,28,31,30,31,30,31,31,30,31,30,31};
        String m[]={"0","January","february","March","April","May","June","July","August","September","October","November","December"};
        int N=0;
        int y=0;
        int d=0;
        System.out.println("enter N greater than or equal to 1 and less tahn or equal to 100");
        System.out.println("enter the year in 4 digits");
        System.out.println("enter day number of the year which is between 1 and 366");
        while(true)
        {
            N=sc.nextInt();
            y=sc.nextInt();
            d=sc.nextInt();
            if((N>=1&&N<=100)&& (y>=1000&&y<=9999)&& (d>1&&d<366))
            {
                break;
            }
            else
            {
                System.out.println("try again");
            }
        }
        if((y%400==0) || ((y%100!=0)&&(y%4==0))) 
        {
            md[2]=29;
        }
        int s=0;
        int c=0;
        while(d>s)
        {
            //s=s+md[c];
            c++;
            s=s+md[c];
        }
        int date1 = md[c]-(s-d);
        String month1 = m[c];
        //int year1=y;
        System.out.println("DATE "+date1+" "+month1+" "+y);
        //date1++;
        while(N>0)
        {
            date1++;
            N--;
            if(md[c]<date1)
            {
                date1=1;
                c++;
                if(c>12)
                {
                    c=1;
                    y++;
                    if((y%400==0) || ((y%100!=0)&&(y%4==0)))
                    {
                        md[2]=29;
                    }
                    else
                    {
                        md[2]=28;
                    }
                }
            }
        }
        System.out.println("FUTURE DATE "+date1+" "+m[c]+" "+y);
    }
}


enter N greater than or equal to 1 and less tahn or equal to 100
enter the year in 4 digits
enter day number of the year which is between 1 and 366
22
2018
255
DATE 12 September 2018
FUTURE DATE 4 October 2018