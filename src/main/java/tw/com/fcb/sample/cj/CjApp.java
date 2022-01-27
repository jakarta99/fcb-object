package tw.com.fcb.sample.cj;

import java.util.InputMismatchException;
import java.util.Scanner;

import static java.lang.Integer.parseInt;
import static org.apache.commons.lang3.StringUtils.isNumeric;

public class CjApp {
    public static void main(String[] args){

        Integer digits;
        Integer input;
        String output = null;
        Scanner sc =new Scanner(System.in);

        System.out.println("請輸入要產生的位數:");

        while (true){
            try {
                digits = sc.nextInt();
                break;
            }catch (InputMismatchException e){
                System.out.println("輸入值非數字，請重新輸入要產生的位數:");
                sc.next();
            }
        }

        System.out.println("請輸入數值:");

        while (true){
            try {
                input = sc.nextInt();
                break;
            }catch (InputMismatchException e){
                System.out.println("輸入值非數字，請重新輸入數值:");
                sc.next();
            }
        }

        Transfer transfer = new Transfer();

        System.out.println("simple: "+transfer.simple(input,digits));
        System.out.println("format: "+transfer.format(input,digits));

    }

}
