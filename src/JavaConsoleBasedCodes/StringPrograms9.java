package JavaConsoleBasedCodes;

public class StringPrograms9 {
     static void main(String[] args)
    {
        String name = "Shiva mangal";
        int length = name.length();
        char letter = name.charAt(0);
        int index = name.indexOf("a");
        int lastIndex = name.lastIndexOf("a");

        name = name.toUpperCase();
        name = name.toLowerCase();
        name = name.trim();
        name = name.replace("a", "u");

        System.out.println(length);
        System.out.println(letter);
        System.out.println(index);
        System.out.println(lastIndex);

        System.out.println(name);
        System.out.println(name);

        if(name.isEmpty()){
            System.out.println("Your name is empty! ");
        }
        else{
            System.out.println("your name is: " + name);
        }
        if(name.contains(" ")){
            System.out.println("your name contain spaces!");
        }
        else{
            System.out.println("your code doesn't contain spaces!");
        }
        if(name.equals("password")){
            System.out.println("your name can't be password!");
        }
        else{
            System.out.println("your name can be password!");
        }
    }
}
