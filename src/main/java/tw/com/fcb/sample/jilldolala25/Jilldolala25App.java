package tw.com.fcb.sample.jilldolala25;

import tw.com.fcb.sample.object.Song;

import java.security.spec.ECField;
import java.util.Scanner;

public class Jilldolala25App {
    public static void main(String[] args) throws Exception{
        int input;
        int input1;
        try {
            System.out.print("請輸入一個數值:");
            Scanner scanner = new Scanner(System.in);
            input = scanner.nextInt();
            System.out.print("請輸入長度:");
            Scanner scanner1 = new Scanner(System.in);
            input1 = scanner1.nextInt();
            NumericProcess numericProcess = new NumericProcess();
            System.out.println("DecimalFormat   = " + numericProcess.DecimalFormat(input, input1));
            System.out.println("SubStringFormat = " + numericProcess.SubStringFormat(String.valueOf(input), input1));
            System.out.println("StringFormat    = " + numericProcess.StringFormat(input, input1));
            System.out.println("paddingLeft     = " + numericProcess.PaddingLeft(String.valueOf(input), input1));
            System.out.println("contactProcess  = " + numericProcess.ContactProcess("dog", "cat"));
        }catch (Exception e) {
            System.out.println("輸入錯誤!!");

        }

    }
}
