import java.util.Scanner;

public class StringManipulatorTesting
{

    static Scanner sc;
    static StringManipulator sm;
    
    static void println()
    {
        System.out.println();
    }

    static void println(Object o)
    {
        System.out.println(o);
    }

    static void print(Object o)
    {
        System.out.print(o);
    }

    private static void init()
    {
        sc = new Scanner(System.in);
        sm = new StringManipulator();
    }
    
    public static void main(String[] args)
    {
        init();
        println(sm.trimAndConcat("   hello    ", "    world    "));
        println();
        println(sm.getIndexOrNull("Hello, World!", 'l'));
        println(sm.getIndexOrNull("Hello, World!", 'z'));
        println();
        println(sm.getIndexOrNull("Hello, World!", "o, W"));
        println(sm.getIndexOrNull("Hello, World!", "foo"));
        println();
        println(sm.concatSubstring("Hello, ", 3, 5, "World!"));
    }

}
