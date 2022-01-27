package tw.com.fcb.sample.ijoshua29;

import java.util.Scanner;

public class ZeroFill {

	public static void main(String[] args) {
		
		char fillChar = '0';
		int num1 = 0;
		int maxLength = 8;
		String inputNumber;
		String pattern;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("請輸入8位數以內數字：");
		
		try {
			num1 = scanner.nextInt();
			inputNumber = String.valueOf(num1);
			
			if (inputNumber.length() > maxLength) {
				System.out.println("輸入超過8位數字");
			}
			else
			{
				pattern = "%" + maxLength + "s";
				// 字串左邊補0
				System.out.println(leftFill(pattern, inputNumber, fillChar));
			}			
		}
		catch (Exception ex)
		{
			System.out.println("輸入錯誤");
		}
		
		scanner.close();
	}
	
	private static String leftFill(String pattern,String strNumber, char fillChar)
	{			 
		return String.format(pattern, strNumber).replace(' ', fillChar);
	}

}
