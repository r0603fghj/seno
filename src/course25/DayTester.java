package course25;

// 日付クラスDay【第１版】利用例（その１：日付を表示）

import java.util.Scanner;
class Day {
    private int year;               // 年
    private int month;          // 月
    private int date;               // 日

    //--- コンストラクタ ---//
    Day(int year, int month, int date) {
        this.year  = year;      // 年
        this.month = month;     // 月
        this.date  = date;      // 日
    }

    //--- 年・月・日を取得 ---//
    int getYear()  { return year; }     // 年を取得
    int getMonth() { return month; }    // 月を取得
    int getDate()  { return date; }     // 日を取得

    //--- 年・月・日を設定 ---//
    void setYear(int year)   { this.year  = year; }     // 年を設定
    void setMonth(int month) { this.month = month; }    // 月を設定
    void setDate(int date)   { this.date  = date; }     // 日を設定

    void set(int year, int month, int date) {                   // 年月日を設定
        this.year  = year;      // 年
        this.month = month;     // 月
        this.date  = date;      // 日
    }

    //--- 曜日を求める（日曜日～土曜日を0～6で返却） --//
    int dayOfWeek() {
        int y = year;
        int m = month;
        if (m == 1 || m == 2) {
            y--;
            m += 12;
        }
        return (y + y / 4 - y / 100 + y / 400 + (13 * m + 8) / 5 + date) % 7;
    }
}

class DayTester {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		String[] wd = {"日", "月", "火", "水", "木", "金", "土"};

		System.out.println("誕生日を西暦で入力せよ。");
		System.out.print("年：");  int y = stdIn.nextInt();
		System.out.print("月：");  int m = stdIn.nextInt();
		System.out.print("日：");  int d = stdIn.nextInt();

		Day birthday = new Day(y, m, d);

		System.out.println("あなたの誕生日"
											 + birthday.getYear()  + "年"
											 + birthday.getMonth() + "月"
											 + birthday.getDate()  + "日は"
											 + wd[birthday.dayOfWeek()] + "曜日です。");
	}
}
