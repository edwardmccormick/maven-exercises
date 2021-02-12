
import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class HelloMaven {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter a String.");
        String input = in.nextLine().trim();
        System.out.println("You entered: " + input);
        if (StringUtils.isNumeric(input)) {System.out.println(input + " is a number");} else {System.out.println((input + " is not a number."));}
        System.out.println("Flipped case for your input is: " + StringUtils.swapCase(input));
        System.out.println("Reversed: " + StringUtils.reverse(input));


    }
}
