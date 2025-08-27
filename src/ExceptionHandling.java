public class ExceptionHandling {
    public static void main(String[] args)
    {
        int a=10,b=0;
        try
        {
            int c = a/b;
            System.out.println(c);
            int arr[] = new int[2];
            arr[5] = 10;
        }
        catch(ArithmeticException e)
        {
            System.out.println(e);
        }
        catch(Exception e)
        {
            System.out.println("Exception");
        }
        finally {
            System.out.println("must return finally");
        }
        System.out.println("return exception + finally + this program not running successfully");
    }
}

//public double divide(double a, double b) {
//    if (b == 0) {
//        throw new ArithmeticException("Divider cannot be zero!"); // inside method
//    }
//    return a / b;
//}
//public void readFile(String filename) throws IOException { --> method signature
//    FileReader reader = new FileReader(filename);
//    // Potential IOException must be declared
//}

// at compile time use try catch exception or throw/throws exception


//  try block is always executed based on the condition ->
//  -> if any statement inside try block throw exception redirected to catch block.
//  we can add multiple catch blocks out of that only one catch block is executed
//  order of catch blocks are first -> specific exception -> then parent exception
//  mostly global exception we use when multiple condition occur which we don't know at a time
//  finally block is executed after exception occurs
//  2 exceptions not occurs at a time example mention in code:
//  checked exception as compiled time exception
//  unchecked exception as run-time exception

/*
Common Java Built in Exceptions
......................................................
1. ArithmeticException → Divide by zero
2. ArrayIndexOutOfBoundsException → Wrong array index
3. ArrayStoreException → Wrong type stored in array
4. ClassCastException → Invalid type casting
5. IllegalArgumentException → Wrong argument passed
6. IllegalMonitorStateException → Monitor op. on unlocked thread
7. IllegalStateException → Invalid state of app/env
8. IllegalThreadStateException → Wrong thread operation
9. IndexOutOfBoundsException → Index out of range
10. NegativeArraySizeException → Array with -ve size
11. NullPointerException → Null reference access
12. NumberFormatException → String → number invalid
13. SecurityException → Security violation
14. StringIndexOutOfBoundsException → Wrong string index
15. UnsupportedOperationException → Unsupported operation
16. ClassNotFoundException → Class not found
17. CloneNotSupportedException → Cloning not allowed
18. IllegalAccessException → Class access denied
19. InstantiationException → Cannot create obj of abstract/interface
20. InterruptedException → Thread interrupted
21. NoSuchFieldException → Field not found
22. NoSuchMethodException → Method not found
....................................................................................
 */
