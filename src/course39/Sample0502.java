package course39;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

class Sample0502 {
	public static void main(String[] args) {
		try {
			// 存在しないファイルを開きます。
			File inputFile = new File("あいうえおかきくけこ");
			FileInputStream fileInputStream = new FileInputStream(inputFile);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
