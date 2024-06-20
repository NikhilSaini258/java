import java.lang.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Hello world WITHOUT new line\t");
        System.out.println("Hello world WITH new line");

        System.out.println();   // Just adding empty line

        // taking input from keyboard
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter output String & Two numbers: ");

//        String str = sc.nextLine();
//        int val1 = sc.nextInt();
//        int val2 = sc.nextInt();
//
//        int result = val1 + val2;
//        System.out.println(str + ":" + result);

        // Operators & expressions
        int a = 0b1010;     // 10 in decimal
        int b = 0b0110;     // 6 in decimal

        System.out.println(a|b);    // 0b1110 -> 14 in decimal
        System.out.println(a&b);    // 0b0010 -> 2 in decimal
        System.out.println(a^b);    // 0b1100 -> 12 in decimal

        // post-increment
        System.out.println(a++);    // print (10)
        System.out.println(a);      // a->11

        // pre-increment
        System.out.println(++b);    // print (7)
        System.out.println(b);      // b->7

        byte a1 = -0b1010;     // -10 in decimal

        /*  ">>" is arithmetic shift right, ">>>" is logical shift right.
            In an arithmetic shift, the sign bit is extended to preserve the signedness of the number.
            ">>>" will always put a 0 in the left most bit, while ">>" will put a 1 or a 0 depending on what the sign of it is.
            https://stackoverflow.com/questions/2811319/difference-between-and
        */
        System.out.println(a1<<1);    // left shift by one -> double number -> print(20)
        System.out.println(a1>>1);    // right shift by one -> half number -> print(5)
        System.out.println(a1>>>1);   // Logical right shift by one. print(2147483643)

        a1 = 0b1010;     // 10 in decimal
        System.out.println(String.format("%32s", Integer.toBinaryString((a1))));
        System.out.println(String.format("%32s", Integer.toBinaryString((~a1))));       // NOT operation

        // SET any bit -> use | operation with shifted number
        // CHECK if any bit SET -> use & operator with shifted number
        // TOGGLE any bit -> use ^ operator with shifted number

        /*
        Widening/Upcasting -> Convert small data-type to big data-type (Implicit by compiler) and data-type should be compatible
        Narrowing/Down-casting -> Convert big data-type to small data-type and data-type should be compatible. Explicit cast needed
                                  Compiler will give error of "possible lossy conversion"
         */
        short s=120;
        int i=10;
        long l=10;
        float f=10.5f;
        double d=10;
        char c=10;
        boolean bl=true;

        i = (int)l;     // WORKS
        /*   Below are all ERROR of narrowing -> incompatible types: possible lossy conversion
            i = l;
            s = i;
            l = f;
            f = d;
            c = int/long/float/double;     possible with type-casting
            c = byte/short;                NOT POSSIBLE at ALL, even with type-casting
            bl = b/s/i/l;                  NOT POSSIBLE at ALL, even with type-casting
        */

//        Conditional obj = new Conditional();
//        Loops obj = new Loops();
//        Arrays obj = new Arrays();
//        Methods obj = new Methods();
//        OOPs obj = new OOPs();
        Inheritance obj = new Inheritance();
        obj.HelloWorld();
    }
}