public class dataTypesAndLiterals {
    public static void main(String[] args) {
        int a = 1;  // 32 bits which is 4 bytes
        byte b = 'a';  // byte is ONLY numeric (-128 to 127). It cannot directly store a char literal like 'a'.
        short c = 3738; // short is a 16-bit integer (-32,768 to 32,767).
        // It can be used for memory optimization or APIs (like TCP/UDP ports, which fit in 16 bits).
        long d = 476655; // 64 bits which is 8 bytes
        double e = 344555555555555555555555d; // 64 bits
        float f = 3466.34f;
        boolean bool = true; // not precisely defined often stored as 1 bit
        String str = "Shiva";
        char ch = 'a'; // A char is 16 bits and 2 bytes in Java (Unicode), so you'd need `char ch = 'a';`.
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(bool);
        System.out.println(str);
        System.out.println(ch);
    }
}
