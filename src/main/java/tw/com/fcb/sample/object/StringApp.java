package tw.com.fcb.sample.object;

public class StringApp {

	public static void main(String[] args) {

		String a = "Hello";
		String b = "Hello";

		System.out.println(a == b);

		String c = new String("Hello");
		String d = new String("Hello");

		System.out.println(c == d);
		System.out.println("c.equals(d) = " + c.equals(d));

		Song song1 = new Song();
		song1.setName("ABC");

		Song song2 = new Song();
		song2.setName("ABC");

		System.out.println(song1 == song2);

		System.out.println("song1.equals(song2) = " + song1.equals(song2));

		String str1 = "Hello ".concat("Kitty");
		System.out.println("String1 = " + str1);
		
		int number10 = 10;
		String str2 = String.valueOf(number10);
		System.out.println("String2 = " + str2);
		
		String str3 = "This is a book. that is a pen.";
		int indexPosition = str3.indexOf("book");
		System.out.println("String3 index = " + indexPosition);
		
		str3 = "This is 一 book. that is a pen.";
		indexPosition = str3.indexOf("book");
		System.out.println("String3 index = " + indexPosition);
		
		System.out.println("str3.substring(10) = " + str3.substring(10));
		System.out.println("str3.substring(10,14) = " + str3.substring(10, 14));

		
		String str4 = "1, First Bank, 02-1111-2222";
		String[] data = str4.split(",");
		
		System.out.println(data[1]);
		System.out.println(data[1].trim());
		
		String str5 = "a123123456";
		System.out.println(str5.toUpperCase());
		
		System.out.println("str5 length = " + str5.length());
		
	}

}
