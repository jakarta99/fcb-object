package tw.com.fcb.sample.h25949;

import java.util.Scanner;

public class h25949 {
	public static void main(String[] args) {
		Scanner inputReader = new Scanner(System.in);
		
		System.out.print("Enter a 長度: ");
        int i = inputReader.nextInt();
		System.out.println("輸入的長度是"+i);
        
        System.out.print("Enter a 文字: ");
        String s = String.format("%s",inputReader.next());
        System.out.println("輸入的是："+s+"；長度是："+s.length());
        
        String ok = "";
        for (int x=0;x<(i-s.length());x++) {
        	ok = ok + 0;
        }
        System.out.println(ok+s);
	}
}
