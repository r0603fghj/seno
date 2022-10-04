package network;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class Client {
	public static void main(String[] args) {
		try {
			System.out.println("接続中...");
			//通信相手を定め、「socket」を作成
			Socket sock = new Socket("10.6.112.211", 10000);

			System.out.println("接続しました。");

			//相手に送るための道路OutputStreamを用意
			OutputStream out = sock.getOutputStream();

			//送るデータの内容を決定
			String sendData = "こんにちはー。";
			//データの送信
			out.write(sendData.getBytes("UTF-8"));

			//送信データの表示
			System.out.println("「" + sendData + "」を送信しました。");

			//outputStreamを閉じる。
			out.close();
			//終了
			sock.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
