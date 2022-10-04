package course39;

class Reidai0101 {

	public static void main(String[] args) {
		try {
			int[] array = { 1, 2, 3, 4, 5 };
			for (int i = 0; i <= array.length; i++) {
				System.out.println(array[i]);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("例外を受け取りました");
		} finally {
			System.out.println("try文を終了します");
		}
	}
}
