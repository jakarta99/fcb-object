package tw.com.fcb.sample.jilldolala25;

import tw.com.fcb.sample.object.Song;

import java.util.Scanner;

public class Jilldolala25App {
    public static void main(String[] args) {
        int input;
        try {
            System.out.print("請輸入一個數值:");
            Scanner scanner = new Scanner(System.in);
            input = scanner.nextInt();
            NumericProcess numericProcess = new NumericProcess();
            System.out.println("DecimalFormat = " + numericProcess.DecimalFormat(input));
            System.out.println("SubStringFormat = " + numericProcess.SubStringFormat(String.valueOf(input)));
            System.out.println("StringFormat = " + numericProcess.StringFormat(input));


        }catch (Exception e){
            System.out.println("輸入錯誤，請重新輸入");
        }

    }
}
