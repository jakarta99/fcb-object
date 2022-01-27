package tw.com.fcb.sample.WeiFan;

import java.util.Scanner;

public class WeiFan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("請輸入數字：");
		String Number = s.nextLine();
		System.out.println("請輸入數字長度：");
		int Len = s.nextInt();
		if(Len >= Number.length()) {
			String Z = "";
			for(int i = 0 ; i < Len - Number.length(); i++) {
				Z = Z+ "0";
			}
			Number = Z +Number;
		}else {
			System.out.println("長度輸入錯誤，無法補零");
		}
		System.out.println(Number);
	}

}
