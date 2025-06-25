package java_basic;
import java.util.*;

public class regular_exp
{
    public static void main(String[] args) {
        String s="b";
        String s1=" ";
        System.out.println(s.matches("[abc]"));
        System.out.println(s.matches("[^abc]")); // other than abc
        System.out.println(s.matches("a|z")); // either a or z
        System.out.println(s.matches("[a-z]|[0-9]")); // either from a to z or 0 to 9
        System.out.println(s1.matches("\\S")); // other than spaces
        System.out.println(s1.matches("\\s")); // spaces
        System.out.println(s.matches("\\D"));
        System.out.println(s1.matches("\\D")); // other than digits
        System.out.println(s1.matches("\\w")); // alphabets
        System.out.println(s1.matches("\\W")); // other than alphabets

    }
}
