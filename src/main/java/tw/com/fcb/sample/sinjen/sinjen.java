package tw.com.fcb.sample.sinjen;

import java.util.InputMismatchException;
import java.util.Scanner;
//import org.apache.commons.lang3.StringUtils;

public class sinjen {

	public static void main(String[] args) {

		// 方法一：使用 String.format() 字串格式化
		System.out.println(String.format("%08d", 12));

		// 方法二：使用Apache Commons Lang函式庫的StringUtils.leftPad()
		// System.out.println(StringUtils.leftPad("12", 8, '0'));

		// 方法三：字串左測補字方法(也是String.format())
		System.out.println(leftPadding("12", 8, '0'));

		// 方法四：System.arraycopy()方法，複製從指定源數組的數組，開始在指定的位置，到目標數組的指定位置。
		// System.out.println(padLeft("12", 8, '0'));
		System.out.println(padRight("12", 8, '0'));
		
		// 方法五：基本迴圈用法
		System.out.println(forformat("12", 8, '0'));
		
		//參數輸入方法
		systemIn();
	}

	
	private static void systemIn() {
		Scanner scanner = new Scanner(System.in);
		try {
			
			boolean flag = false;
			do {
				System.out.println("請輸入任意英數字：");
				String input = scanner.nextLine();
				System.out.print("請輸入字串長度：");
				int numLength = scanner.nextInt();
				if (numLength <= 0) {
					System.out.println("資料呈現長度不得小於等於0");
				} else {
					System.out.println(forformat(input, numLength, '0'));
					flag = true;
				}
			} while (!flag);

		} catch (InputMismatchException e) {
			System.out.println("字串長度輸入錯誤，僅可輸入數字");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			scanner.close();
		}
	}	
	
	private static String forformat(String str, int len, char Char) {
		int diff = len - str.length();
		if (diff <= 0) {
			return str;
		} else {
			String zeroString = new String();
			for (int i = 0; i < (len - str.length()); i++) {
				zeroString = zeroString + Char;
			}
			return zeroString + str;
		}
	}
	
	
	// https://matthung0807.blogspot.com/2019/12/java-string-right-left-padding-character.html
	private static String leftPadding(String str, int length, char padChar) {
		if (str == null) {
			str = "";
		}
		if (str.length() > length) {
			return str;
		}
		String pattern = "%" + length + "s";
		return String.format(pattern, str).replace(' ', padChar);
	}

	
	//https://codertw.com/%E7%A8%8B%E5%BC%8F%E8%AA%9E%E8%A8%80/304686/
	// String左對齊
	public static String padLeft(String src, int len, char ch) {
		int diff = len - src.length();
		if (diff <= 0) {
			return src;
		}
		char[] charr = new char[len];
		System.arraycopy(src.toCharArray(), 0, charr, 0, src.length());
		for (int i = src.length(); i < len; i++) {
			charr[i] = ch;
		}
		return new String(charr);
	}

	// String右對齊
	public static String padRight(String src, int len, char ch) {
		int diff = len - src.length();
		if (diff <= 0) {
			return src;
		}
		char[] charr = new char[len];
		/**
		 * @param src     the source array.
		 * @param srcPos  starting position in the source array.
		 * @param dest    the destination array.
		 * @param destPos starting position in the destination data.
		 * @param length  the number of array elements to be copied.
		 */
		//System.out.println(src.toCharArray() + " " + 0 + " " + charr + " " + diff + " " + src.length());
		System.arraycopy(src.toCharArray(), 0, charr, diff, src.length());
		for (int i = 0; i < diff; i++) {
			charr[i] = ch;
		}
		return new String(charr);
	}
	
}
