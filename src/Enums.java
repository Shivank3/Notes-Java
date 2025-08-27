public class Enums {
    public static void main(String[] args)
    {
//        Status s = Status.pending;
//        System.out.println(s.ordinal());
        Status[] s = Status.values();
        for (Status st: s)
        {
            System.out.println(st + " - " + st.ordinal());
        }
        Status s1 = Status.Running;
        System.out.println(s1.getClass().getSuperclass());

//        if(s1 == Status.success)
//        {
//            System.out.println("Successfully done");
//        }
//        else if(s1 == Status.failed)
//        {
//            System.out.println("Failed status");
//        }
//        else if(s1 == Status.pending)
//        {
//            System.out.println("pending status");
//        }
//        else {
//            System.out.println("Unsuccessful status");
//        }
        switch(s1)
        {
            case Running:
                System.out.println("Running ok");
                break;

            case pending:
                System.out.println("Pending");
                break;

            case success:
                System.out.println("Success");
                break;

                case failed:
                    System.out.println("Failed");
                    break;
        }
    }
}
enum Status
{
    Running, pending, failed, success;
    // 0,1,2,3
}

        // enumeration
