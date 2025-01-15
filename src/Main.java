//import java.io.IOException;

import java.util.Scanner;

public class Main {
    public static void main(String args[]) { // throws IOException {

        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your *first* name?");
        String firstName = scanner.nextLine();
        // scanner.nextLine(), loops through characters assembling a string to return when enter is pressed.

        System.out.println("What is your *last* name?");
        String lastName = scanner.nextLine();

        System.out.println("%22s %22s %22s!!!".formatted("Hello", firstName, lastName));

        System.out.println("How many years old are you");
        //floating point decimal number e.g. 12.34
        float age = scanner.nextFloat();

        // %f is to insert a floating point number
        System.out.printf("You are %.2f years old!!!\n", age);
        System.out.println("You are %.2f years old!!!".formatted(age));
        System.out.println( String.format("You are %.2f years old!!!", age) );
    }
}

// This code, loops through characters assembling a string to return when enter is pressed.
// Like scanner.nextLine() does.
//        Character c = 0; //ASCII or UTC-8 A mapping of numbers to letters. Code.
//        int CR = 13;
//        int LF = 10;
//        while (c != CR && c != LF) {
//            c = (char)System.in.read();
//            if(c != CR && c != LF) {
//                name += c;
//            }
//        }
//
//        System.out.println("Hello %s!!!".formatted(name));
