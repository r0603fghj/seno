package course39;

class Reidai0103 {

	public static void main(String[] args) {
		try {
			int[] array = new int[-5];
		} catch (NegativeArraySizeException e) {
			System.out.println("添え字がマイナスです");
		}
	}
}
