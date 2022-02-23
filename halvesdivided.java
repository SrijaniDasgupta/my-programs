//sentence manipulation
/*
 * ACCEPT A STRING AND CHECK IF BOTH THE HALVES OF THE STRING HAVE SAME SET OF CHARACTERS. IF LENGTH IS ODD IGNORE MIDDLE ELEMENT
 */
import java.util.*;
class halvesdivide
{
    static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string");
        String s=sc.nextLine();
        int c=0;
        int l =s.length();
        String a="";
        String b="";
        if(l%2==0)
        {
            a=s.substring(0, l/2);
            b=s.substring (l/2);
        }
        else
        {
            a=s.substring(0,(l-1)/2);
            b=s.substring(( (l-1)/2)+1); 
        }
            for(int i=0;i<a.length();i++)
            {
                char ch=a.charAt(i);
                int k=b.indexOf (ch) ;
                if(k==-1) 
                {
                    c=1;
                    break;
                }
            }
            if(c==0)
            {
                System.out.println("Yes both the halves are equal");
            }
            else
            {
                System.out.println ("Both halves are not equal");
            }
        }
    }


enter a string
hello
Both halves are not equal

enter a string
mom
Yes both the halves are equal

