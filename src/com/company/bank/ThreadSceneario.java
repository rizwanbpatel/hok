import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class PassS
{
    public static void main(String [] args)
    {
        System.out.println(1 & 2 & 3);
    }

    void start()
    {
        String s1 = "sleep";
        String s2 = fix(s1);
        System.out.println(s1 + " " + s2);
    }

    String fix(String s1)
    {
        s1 = s1 + "stream";
        System.out.print(s1 + " ");
        return "steem";
    }
}