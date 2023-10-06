package Lab2;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String IP = scanner.nextLine();

        String rv = "^((25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$";

        Pattern pattern = Pattern.compile(rv);
        Matcher matcher = pattern.matcher(IP);

        if (matcher.matches()) {
            System.out.println("Правильный");
        }
        else {
            System.out.println("Неправильный");
        }

    }
}
