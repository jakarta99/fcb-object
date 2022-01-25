package tw.com.fcb.sample.sinjen;

import org.apache.commons.lang3.StringUtils;

public class sinjen {

	public static void main(String[] args) {

		// 使用 String.format() 字串格式化
		System.out.println(String.format("%08d", 12));

		// 使用Apache Commons Lang函式庫的StringUtils.leftPad()
		System.out.println(StringUtils.leftPad("12", 8, '0'));

		// 字串左測補字方法
		System.out.println(leftPadding("12", 8, '0'));

	}

	//https://matthung0807.blogspot.com/2019/12/java-string-right-left-padding-character.html
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
}
