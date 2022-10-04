package course39;

// １桁（0～9）の加算を行う

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class ZipCodeException extends RuntimeException {
	ZipCodeException(String s) {
		super(s);
	}
}

public class ZipCodeTester {

	/*--- nは１桁（0～9）か？ ---*/
	static boolean checkZipCode(String code) {
		Pattern pattern = Pattern.compile("^[0-9]{3}-[0-9]{4}$");
		Matcher matcher = pattern.matcher(code);
		return matcher.find();
	}

	/*--- １桁（0～9）の整数aとbの和を求める ---*/
	static String addPostMark(String code)
			throws ZipCodeException {
		String result = null;
		if (checkZipCode(code)) {
			result = "〒" + code;
		} else {
			throw new ZipCodeException(code);
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("郵便番号：");
		String code = stdIn.nextLine();
		try {

			System.out.println("入力された郵便番号は" + addPostMark(code) + "です。");
		} catch (ZipCodeException e) {
			System.out.println("入力は郵便番号ではありません" + e.getMessage());
		}
	}
}
