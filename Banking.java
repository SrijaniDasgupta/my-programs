
/**
 * Write a description of class banking here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class banking
{
    // instance variables - replace the example below with your own
     int s;

    /**
     * Constructor for objects of class banking
     */
    public banking(int a)
    {
        // initialise instance variables
        s = a;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    void display()
    {
        // put your code here
        String n = Integer.toString(s);
        for(int i=0; i<n.length();i++)
        {
            char ch = n.charAt(i);
            switch(ch)
            {
                case '1': System.out.print("One");
                break;
                case '2': System.out.print("Two");
                break;
                case '3': System.out.print("Three");
                break;
                case '4': System.out.print("Four");
                break;
                case '5': System.out.print("Five");
                break;                
                case '6': System.out.print("Six");
                break;                
                case '7': System.out.print("Seven");
                break;                
                case '8': System.out.print("Eight");
                break;                
                case '9': System.out.print("Nine");
                break;                
                case '0': System.out.print("Zero");
                break;                
            }
            
        }
        System.out.println();
    }
    void denomination()
    {
        System.out.println("DENOMINATION");
        int a[] = {1000, 500, 100, 50,20,10,5,2,1};
        int copy = s;
        int k=0;
        while (copy > 0)
        {
            System.out.println(a[k] + "X" + (copy/a[k]) + " = " + (a[k]*(copy/a[k])) );
            copy = copy%a[k];
            k++;
        }
    }
    public static void main()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter an amont");
        int amt = sc.nextInt();
        banking obj = new banking (amt);
        obj.display();
        obj.denomination();
    }
}
