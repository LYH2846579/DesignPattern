import org.junit.jupiter.api.Test;

import java.util.Scanner;

/**
 * @author LYHstart
 * @create 2022-01-29 22:08
 */
public class AI
{
    @Test
    public void test()
    {
        Scanner scan = new Scanner(System.in);
        String str;
        while(true)
        {
            str = scan.next();
            str = str.replace("吗","");
            str = str.replace("?","!");
            str = str.replace("? ","!");
            System.out.println(str);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str;
        while(true)
        {
            str = scan.next();
            str = str.replace("吗","");
            str = str.replace("?","!");
            str = str.replace("? ","!");
            System.out.println(str);
        }
    }
}
