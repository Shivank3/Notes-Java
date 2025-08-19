public class Operators {
    public static void main(String[] args)
    {
       /*
    Operators in Java
    -----------------

    1. Unary Operators
       - Increment & Decrement: ++, -- (pre and post)
       - Unary plus/minus: +, -
       - Bitwise NOT: ~
       - Logical NOT: !

    2. Binary Operators
       a) Arithmetic: +, -, *, /, %
       b) Relational: >, <, >=, <=, ==, !=
       c) Logical (short-circuit): &&, ||
       d) Boolean (non-short-circuit): &, |
       e) Bitwise: &, |, ^, << (left shift), >> (right shift), >>> (unsigned right shift)

    3. Ternary Operator
       - Conditional: ? :

    4. Assignment Operators
       - =, +=, -=, *=, /=, %=
       - &=, |=, ^=, <<=, >>=, >>>=

    Short-circuiting (&&, ||) vs non-short-circuit (&, |)
    → you showed that perfectly with the byte a=10, b=5;
    Casting with increment — nice touch (a = (short)(a+1)).
*/

        System.out.println(10>30); // in the form true or false in java not in 0,1
        System.out.println(100>30); // boolean data type known as isolate data type
        System.out.println(1000==30);
        System.out.println(1000==1000);
        System.out.println(1000!=1000);
        System.out.println((50==50) == (1000==100));
        // true == true which is false || false == false which is true || true == false which is false
        // increment operators as type caste operator
        // int a = 5, b;
        // a =(short)(a+1); // casting here
        //b=a++; // b = 5 , a = 6
        //b=++a; // b = 6, a = 6
        //b=++a + a++;
        //System.out.println(a);
        //System.out.println(b);
        //System.out.println(++a);
        //System.out.println(--a);
        //System.out.println(50>10 && 20>10); // short circuit operator
        //System.out.println(50>10 || 20>10);
        byte a=10, b=5;
        System.out.println(++a>20 && ++b>1);
        System.out.println(a);
        System.out.println(b); // b=5 because short circuit 2nd condition false
        // it will not check if single & then value will be incremented same with || or

        // conditional operator
        String s;
        s = a>b?"Hello":"Bye";
        System.out.println(s);

        byte z =50;
        s=z%2==0?"Even":"Not even";
        System.out.println(s);

    }
}
