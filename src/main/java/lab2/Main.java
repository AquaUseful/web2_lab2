package lab2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Scanner scn = new Scanner(System.in);

        System.out.println("Input IPv6 address to check:");
        final String input = scn.nextLine();

        if (Ipv6Checker.checkStr(input)) {
            System.out.println("String is VALID IPv6 address");
        } else {
            System.out.println("String is INVALID IPv6 address");
        }

        scn.close();
    }
}
