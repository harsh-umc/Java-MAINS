import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        System.out.println("PART 1");

        System.out.println("Enter a double value ");
        Scanner scnr = new Scanner(System.in);
        double a = scnr.nextDouble();
        System.out.println("The square root of this number is "+Math.sqrt(a));
        System.out.printf("The power of two would be %.2f%n", Math.pow(a, 2));
        System.out.println("The Rounded value would be "+Math.round(a));
        System.out.println("The ceiling value would be "+Math.ceil(a));
        System.out.println("The floor value would be "+Math.floor(a));

        System.out.println("PART 2");
        System.out.println("Please enter one character: ");
        char b = scnr.next().charAt(0);

        if(b>='A' && b<='Z'){
            System.out.println("It's a Uppercase Letter");
        }
        else if(b>='a' && b<='z'){
            System.out.println("It's a Lowercase Letter");
        }
        else if(b>='0' && b<='9'){
            System.out.println("It's a number");
        }

        int unicode = 'b';
        System.out.println("The Unicode value of this character is "+unicode);

        unicode = unicode + 1;
        System.out.println("The next Unicode value of this character is "+unicode);

        System.out.println("Please enter your full name(first & last name seperated by space): ");
        scnr.nextLine();
        String c = scnr.nextLine();

        System.out.println("The Length of the String is: "+c.length());
        System.out.println("The First Character is: "+c.charAt(0));
        
        int space = c.indexOf(" ");
        System.out.println("The first name is: "+c.substring(0, space));
        System.out.println("The last name is: "+c.substring(space+1));
        System.out.println("The Name converted to uppercase will be: "+c.toUpperCase());
    }
}
