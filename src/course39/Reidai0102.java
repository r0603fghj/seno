package course39;

class Reidai0102 {

	public static void main(String[] args) {
		try {
			String str = null;

			if (str.equals("aaa")) {
				System.out.println("文字はaaaです");
			}
		} catch (NullPointerException e) {
			System.out.println("文字の中身がnullです");
		}
	}
}
