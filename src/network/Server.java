package network;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Arrays;

public class Server {

	public static void main(String[] args) {
		try {
			//10000番ポートを開放し、データ受け取るの準備
			ServerSocket svSock = new ServerSocket(10000);

			//分かりやすいようにSysout
			System.out.println("通信を待ち受けています。");

			//Socketを用意
			Socket sock = svSock.accept();

			//InputStreamを用意
			InputStream in = sock.getInputStream();

			//受け取ったデータをしまうための変数を準備
			//1024バイトのハコを用意
			byte[] data = new byte[1024];

			//inputStreamのデータを取得してdataに積める。
			int readSize = in.read(data);

			//dataは1024バイトなので、無駄な分を詰める
			data = Arrays.copyOf(data, readSize);

			//受け取ったデータを文字として扱うためにStringに変換。
			String receiveMoji = new String(data, "UTF-8");

			//画面表示
			System.out.println(receiveMoji + "を受信しました。");

			//受信ストリームの終了
			in.close();

			//サーバー終了
			svSock.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}