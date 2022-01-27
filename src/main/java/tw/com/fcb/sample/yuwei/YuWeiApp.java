package tw.com.fcb.sample.yuwei;

import java.util.Scanner;

import org.apache.commons.lang3.StringUtils;

public class YuWeiApp {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 12;
		String result = "";
		System.out.println("please input total length:");
		Scanner scanner = new Scanner(System.in);
		int length= scanner.nextInt();
		NumericProcess numericProcess = new NumericProcess();
		result = numericProcess.leftPadding(num,length,result);
		System.out.println(result);
		result = numericProcess.rightPadding(num,length,result);
		System.out.println(result);
	}
	
}
