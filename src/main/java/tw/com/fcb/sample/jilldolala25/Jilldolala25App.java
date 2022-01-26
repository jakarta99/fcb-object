package tw.com.fcb.sample.jilldolala25;

import tw.com.fcb.sample.object.Song;

import java.util.Scanner;

public class Jilldolala25App {
    public static void main(String[] args) {
        int input;
        int input1;

            System.out.print("請輸入一個數值:");
            Scanner scanner = new Scanner(System.in);
            input = scanner.nextInt();

            NumericProcess numericProcess = new NumericProcess();
            System.out.println("DecimalFormat = " + numericProcess.DecimalFormat(input));
            System.out.println("SubStringFormat = " + numericProcess.SubStringFormat(String.valueOf(input)));
            System.out.println("StringFormat = " + numericProcess.StringFormat(input));

            System.out.print("請輸入長度:");
            Scanner scanner1 = new Scanner(System.in);
            input1 = scanner1.nextInt();
            System.out.println("paddingLeft = " + numericProcess.PaddingLeft(String.valueOf(input), input1));
            System.out.println("contactProcess = " + numericProcess.ContactProcess("that","this"));



    }
}
