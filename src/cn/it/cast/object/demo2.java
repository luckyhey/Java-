package cn.it.cast.object;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;

/*
public class demo2 {
	
	public static void main(String[] args) {

		String str = new String();
		byte[] buf = {97,98,99};
		
		str = new String(buf); //使用一个字节数组构建一个字符串对象
		str = new String(buf,1,2);   //使用一个字节数组构建一个字符串对象,指定开始解码 的索引值和解码的个数。
	char[] arr = {'明','天','是','圣','诞'};
		str = new String(arr); //使用字符数组构建一个字符串
	str = new String(arr,3,2);
		
		int[] 	buf2 = {65,66,67};
	str = new String(buf2,0,3);
	
		//str = new String("abc");
		
		
		System.out.println("字符串的内容："+str);
		
		
		
		
	}
	
}


public class demo2{
	public static void main(String[] args) {
		System.out.print("hello,world".matches("hello\\b,world"));
	}
}


class demo2{
	public static void main(String[] args) throws Exception {
		DatagramSocket socket = new DatagramSocket(9099);
		byte[] buf = new byte[1024];
		DatagramPacket pac = new DatagramPacket(buf, buf.length);
		while(true){
			socket.receive(pac);
			System.out.println(new String(buf, 0, pac.getLength()));
			//socket.close();
		}
		
	}
}

class demo2 extends Thread{
	public void run(){
		try {
			DatagramSocket socket = new DatagramSocket(9099);
			byte[] buf = new byte[1024];
			DatagramPacket packet = new DatagramPacket(buf, buf.length);
			boolean flag = true;
			while(flag){
					socket.receive(packet);
					System.out.println(packet.getAddress().getHostAddress() +new String(buf, 0, packet.getLength()));
					flag = false;
			}
					socket.close();
		} catch (SocketException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

class demo2{
	public static void main(String[] args) throws Exception {
		ServerSocket server = new ServerSocket(9099);
		Socket socket = server.accept();
		System.out.println("哈哈");
		InputStream input = socket.getInputStream();
		byte[] buf = new byte[1024];
		int length = 0;
		length = input.read(buf);
		System.out.println("哈哈::" + new String(buf, 0, length));
		
		OutputStream  output = socket.getOutputStream();
		output.write("客户你好啊".getBytes());
		server.close();
	}
}
*/
class demo2{
	public static void main(String[] args) throws Exception {
		ServerSocket server = new ServerSocket(9099);
		Socket socket = server.accept();
		BufferedReader buff = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		OutputStreamWriter socketout = new OutputStreamWriter(socket.getOutputStream());
		BufferedReader keyreader = new BufferedReader(new InputStreamReader(System.in));
		
		String line = null;
		System.out.println("哈哈" );
		
		
		while((line = buff.readLine()) != null){
			System.out.println("哈哈::" + line);
			//System.out.println("回复::");
			line = keyreader.readLine();
			socketout.write(line + "\r\n");
			socketout.flush();
		}
		
		
		
		server.close();
//		InputStream input = socket.getInputStream();
//		byte[] buf = new byte[1024];
//		int length = 0;
//		length = input.read(buf);
//		System.out.println("哈哈::" + new String(buf, 0, length));
//		
//		OutputStream  output = socket.getOutputStream();
//		output.write("客户你好啊".getBytes());
		
	}
}