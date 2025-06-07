package java_basic;
import java.util.*;

public class String_methods
{
    static void solve()
    {
        String s=new String("Sanyam kothari");
        s=s.trim();
        int len=s.length();
        System.out.println("printing String ");
        for(int i=0;i<s.length();i++)
        {
            System.out.print(s.charAt(i)+" ");
        }
        System.out.println();
        String s1=s.toLowerCase();
        String s2=s.toUpperCase();
        System.out.println(s1+" "+s2);

        String s3="Sanyam kothari";
        String s4="Sanyam kothari";
        System.out.println(s==s3);
        System.out.println(s3==s4);
        byte b[]={65 , 66 , 67 , 68 };
        String s5=new String(b);
        System.out.println(s5);
        System.out.println(new String(b , 0 , 4));

    }

    public static void main(String[] args)
    {
        solve();
    }
}
