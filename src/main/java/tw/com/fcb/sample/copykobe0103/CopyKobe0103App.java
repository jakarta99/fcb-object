package tw.com.fcb.sample.copykobe0103;

import java.util.Scanner;

public class CopyKobe0103App {

	public static void main(String[] args) {

		int inputNumber = 0;
		int inputLengh;
		String resultString = "" ;

		try {
			Scanner input = new Scanner(System.in);
			System.out.println("======================================================================");
			System.out.print("請輸入數字:");
			inputNumber = input.nextInt();
			System.out.print("請輸入數字總長度");
			inputLengh = input.nextInt();
			if (inputLengh - (String.valueOf(inputNumber).length()) >= 0) {

				for (int i = 0; i < inputLengh - (String.valueOf(inputNumber)).length(); i++) {
					resultString = resultString + "0";
				}
				System.out.println(resultString + inputNumber);
			} else {
				System.out.println("輸入之數字長度大於總長度");
			}

		}catch (Exception e ){
			System.err.println("你來亂的，請離開");
		}

	}

}
