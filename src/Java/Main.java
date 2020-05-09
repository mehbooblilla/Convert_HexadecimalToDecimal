package Java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
 //       Java program to convert hexadecimal to decimal:
        System.out.print("Enter Hexadecimal NUmber:");
        String hexDeciNumber=scanner.next();
        System.out.println("Hexadecimal to decimal conversion: ");
        System.out.println("output: "+ Integer.parseInt(hexDeciNumber,16));
 //      Java conversion of decimal to hexadecimal:
        System.out.print("Enter a Decimal number:");
        int deciNumber=scanner.nextInt();
        String hexDecNumber=Integer.toHexString(deciNumber);
        System.out.println("Decimal To Hexadecimal conversion:");
        System.out.println("Output: "+ hexDecNumber);


    }
}
