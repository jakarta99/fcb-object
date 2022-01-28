package tw.com.fcb.sample.ijoshua29;

import java.util.Scanner;

public class ZeroFill {

	public static void main(String[] args) {
		
		char fillChar = '0'; 
		int num1 = 0;
		int maxLength = 8;
		String inputNumber;
		
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
				// 字串左邊補0
				System.out.println(leftFill(inputNumber, fillChar, maxLength));
			}			
		}
		catch (Exception ex)
		{
			System.out.println("輸入錯誤");
		}
		
		scanner.close();
	}
	
	private static String leftFill(String strNumber, char fillChar, int maxLength)
	{			 
		//return String.format(pattern, strNumber).replace(' ', fillChar);
		String rtnStr = "";
		int strIndex = 0;
		
		for (int i = 0; i < maxLength; i++)
		{
			if (i < (maxLength - strNumber.length()))
			{
				rtnStr = rtnStr + fillChar;
			}
			else
			{
				rtnStr = rtnStr + strNumber.charAt(strIndex);
				strIndex ++;
			}				
			
			System.out.println("i(" + i + ")=" + rtnStr);
		}
		
		return rtnStr;
	}

}
