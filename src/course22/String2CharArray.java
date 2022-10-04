package course22;

public class String2CharArray {

    public static void main(String[] args) {
        String str = "abcdefg";

        //String型をchar[]型に変換
        char[] charArray = str.toCharArray();
        for(char c : charArray) {
            System.out.println(c);
        }

        //char[]型をString型に変換
        String newStr = new String(charArray);
        System.out.println(newStr);
    }
}
