package cn.it.cast.object;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.SequenceInputStream;
import java.io.UnsupportedEncodingException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;





//public class demo3 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//String str ="asdfghjjk";
//System.out.println("�ַ��������ݣ�"+str.endsWith("a"));
//System.out.println("�ַ��������ݣ�"+str.isEmpty());
//System.out.println("�ַ��������ݣ�"+str.contains("a"));
//System.out.println("�ַ��������ݣ�"+str.equalsIgnoreCase("ABC�й�"));
//char[] abc = str.toCharArray();
//System.out.println("�ַ��������ݣ�"+Arrays.toString(abc));
//byte[] abcd = str.getBytes();
//System.out.println("�ַ��������ݣ�"+Arrays.toString(abcd));
//	}
//
//}
/*
public class demo3 {
	public static void main(String[] args){
	String str ="123456";
	;
	System.out.println("�ַ��������ݣ�" + str.replace('2','d'));
	
	str = "���,�����";
	String[] arr = str.split(",");
	System.out.println("�ַ��������ݣ�" + Arrays.toString(arr));
	 str = str.substring(1,2);
	System.out.println("�ַ��������ݣ�" + str);
	
	str = "   a b c ";
	System.out.println("�ַ��������ݣ�" + str.toUpperCase());
	System.out.println("�ַ��������ݣ�" + str.toLowerCase());
	System.out.println("�ַ��������ݣ�" + str.trim());
	
	
	
	str =  "D:\\20120512\\day12\\Demo1.java";
	 String ppp =  reverse(str);
	 System.out.println("�ַ��������ݣ�" + ppp);
	getFileName(str);

	}
	public static void getFileName(String path){
		int index = path.lastIndexOf("\\");
		System.out.println("����ֵ"+ index);
		String fileName = path.substring(index+1);
		System.out.println("�ļ�����"+ fileName);
	
	}
	
	public static String reverse(String str){
		char[] arr = str.toCharArray();
		for(int startIndex = 0 , endIndex=arr.length-1 ; startIndex<endIndex; startIndex++,endIndex--){
				char temp = arr[startIndex];
				arr[startIndex] = arr[endIndex];
				arr[endIndex] = temp;
		}
		//ʹ���ַ����鹹��һ���ַ�����
		return new String(arr);
	}

}

public class demo3{
	public static void main(String[] args){
//		String str1 = "hello";
//		String str2 = str1 + "world";
//		System.out.println(str1 == str2);
		
		StringBuffer aa =new StringBuffer();
		aa.append("hello") ;
		aa.append("hello") ;
		aa.append("hello") ;
		aa.append("hello") ;
		aa.append("hello") ;
		aa.append("hello") ;
		aa.append("hello") ;
		aa.append("12453687adfafg");
		aa.append(true);
		aa.insert(6, false);
		aa.delete(0, 1);
		aa.deleteCharAt(1);
		aa.replace(0, 6, "hey");
		aa.reverse();
		aa.setCharAt(0, 'c');
		aa.ensureCapacity(15);
		int c = aa.capacity();
		System.out.println(c);
		int d = aa.length();
		System.out.println(d);
		String bb = aa.substring(0, 15);
		char ddd = aa.charAt(12);
		System.out.println(ddd);
		System.out.println(aa);
		System.out.println(bb);
		System.out.println("["+ aa.toString()+"]");
	}
}



class Person{
	
	String name;

	public Person(String name) {
		this.name = name;
	}
	
	@Override
	public void finalize() throws Throwable {
		super.finalize();
		System.out.println(this.name+"��������..");
	}
}
class demo3{
	public static void main(String[] args){
		int[] arr ={1,2,4,5,67,8};
		int[] des = new int[5];
		
		
		System.arraycopy(arr,0,des,0,4);
		System.out.println("["+ Arrays.toString(arr)+"]");
		System.out.println("["+ Arrays.toString(des)+"]");
//		currentTimeMillis
		System.out.println("["+ System.currentTimeMillis()+"]");
//		System.exit(0);
	System.gc();
	//System.getenv("HOME");
	//System.out.println(System.getenv("JAVA_HOME"));
	 //Properties sss = System.getProperties() ;
	 //sss.list(System.out);
	String vali =  System.getProperty("os.name");
	System.out.println(vali );
//		for(int i =0; i < 4;i++)
//		{
//			new Person("abc");
//			System.gc();
//		}
		
	}
}



public class demo3{
	public static void main(String[] args)throws Throwable {
		System.out.println("JAVA_HOME");
		Runtime run11 = Runtime.getRuntime();
		//Process process = run11.exec("C:\\Program Files (x86)\\Tencent\\QQ\\Bin\\QQScLauncher.exe");
	    //Thread.sleep(3000);
		//process.destroy();
		System.out.println(run11.freeMemory());
		
		System.out.println(" Java������еĿ����ڴ�����"+run11.freeMemory());
		System.out.println("Java �������ͼʹ�õ�����ڴ���:"+ run11.maxMemory());
		System.out.println("���� Java ������е��ڴ�����:"+ run11.totalMemory());
		
//		Date date =new Date();
//		System.out.println("��ݣ�"+ date.getYear());

		Calendar calendar = Calendar.getInstance(); //��ȡ��ǰ��ϵͳʱ�䡣
		System.out.println("�꣺"+ calendar.get(Calendar.YEAR));
		System.out.println("�£�"+ (calendar.get(Calendar.MONTH)+1));
		System.out.println("�գ�"+ calendar.get(Calendar.DATE));
		System.out.println("ʱ��"+ calendar.get(Calendar.HOUR_OF_DAY));
		System.out.println("�֣�"+ calendar.get(Calendar.MINUTE));
		System.out.println("�룺"+ calendar.get(Calendar.SECOND));
		
		Date date = new Date(); //��ȡ��ǰ��ϵͳʱ�䡣
		System.out.println("��ǰ��ϵͳʱ��1111111111111111��"+ date);
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd	HHʱmm��ss��") ; //ʹ����Ĭ�ϵĸ�ʽ������һ�����ڸ�ʽ������
		String time = dateFormat.format(date);  //���԰�����ת��תָ����ʽ���ַ���
		System.out.println("��ǰ��ϵͳʱ�䣺"+ time);
		
		String birthday = "2000-12-26	11ʱ29��08��";
		Date date2 = dateFormat.parse(birthday);  //ע�⣺ ָ�����ַ�����ʽ����Ҫ��SimpleDateFormat��ģʽҪһ�¡�
		System.out.println(date2);
		
		Date date21 =new Date();
		SimpleDateFormat dateFormat2 = new SimpleDateFormat("yyyy��MM��dd��  HH:mm:ss");
		String time2 =dateFormat2.format(date21);
		String time21=dateFormat2.format(date);
		System.out.println("��ǰ��ϵͳʱ�䣺"+time2);
		String birthday1= "2000��12��26��  11:28:08";
		Date date22=dateFormat2.parse(birthday1);
		System.out.println(date22);
		
		
		System.out.println(Math.abs(3.14));
		System.out.println(Math.ceil(-2.98));
		System.out.println(Math.floor(-3.14));
		System.out.println(Math.round(3.94));
		System.out.println(Math.random());
		
		int count = 0;
		int num = 10;
		double p;
		for(int i =0; i < num; i++)
		{
			if(Math.random() > 0.500)
			{
				count++;
			}
		}
		p = (double)count/num;
		System.out.println("������" + p );
		
		
		Random suijishu = new Random();
		StringBuilder sb = new StringBuilder();
		char[] arr = {'��','��','��','��','��','��','��','Ҳ','��','��'};
		
		for(int i = 0;  i < 4; i++)
		{
			int index = suijishu.nextInt(arr.length);
			sb.append(arr[index]);
		}
		System.out.println("��֤����:\t" + sb );
	}
	
}


public class demo3 extends Thread{
	public static void main(String[] args){
		demo3 dd = new demo3();
		dd.start();
		for(int i = 0;  i < 100; i++)
		{
			System.out.println("��֤����:222333333" + i );
		}
		
    }

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		for(int i = 0;  i < 100; i++)
		{
			System.out.println("��֤����:222" + i );
		}
	}
	
	
}


 class talk11 extends Thread{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		while(true){
		System.out.println("wenzui11111111"  );
		}
	}
	
}
 class video11 extends Thread{
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		while(true){
		System.out.println("��Ƶ"  );
		}
	}
}
public class demo3 extends Thread{
	public static void main(String[] args){
		demo3 dd = new demo3();
		dd.start();
		talk11 ff = new talk11();
		ff.start();
		video11 ee = new video11();
		ee.start();
			System.out.println("��֤����:222333333"  );
		
		
    }
}


public class demo3 extends Thread {
 public demo3(String name)
 {
	 super(name);
 }
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		for (int i = 0; i < 10 ; i++) {
			System.out.println(this.getName()+":"+i);
			
			try {
				Thread.sleep(10);
				Thread mainthread = Thread.currentThread();
				System.out.println("1111�̵߳�������" + mainthread);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			/*try {
				Thread.sleep(100);  //Ϊʲô�����ﲻ���׳��쳣��ֻ�ܲ��񣿣� Thread���run����û���׳��쳣���ͣ��������಻���׳��쳣���͡�
			} catch (InterruptedException e) {
				e.printStackTrace();
			} 
//			Thread mainthread = Thread.currentThread();
//			System.out.println("1111�̵߳�������" + mainthread);
		}
	}
/*	
	public static void main(String[] args) {
		demo3 d = new demo3("����");
		//d.setPriority(10); //�����߳� �����ȼ��� ���ȼ�������Խ�����ȼ�Խ��  �� ���ȼ��ķ�Χ��1~10
		System.out.println("�Զ����̵߳����ȼ�" + d.getPriority());
		System.out.println("���̵߳����ȼ�" + Thread.currentThread().getPriority());
		d.setName("012");
		d.start();
		//d.sleep(1000);
		System.out.println(d.getName());
//		for (int i = 0; i < 100 ; i++) {
//			System.out.println(Thread.currentThread().getName()+":"+i);
//		}
		Thread mainthread = Thread.currentThread();
		System.out.println("���̵߳�������" + mainthread);
	}
}

class SaleTicket1 extends Thread{
 // int num = 50;
	static int num = 5000;
	static Object o = new Object();
public SaleTicket1(String name){
	super(name);
}
@Override
public void run() {
	// TODO Auto-generated method stub
	super.run();
	while(true){
		synchronized(o){
		if(num > 0)
		{
			System.out.println( Thread.currentThread().getName() + "�۳��˵�" + num + "��Ʊ");
			num = num -10;
		}
		else
		{
			System.out.println(Thread.currentThread().getName() +"ȡ����");
			//break;
			System.exit(0);
		}
		}
	}
 } 
}
//class SaleTicket2 extends Thread{
//	  //int num = 50;
//	  public SaleTicket2(String name){
//			super(name);
//		}
//	@Override
//	public void run() {
//		// TODO Auto-generated method stub
//		super.run();
//		while(true){
//			if(num > 0)
//			{
//				System.out.println( Thread.currentThread().getName() + "�۳��˵�" + num + "��Ʊ");
//				num--;
//			}
//			else
//			{
//				System.out.println("������");
//				break;
//			}
//		}
//	 } 
//	}
//class SaleTicket3 extends Thread{
//	//  int num = 50;
//	  public SaleTicket3(String name){
//			super(name);
//		}
//	@Override
//	public void run() {
//		// TODO Auto-generated method stub
//		super.run();
//		while(true){
//			if(num > 0)
//			{
//				System.out.println( Thread.currentThread().getName() + "�۳��˵�" + num + "��Ʊ");
//				num--;
//			}
//			else
//			{
//				System.out.println(Thread.currentThread().getName() + "������!!!");
//				break;
//			}
//		}
//	 } 
//	}
public class demo3 extends Thread {
	
	public static void main(String[] args) {
		
		SaleTicket1 aa = new SaleTicket1("����3");
		SaleTicket1 bb = new SaleTicket1("����2");
		//SaleTicket1 cc = new SaleTicket1("����1");
		aa.start();
		bb.start();
		//cc.start();
		
	}
}



interface Inter{
	void show1();
}
class Outer{//ͨ�������ڲ��ಹ��Outer���еĴ��롣
	public static Inter method(){			//����Inter���͵ı�����
		return new Inter(){
			public void show(){}
			public void show1(){}
		};
	}
}
class InnerClassDemo7 {
	public static void main(String[] args) {
		Outer.method().show1();
	/*
		Outer.method():��˼�ǣ�Outer����һ������Ϊmethod�ķ�����������������Ǿ�̬�ġ�
		Outer.method().show():��Outer����þ�̬��method�������������Ľ���ֵ�����show��������ζ�ţ�method()����������һ���Ƕ��󣬶������������Inter���͵ġ�
	
		function (new Inter(){
			public void show1(){}
		}); //�����ڲ�����Ϊ�����Ĳ������д��ݡ�
	}
	public static void function(Inter in){
		in.show1();
	}
}


//����
class demo3{
	public static void main(String[] args){
		new Thread(new Runnable(){  //����
			public void run(){
				System.out.println("runnable run");	
			}
		})
		{
			public void run(){
				System.out.println("subthread run");
			}
		}.start();  //�����subthread run
	}
}


//����ģʽ
class demo4{
	private static  demo4 single11 = new demo4();
	private demo4(){
			System.out.println("����ģʽ");
	}
	public static demo4 getFrame(){
		return single11;
	}
}

class demo3 {
	public static void main(String[] args){
		//demo3 de3 = new demo3();
		demo4 de4 = demo4.getFrame();
	}
}


//����ģʽ
class demo4{
	private static demo4 single2;
	private  demo4(){
		System.out.println("����ģʽ");
	}
	public static demo4 getFrame(){
		if(null == single2)
		{
			single2 = new demo4();
			return single2;
		}
		else
		{
			return single2;
		}
	}
}

class demo3{
	public static void main(String[] args){
		demo4 de4 = demo4.getFrame();
	}
}

class bank extends Thread{
	static int count = 5000;
	public bank(String name){
		super(name);
	}
	@Override
	public  void run() {
		// TODO Auto-generated method stub

		getMoney();
		}
	//}
	public static  void getMoney(){
		while(true)
		{
			synchronized("123"){
			if(count > 0)
			{
				System.out.println( Thread.currentThread().getName() + "ȡ��10�飬��ʣ��" + (count - 10) + "Ԫ");
			   count = count - 10;
			}
			
			else{
				System.out.println("ȡ����");
				break;
			}
		  }
		}
	}
}
class demo3{
	public static void main(String[] args){
		bank b1 = new bank("��ͷ");
		bank b2 = new bank("������");
		b1.start();
		b2.start();
		
	}
}

class DeadLock extends Thread{
	
	public DeadLock(String name){
		super(name);
	}
	
	
	public void run() {
		if("����".equals(Thread.currentThread().getName())){
			synchronized ("ң����") {
				System.out.println("�����õ���ң������׼�� ȥ�õ��!!");
				synchronized ("���") {
					System.out.println("�����õ���ң���������ˣ����ſյ�ˬ����Ĵ���...");
				}
			}
		}else if("����".equals(Thread.currentThread().getName())){
			synchronized ("���") { 
				System.out.println("�����õ��˵�أ�׼��ȥ��ң����!!");
				synchronized ("ң����") {
					System.out.println("�����õ���ң���������ˣ����ſյ�ˬ����Ĵ���...");
				}
			}
			
		}	
	}
	
	
}

public class demo3 {

	public static void main(String[] args) {
		DeadLock thread1 = new DeadLock("����");
		DeadLock thread2 = new DeadLock("����");
		//�����߳�
		thread1.start();
		thread2.start();
		
		
	}
	
}


public class demo3 implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 0; i < 1000; i++){
		System.out.println(Thread.currentThread().getName() + i);
		}
	}
	 public static void main(String[] args){
		 demo3 de3 = new demo3();
		 Thread thd = new Thread(de3,"����");
		 thd.start();
		 for(int i = 0; i < 1000; i++){
				System.out.println(Thread.currentThread().getName() + i);
				}
	 }
}


public class demo3 implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 0; i < 1000; i++){
			System.out.println(Thread.currentThread().getName() + "��" + i);
		}
		System.out.println(this);
		System.out.println(Thread.currentThread());
		
	}
	public static void main(String[] args){
		demo3 de3 = new demo3();
		Thread thd = new Thread(de3,"��ͷ����");
		thd.start();
		for(int i = 0; i < 1000; i++){
			System.out.println(Thread.currentThread().getName() + "��" + i);
		}
	}
	
}


 class tickets implements Runnable{
    int num = 50;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true){
			synchronized("��"){
			if(num > 0){
				System.out.println(Thread.currentThread().getName() + "�۳��˵�" + num + "��Ʊ");
				num--;
			}
			else{
				System.out.println("������");
				break;
			}
		}
		}
	}
	
}
 
class demo3{
	public static void main(String[] args){
		tickets ti1 = new tickets();
		//tickets ti2 = new tickets();
		Thread thd1 = new Thread(ti1,"��ͷ��");
		Thread thd2 = new Thread(ti1,"������");
		thd1.start();
		thd2.start();
	}
}

class Product{
	
	String name;  //����
	
	double price;  //�۸�
	
	boolean flag = false; //��Ʒ�Ƿ�������ϵı�ʶ��Ĭ�������û��������ɡ�
	
}	
class Producer extends Thread{
	
	Product  p ;  	//��Ʒ
	
	public Producer(Product p) {
		this.p  = p ;
	}
	
	
	
	@Override
	public void run() {
		int i = 0 ; 
		while(true){
		 synchronized (p) {
			if(p.flag==false){
				 if(i%2==0){
					 p.name = "ƻ��";
					 p.price = 6.5;
				 }else{
					 p.name="�㽶";
					 p.price = 2.0;
				 }
				 System.out.println("�������������ˣ�"+ p.name+" �۸��ǣ�"+ p.price);
				 p.flag = true;
				 i++;
				 p.notifyAll(); //����������ȥ����
			}else{
				//�Ѿ����� ��ϣ��ȴ���������ȥ����
				try {
					p.wait();   //�����ߵȴ�
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			 
		}	
	  }	
	}
}

class Customer extends Thread{
	
	Product p; 
	
	public  Customer(Product p) {
		this.p = p;
	}
	
	
	@Override
	public void run() {
		while(true){
			synchronized (p) {	
				if(p.flag==true){  //��Ʒ�Ѿ��������
					System.out.println("������������"+p.name+" �۸�"+ p.price);
					p.flag = false; 
					p.notifyAll(); // ����������ȥ����
				}else{
					//��Ʒ��û������,Ӧ�� �ȴ���������������
					try {
						p.wait(); //������Ҳ�ȴ���...
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}	
	}
}

public class demo3 {
	
	public static void main(String[] args) {
		Product p = new Product();  //��Ʒ
		//������������
		Producer producer = new Producer(p);
		//����������
		Customer customer = new Customer(p);
		//����start���������߳�
		producer.start();
		customer.start();
		
		
	}
	
}

class Product{
	
	String name;  //����
	
	double price;  //�۸�
	
	boolean flag = false; //��Ʒ�Ƿ�������ϵı�ʶ��Ĭ�������û��������ɡ�
	
}	
class Producer extends Thread{
	
	Product  p ;  	//��Ʒ
	
	public Producer(Product p) {
		this.p  = p ;
	}
	
	
	
	@Override
	public void run() {
		int i = 0 ; 
		while(true){
		 synchronized (p) {
			if(p.flag==false){
				 if(i%2==0){
					 p.name = "ƻ��";
					 p.price = 6.5;
				 }else{
					 p.name="�㽶";
					 p.price = 2.0;
				 }
				 System.out.println("�������������ˣ�"+ p.name+" �۸��ǣ�"+ p.price);
				 p.flag = true;
				 i++;
				 p.notifyAll();
			  }
			else{
				
					try {
						p.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

			}
		}	
	  }	
	}
}
class Customer extends Thread{
	
	Product p; 
	
	public  Customer(Product p) {
		this.p = p;
	}
	
	
	@Override
	public void run() {
		while(true){
			synchronized (p) {	
				if(p.flag==true){  //��Ʒ�Ѿ��������
					System.out.println("������������"+p.name+" �۸�"+ p.price);
					p.flag = false; 	
					p.notify();
				}
				else{
					try {
						p.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}

				}
			}
		}	
	
}

public class demo3 {
	
	public static void main(String[] args) {
		Product p = new Product();  //��Ʒ
		//������������
		Producer producer = new Producer(p);
		//����������
		Customer customer = new Customer(p);
		//����start���������߳�
		producer.start();
		customer.start();
		
		
	}
	
}

class chizi{
	int num = 500;
}

class inWater extends Thread {
	chizi p;
	public inWater(chizi p) {
		this.p = p;
	}
	
@Override
	public void run() {
		// TODO Auto-generated method stub
		
		while(true){
			synchronized(p) {
			if(p.num < 50){
				p.num = p.num + 5;
			}
			else if(p.num == 50 ){
				System.out.println("����ˮ����");
				p.notify();
				try {
					
					p.wait();
					System.out.println("����עˮ�ȴ�״̬");
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		}
	}



	
}
class outWater extends Thread{
	chizi p;
	public outWater(chizi p){
		this.p = p;
	}
	
@Override
	public void run() {
		// TODO Auto-generated method stub
		
		while(true){
			synchronized(p) {
			if(p.num > 0){
				p.num = p.num - 5;
			}
			else{
				System.out.println("����ûˮ��");
				p.notify();
				try {
					p.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		}
	}
}

public class demo3{
	public static void main(String[] args) {
		chizi p = new chizi();
		inWater in1 = new inWater(p);
		outWater out1 = new outWater(p);
		in1.start();
		out1.start();
	}
}

/*
public class demo3 extends Thread {
	
	boolean flag = true;
	
	public demo3(String name){
		super(name);
	}
	
	
	@Override
	public synchronized void run() {
		int i = 0 ;
		while(flag){
						try {
							this.wait();
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							System.out.println("�ѹ���");
						}
					System.out.println(Thread.currentThread().getName()+":"+i);
				   i++;
			//this.stop();

			}
		}
	
	
	
	
	public static void main(String[] args) {
		demo3 d = new demo3("����");
		d.setPriority(9);
		d.start();
		
		for(int i = 0 ; i<1000 ; i++){
			System.out.println(Thread.currentThread().getName()+":"+i);
			//�����̵߳�i��80��ʱ��ֹͣ�����̡߳�
			//d.interrupt();  // interrupt()���������޷�ֹͣһ���̡߳�
			if(i==800){
				d.flag = false;
				d.interrupt(); //���̵߳ĵȴ�״̬ǿ������������״̬���̻߳���յ�һ��InterruptedException�� 
//				synchronized (d) {					
//					d.notify();
//				}
				//Thread.currentThread().stop();
				System.out.println("800000000000000000000000000");
			}
			if(i==900)
			{
				 
			}
			
		}
		
		
	}

}

class demo3 extends Thread{
	public demo3(String name){
		super(name);
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 1; i <= 100; i++){
			System.out.println("���°�Ŀǰ����" + i + "%");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(i == 100){
				System.out.println("���°�������ɣ�׼����װ������");
			}
		}
	}
	public static void main(String[] args){
		demo3 de3 = new demo3("QQ");
		//de3.start();  heystart���ܷ����ػ��߳�����ǰ�棬��Ȼ�����
		de3.setDaemon(true);
		de3.start();
		System.out.println(de3.isDaemon());
	
	
	for(int i = 1; i <= 100; i++){
		System.out.println(Thread.currentThread().getName() + ":" + i);
	}
}
}





//����
class  Mon extends Thread{
	
	public void run() {
		System.out.println("����ϴ��");
		System.out.println("�����в�");
		System.out.println("����׼�����ˣ�����û�н�����..");
		//�ж���ȥ����
     Son son = new Son();
     son.start();
     try {
		son.join();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		System.out.println("�����������");
		System.out.println("ȫ��һ��Է�..");		
	}
} 

class Son extends Thread{
	
	@Override
	public void run() {
		System.out.println("������¥..");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("����һֱ��ǰ��");
		System.out.println("���Ӵ��꽴����");
		System.out.println("��¥���ѽ��͸�����");
	}
}

public class demo3 extends Thread{
	
	public static void main(String[] args) {
		Mon m = new Mon();
		m.start();
		
		
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
	}
}


public class demo3 {

	public static void main(String[] args) {
		Object[] arr = new Object[10];
		arr[1] = "abc";
		arr[2] = 'a';
		arr[3]  = 12;
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
	}
	
}



public class demo3{
	public static void main(String[] args){
		Collection c = new ArrayList();
		c.add("����");
		c.add("����1");
		c.add("����2");
		c.add("����3");
		System.out.println(c);
		Collection c2 = new ArrayList();
		c2.add("����1");
		c2.add("����123");
		c2.add("����2234");
		c2.add("����3456");
		c.addAll(c2);
		//c.clear();
		//c.remove("����");
		c.removeAll(c2);
		//System.out.println(c.contains(c2));
		System.out.println(c.size());
		Object[] arr = c.toArray();
		System.out.println(Arrays.toString(arr));
	}
}


public class demo3{
	public static void main(String[] args){
		Collection c = new ArrayList();
		c.add("����");
		c.add("����1");
		c.add("����2");
		c.add("����3");
		Iterator it = c.iterator();
		//System.out.println(it.hasNext());
	//	System.out.println(it.next());
		//System.out.println(it.next());
//		while(it.hasNext()){
//			System.out.println(it.next());
//		}
		it.next();
		it.remove();
		System.out.println(c);
	}
}



class Users{
	int userName;
	String passWord;
	
	public Users(){

	}
	


	public Users(int userName, String passWord){
		this.userName = userName;
		this.passWord = passWord;
	}
	public void setpassword(String passWord){
		
		this.passWord = passWord;
	}



	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Users user = (Users)obj;
		return this.userName == user.userName;
		
	}



	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "{" + "�û���" + this.userName + "�����ǣ�"+ this.passWord + "}";
	}
	
}
public class demo3{
	
	static  Scanner scanner = new Scanner(System.in);
	 static Collection users = new ArrayList();
	
	
	public static void main(String[] args ){

		
		while(true){
		System.out.println("��ѡ����  A(ע��)  B(��¼)");
		String option = scanner.next();
		if("a".equalsIgnoreCase(option)){
			loginin();
		}
		else if("b".equalsIgnoreCase(option)){
			loginup();
			
		}
		else{

		 }
		}
	}

	public static void loginup() {
		System.out.println("�������˺�");
		int userName = scanner.nextInt();
		System.out.println("����������");
		String passWord = scanner.next();
		Iterator it = users.iterator();
		boolean isLogin = false;
		while(it.hasNext()){
			Users user = (Users)it.next();
			if((userName == user.userName) && (user.passWord.equals(passWord))){
				
				isLogin = true;
			}
				
		}
		if(isLogin){
			System.out.println("��¼�ɹ�");
		}else{
			System.out.println("�û��������������");
		}
	}

	public static void loginin() {
		Users user = null;
		while(true){
			System.out.println("�������˺�:");
			int userName = scanner.nextInt();
			//Iterator it = users.iterator();

			user = new Users(userName, null);
			if(users.contains(user)){
				System.out.println("���˺��Ѿ�ע�ᣬ����������");
			}
			else{
				break;
			}
		
   }
		System.out.println("����������");
		String passWord = scanner.next();
		user.setpassword(passWord);
		users.add(user);
		System.out.println("ע��ɹ�");
		System.out.println("��ǰע��ע��" + users);
	}
}



public class demo3{
	public  static void main(String[] args){
		
		List list = new ArrayList();
		list.add("մ�ϸ�");
		list.add("մ�ϸ�1");
		list.add("մ�ϸ�2");
		list.add("մ�ϸ�3");
		list.add("մ�ϸ�4");
		list.add(1,"մ�ϸ�5");
		ListIterator listit =  list.listIterator();
		System.out.println("��ǰע��ע��" + listit.hasPrevious());
		System.out.println("��ǰע��ע��" + listit.next());
		System.out.println("��ǰע��ע��" + listit.hasPrevious());
		System.out.println("��ǰע��ע��" + listit.previous());
		int aa = 0;
		while(listit.hasNext()){
			System.out.println("��ǰע��ע��" + aa + "�� " + listit.next());
			System.out.println("��ǰע��ע��" +  aa + "�� "+ listit.previous());
			aa++;
		}
		
	}
}

public class demo3{
	public  static void main(String[] args){
		
		List list = new ArrayList();
		list.add("մ�ϸ�");
		list.add("մ�ϸ�1");
		list.add("մ�ϸ�2");
		list.add("մ�ϸ�3");
		list.add("մ�ϸ�4");
		list.add(1,"մ�ϸ�5");
		
	for(int i = 0; i < list.size(); i++){
			System.out.println("��ǰע��ע��" +  i + "�� "+ list.get(i));
		}
		ListIterator listis = list.listIterator();
		while(listis.hasNext()){
			System.out.println( listis.next());
		}
		
		ListIterator listis2 = list.listIterator();
		while(listis2.hasNext()){
			listis2.next();
		}
		while(listis2.hasPrevious()){
			System.out.println( listis2.previous());
		}
		ListIterator listis = list.listIterator();
		while(listis.hasNext()){
			System.out.println( listis.next());
			listis.add("����");
		}
	}
	
}


class book{
	int id;
	String name;
	
	public book(int id, String name){
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "{" +"��ţ�"+ this.id +"\t������" + this.name + "}";
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		book bk = (book)obj;
		return this.id == bk.id;
	}
	
	
}

class demo3{
	public static void main(String[] args){
		ArrayList list = new ArrayList();
		list.add(new book(110,"Java���˼��"));
		list.add(new book(120,"Java���˼��22"));
		list.add(new book(130,"Java���˼��4444"));
		list.add(new book(110,"Java���˼��"));
		
		ArrayList list2 = clear(list);
		System.out.println( "��Ԫ�صļ���" + list2);
	}
	
	public static ArrayList clear(ArrayList list){
		ArrayList newlist = new ArrayList();
		Iterator it = list.iterator();
		while(it.hasNext()){
			book bk = (book)it.next();
			if(!newlist.contains(bk)){
				newlist.add(bk);
			}
		}
		return newlist;
	}
}

class StackList{
	LinkedList list;
	
	public StackList(){
		list = new LinkedList();
	}
	
	public void add(Object obj){
		list.push(obj);
	}
	
	public Object pop(){
		return list.pop();
	}
	public int size(){
		return list.size();
	}
}

class Team{
	LinkedList list ;
	
	public Team(){
		list = new LinkedList();
	}
	
	public void add(Object obj){
		list.offer(obj);
	}
	
	public Object  delete(){
		return list.poll();
	}
	
	public int size(){
		return list.size();
	}
}

public class demo3 {
	
/*	public static void main(String[] args) {
		Team list=  new Team();
		list.add("��γ�");
		list.add("����");
		list.add("������");
		
		int size = list.size();
		for(int i = 0 ; i<size ; i++){
			System.out.println(list.delete());
		}
		
		
	}
	
	public static void main(String[] args) {
		StackList list=  new StackList();
		list.add("��γ�");
		list.add("����");
		list.add("������");
		
		int size = list.size();
		for(int i = 0 ; i<size ; i++){
			System.out.println(list.pop());
		}
		
		
	}
}





class Poker{
	
	String  color; //��ɫ
	
	String num;	//����

	public Poker(String color, String num) {
		super();
		this.color = color;
		this.num = num;
	}

	
	@Override
	public String toString() {
		return "{"+color+num+"}";
	}
}

public class demo3 {
	
	public static void main(String[] args) {
		LinkedList pokers = createPoker();
		shufflePoker(pokers);
		showPoker(pokers);
	}
	
	
	//ϴ�ƵĹ���
	public static void shufflePoker(LinkedList pokers){
		//�������������
		Random random = new Random();
		for(int i = 0 ; i <100; i++){ 
			//���������������ֵ
			int index1 = random.nextInt(pokers.size());
			int index2 = random.nextInt(pokers.size());
			//��������ֵȡ�������ƣ�Ȼ�󽻻������Ƶ�˳��
			Poker poker1 = (Poker) pokers.get(index1);
			Poker poker2 = (Poker) pokers.get(index2);
			pokers.set(index1, poker2);
			pokers.set(index2, poker1);
		}
		
	}
	
	
	
	//��ʾ�˿���
	public static void showPoker(LinkedList pokers){
		for(int i = 0 ; i<pokers.size() ; i++){
			System.out.print(pokers.get(i));
			//����
			if(i%10==9){
				System.out.println();
			}
		}
	
	}
	
	
	
	
	//�����˿��Ƶķ���
	public static LinkedList createPoker(){
		//�ü������ڴ洢�˿˶���
		LinkedList list = new LinkedList();		
		//��������洢���еĻ�ɫ�����
		String[] colors = {"����","����","÷��","����"};
		String[] nums = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
		for(int i = 0 ; i < nums.length ; i++){
			for(int j = 0 ; j<colors.length ; j++){
				list.add(new Poker(colors[j], nums[i]));
			}
		}
		return list;
	}
	
	
}

class poker {
	String color;
	String num;
	
	public poker(String color, String num){
		this.color = color;
		this.num = num;
	}
	
	@Override
	public String toString() {
		return "{"+color+num+"}";
	}
}

public class demo3{
	public static void main(String args[]){
		LinkedList poker = creatpoker();
		shufferpoker(poker);
		shufferpoker(poker);
		showpoker(poker);
	}
	
	public static LinkedList creatpoker()
	{
		LinkedList list = new LinkedList();
		String[] colors = {"����","����","÷��","����"};
		String[] nums = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
		for(int i = 0; i < colors.length; i++){
			for(int j = 0; j< nums.length; j++){
				list.add(new poker(colors[i], nums[j]));
			}
		}
		return list;
	}
	public static LinkedList shufferpoker(LinkedList pokers){
		Random random = new Random();
		for(int i = 0; i < 100; i++){
			int index1 = random.nextInt(pokers.size());
			int index2 = random.nextInt(pokers.size());
			poker p1 = (poker)pokers.get(index1);
			poker p2 = (poker)pokers.get(index2);
			pokers.set(index1, p2);
			pokers.set(index2, p1);
		}
		return pokers;
	}
	
	public static void showpoker(LinkedList pokers){
		for(int i = 0 ; i<pokers.size() ; i++){
			System.out.print(pokers.get(i));
			//����
			if(i%10==9){
				System.out.println();
			}
		}

	}
}



class Person{
	
	String name;
	
	int age;

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	
	@Override 
	public String toString() {
		return "{ ���֣�"+ this.name+" ���䣺"+ this.age+"}";
	}
	
}


public class demo3 {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.add(new Person("����", 7));
		list.add(new Person("��ʣ", 17));
		list.add(new Person("����", 3));
		list.add(new Person("����", 30));
		
		for(int i = 0; i < list.size() - 1; i++){
			Person p1 = (Person)list.get(i);
			for(int j = i + 1; j < list.size(); j++){
				
				Person p2 = (Person)list.get(j);
				if(p1.age > p2.age){
					list.set(i, p2);
					list.set(j, p1);
				}
			}
		}
		System.out.println(list);
	}
	
}



public class demo3 {
	
	public static void main(String[] args) {
		HashSet  set = new HashSet();
		set.add("����");
		set.add("����");
		set.add("����");
		//System.out.println("��ӳɹ���"+set.add("����"));
		System.out.println(set);
		
		
		
	}

}

class Person{
	
	int id;
	
	String name;

	public Person(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "{ ���:"+ this.id+" ������"+ this.name+"}";
	}
	
	@Override
	public int hashCode() {
		System.out.println("=======hashCode=====");
		return this.id;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("======equals======");
		Person p = (Person)obj;
		return this.name==p.name;
	}
	
}


public class demo3 {
	
	public static void main(String[] args) {
	/*
		HashSet set = new HashSet();
		set.add("����");
		set.add("��ʣ");
		set.add("����");
		System.out.println("���ϵ�Ԫ�أ�"+ set);
	
		
		HashSet set = new HashSet();
		set.add(new Person(110,"����"));
		set.add(new Person(220,"��ʣ"));
		set.add(new Person(110,"����"));
		//����ʵ������ֻҪ���һ�¾�Ϊͬһ����.
		//System.out.println("��ӳɹ���"+set.add(new Person(110,"����")));
		System.out.println("���ϵ�Ԫ�أ�"+set);
		
	}
	
}

class User{
	String userName;
	String passWord;
	
	public User(String userName, String passWord){
		this.userName = userName;
		this.passWord = passWord;
	}
	
/*	public int hashCode(){
		return userName;
	}
	
	@Override
	public String toString() {
		return "{ ���:"+ this.userName+" ������"+ this.passWord+"}";
	}
	
	public int hashCode(){
	    return 	userName.hashCode() + passWord.hashCode();
	}
	public boolean equals(Object obj){
			User user = (User)obj;
			System.out.println("this�ǣ�" + this);
		return this.userName.equals(user.userName)&&this.passWord.equals(user.passWord);
	}
}
class demo3{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		HashSet set = new HashSet();
		while(true){


				System.out.println("�������û�����");
				String userName = scanner.next();
				System.out.println("���������룺");
				String passWord = scanner.next();
				
				User user = new User(userName, passWord);
				if(set.add(user)){
					System.out.println("ע��ɹ�");
					System.out.println("��ǰ�û��������ǣ�" + set);
				}
				else{
					System.out.println("ע��ʧ��");
				}
				
			}
	}
}


public class demo3{
	public static void main(String[] args){
		TreeSet tree = new TreeSet();
		tree.add(10);
		tree.add(110);
		tree.add(1110);
		tree.add(101);
		tree.add(1011);
		tree.add(11101);
		System.out.println("ע��ʧ��" + tree);
	}
}


class Emp implements Comparable{
	int id;
	String name;
	int salary;
	
	public Emp(int id, String name, int salary){
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	public String toString(){
		return "{" + this.id + "����" + this.name + "нˮ" + this.salary + "}";
		
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		Emp e = (Emp)o;
		return this.salary - e.salary;
	}
	
}

class demo3{
	public static void main(String[] args){
		TreeSet tree = new TreeSet();
		
		tree.add(new Emp(110, "��½", 100));
		tree.add(new Emp(113, "����", 200));
		tree.add(new Emp(220, "����", 300));
		tree.add(new Emp(120, "�ϲ�", 500));
		System.out.println("���ϵ�Ԫ�أ�"+tree);
	}
}


class Emp {
	int id;
	String name;
	int salary;
	
	public Emp(int id, String name, int salary){
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	public String toString(){
		return "{" + this.id + "����" + this.name + "нˮ" + this.salary + "}";
		
	}

/*	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		Emp e = (Emp)o;
		return this.salary - e.salary;
	}
	
}

class demo3{
	public static void main(String[] args){
		comp comp1 = new comp();
		TreeSet tree = new TreeSet(comp1);
		
		tree.add(new Emp(110, "��½", 100));
		tree.add(new Emp(113, "����", 200));
		tree.add(new Emp(220, "����", 300));
		tree.add(new Emp(120, "�ϲ�", 500));
		System.out.println("���ϵ�Ԫ�أ�"+tree);
	}
}

class comp implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		Emp e1 = (Emp)o1;
		Emp e2 = (Emp)o2;
		
		return e1.id - e2.id;
	}
	
}



public class demo3 {
	
	public static void main(String[] args) {
		TreeSet tree = new TreeSet();
		tree.add("abccccccccccccccccccc");
		tree.add("abc");
		System.out.println(tree);
		
		
		
	}

}

public class demo3 {

	public static void main(String[] args) {
		ArrayList<String>  list = new ArrayList<String>();  //<String> ��ʾ������ֻ�ܴ洢�ַ������� �����ݡ�
		
		list.add("aa");
		list.add("bb");
		list.add("cc");
		
		for(int i = 0 ; i < list.size() ; i++){
			String str =  list.get(i);
			System.out.println("��д��"+ str.toUpperCase());
		}
		
		
/*		MyUtil.print(list);
		
		
		ArrayList<String> list2 = MyUtil.getList();
		
		
		
		
		
	}
	
}


class demo3{
	public static void main(String[] args){
	String str = getData("abc", 123);
	Integer i = getData(123, "abc");
	}
	
	public static <T, E>T getData(T o, E e){
		return o;
	}
}



class MyArrays{
	

	//Ԫ�ط�ת
	public <T>void reverse(T[] arr){
		for(int startIndex = 0, endIndex = arr.length-1 ; startIndex<endIndex ; startIndex++,endIndex--){
			T temp  = arr[startIndex];
			arr[startIndex] = arr[endIndex];
			arr[endIndex] = temp;
		}
		
	}
	
	//
	public <T>String toString(T[] arr){
		StringBuilder sb = new StringBuilder();
		for(int i = 0 ; i < arr.length ; i++){
			if(i==0){
				sb.append("["+arr[i]+",");
			}else if(i==arr.length-1){
				sb.append(arr[i]+"]");
			}else{
				sb.append(arr[i]+",");
			}
		}
		return sb.toString();
	}
	
	
	public static <T>void print(T[] t){
		
	
		
	}
	
	
}



public class demo3 {
	
	public static void main(String[] args) {
		Integer[] arr = {10,12,14,19};
		
		MyArrays tool = new MyArrays();
		tool.reverse(arr);
		System.out.println("�����Ԫ�أ�"+tool.toString(arr));
		
		MyArrays tool2 = new MyArrays();
		String[] arr2 = {"aaa","bbb","ccc"};
		tool2.reverse(arr2);
				
		
		ArrayList<String> list = new ArrayList<String>();
		
	}
	
}


interface Dao<T>{
	public void add(T t);
}

public class demo3<T> implements Dao<T>{
	
	
	demo3<String> de = new demo3<String>();
	public void add(T t){
		
	}
}

class demo3{
	public static void main(String[] args){
		ArrayList<Integer> list = new ArrayList<Integer>();
		ArrayList<Number> list2 = new ArrayList<Number>();
		HashSet<String > set = new HashSet<String>();
//		print("abc");
		print(set);
	}
	public static  void print(Collection<? extends Integer > c){
		
	}
}



class demo3{
	public static void main(String[] args) {
		
	
	Map<String , String> mp = new HashMap<String, String>();
	mp.put("����","������");
	mp.put("����","�����P");
	System.out.println("�����Ԫ�أ�"+mp);
	System.out.println("�����Ԫ�أ�"+mp.put("����2","�����P"));
	mp.put("����1","���P"); 
	System.out.println("�����Ԫ�أ�"+mp);
	mp.remove("����");
	//mp.clear();
	System.out.println("�����Ԫ�أ�"+mp);
	System.out.println("�����Ԫ�أ�"+mp.containsKey("����1"));
	
//	System.out.println("�����Ԫ�أ�"+mp.keySet());
	Set<String> keys = mp.keySet();
	Iterator<String> it  = keys.iterator();
	while(it.hasNext()){
		String key =it.next();
		System.out.println("����"+ key + "ֵ" + mp.get(key));
	}
	Set<Map.Entry<String,String>>  entrys = mp.entrySet() ;
	Iterator<Map.Entry<String,String>> it1 = entrys.iterator();
	while(it1.hasNext()){
		Map.Entry<String,String> entry = it1.next();
		System.out.println("����"+ entry.getKey() + "ֵ" + entry.getValue());
	}
	}
}

 class Person{
	int id;
	String name;
	
	public Person(int id, String name){
		this.id = id;
		this.name = name;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return this.id;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Person m = (Person)obj;
		return this.name == m.name;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "[" + this.id + "������" + this.name + "]";
	}
	
}

public class demo3{
	public static void main(String[] args){
		HashMap<Person, String> map = new HashMap<Person, String>();
		map.put(new Person(110, "����"), "110");
		map.put(new Person(120, "����"), "120");
		map.put(new Person(130, "����"), "130");
		map.put(new Person(140, "����"), "140");
		map.put(new Person(150, "����"), "150");
		map.put(new Person(160, "����"), "160");
		System.out.println("����"+ map +"ֵ" );
	}
}



//public class demo3{
//	public static void main(String[] args){
//		TreeMap<String, Integer> tree = new TreeMap<String, Integer>();
//		tree.put("��", 10);
//		tree.put("��5", 3);
//		tree.put("��4", 2);
//		tree.put("��3", 20);
//		tree.put("��2", 19);
//		tree.put("��1", 50);
//		System.out.println("����"+ tree +"ֵ" );
//		
//	}
//}

class Emp {//implements Comparable<Emp>{
	
	String name;
	
	int salary;

	public Emp(String name, int salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	
	
	@Override
	public String toString() {
		return "[������"+this.name+" нˮ��"+ this.salary+"]";
	}


/*	@Override
	public int compareTo(Emp o) {
		return this.salary - o.salary;
	}
	
}



//�Զ���һ���Ƚ���
class MyComparator implements Comparator<Emp>{

	@Override
	public int compare(Emp o1, Emp o2) {
		return o1.salary - o2.salary;
	}
	
}



public class demo3{
	
	public static void main(String[] args) {
		TreeMap<Character, Integer> tree = new TreeMap<Character, Integer>();
		tree.put('c',10);
		tree.put('b',2);
		tree.put('a',5);
		tree.put('h',12);
		System.out.println(tree);
		
		//����һ���Զ���Ƚ���
		MyComparator comparator = new MyComparator();
		
		TreeMap<Emp, String> tree = new TreeMap<Emp, String>(comparator);
		tree.put(new Emp("����", 2000),"001");
		tree.put(new Emp("�ұ�", 1000),"002");
		tree.put(new Emp("ϰ��", 3000),"003");
		tree.put(new Emp("��ǿ", 5000),"005");
		
		tree.put(new Emp("�ƺ�", 5000),"008");
		System.out.println(tree);
		
		
		
		
	}

}

class book implements Comparable<book>{
	String name;
	String date;
	public book(String name, String date){
		this.name = name;
		this.date = date;
	}
	@Override
	public int compareTo(book o) {
		// TODO Auto-generated method stub
		SimpleDateFormat dataFormat = new SimpleDateFormat("yyyy-MM-dd");
		Date date2= null;
		Date date1 = null;
		try {
			 date1 = dataFormat.parse(this.date);
			 date2 = dataFormat.parse(o.date);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return (date1.compareTo(date2) );
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "[����" + this.name + "��������" + this.date + "]";
	}
	
	
}

public class demo3{
	public static void main(String[] args){
		TreeMap<book, String> map = new TreeMap<book, String>();
		map.put(new book("��¥��", "1990-12-03"), "001");
		map.put(new book("��¥��2", "1992-12-03"), "002");
		map.put(new book("��¥��3", "1993-12-03"), "003");
		map.put(new book("��¥��4", "1994-12-03"), "004");
		map.put(new book("��¥��5", "1995-12-03"), "005");
		System.out.println(map);
	}
}

public class demo3{
	public static void main(String[] args) {
		String qq = "564367553";
//		System.out.println(qq.matches("[1-5]\\d{4,10}")?"�Ϸ�":"�Ƿ�");
		System.out.println("12".matches("(.)+"));
//		System.out.println(".".matches("[a-cA-D_1-3]"));
//		System.out.println("11111111".matches("\\d{1,10}"));
////		System.out.println("$".matches("[]{3,}"));
//		String qq1 = "25139892692";
//		System.out.println(qq1.matches("1[34578]\\d{9}")?"�Ϸ�":"�Ƿ�"); 
//		String qq11 = "039802692";
//		System.out.println(qq11.matches("0[1-9]{3}0\\d{4}")?"�Ϸ�":"�Ƿ�");
//		String qq111 = "��     ��   ��    ��";
//		String[] datas = qq111.split(" ");
//		System.out.println(Arrays.toString(datas)); 
		String qq1111 = "����������������������ŷŷŷŷŷŷż�";
		String[] datas1 = qq1111.split("(.)\\1");
		System.out.println(Arrays.toString(datas1)); 
//		String qq2 = "luckyhey@163.com";
		
		String qq16 = "�����֙C̖15139892692�����֙C̖15139892692�����֙C̖15139892692�����֙C̖15139892692�����֙C̖15139892692�����֙C̖15139892692�����֙C̖15139892692�����֙C̖15139892692";
		String reg = "1[34578]\\d{9}";
		qq16 =qq16.replaceAll(reg, "5555");
		System.out.println(qq16); 
		
		String wer = "����������ҪҪҪҪ�úúÌW�W�W������";
		//String tyu = "(.)+";
		wer =wer.replaceAll("(.)\\1+", "^");
		System.out.println(wer); 
		String wer1 = "����������ҪҪҪҪ�úúÌW�W�W������";
		wer1 =wer1.replaceAll("(.){2}", "^");
		System.out.println(wer1); 
	}
}

public class demo3{
	public static void main(String[] args) {
		String content ="�����]��964367553@qq.com�����]��964367553@qq.com�����]��964367553@qq.com�����]��964367553@qq.com�����]��964367553@qq.com�����]��964367553@qq.com�����]��964367553@163.com�����]��964367553@163.com�����]��964367553@163.com�����]��964367553@163.com�����]��964367553@163.com.cn�����]��964367553@163.com.cn�����]��964367553@163.com.cn�����]��964367553@163.com.cn�����]��964367553@163.com.cn�����]��964367553@163.com.cn�����]��964367553@163.com.cn�����]��964367553@163.com.cn";
	String reg = "[a-zA-Z1-9]\\w{5,17}@[a-zA-Z0-9]{2,}(\\.(com|cn|net)){1,2}";
	Pattern p = Pattern.compile(reg);
	Matcher m =  p.matcher( content);
	while(m.find()){
		System.out.println(m.group()); 
	}
	}
}

import static java.util.Collections.sort;
import static java.lang.System.out;
class demo3{
	public static void main(String[] args) {
			ArrayList<Integer> list = new ArrayList<Integer>();
			list.add(13);
			list.add(10);
			list.add(16);
			list.add(14);
			list.add(3);
			list.add(23);
			//Collections.sort(list);	
			sort(list);
			System.out.println(list); 
			out.println(list); 
	}

   public static  void sort(ArrayList<Integer>list) {
	// TODO Auto-generated method stub
	   System.out.println("����"); 
    }
}

import static java.lang.System.out;
public class demo3{
	public static void main(String[] args) {
//		HashSet<String> set = new HashSet<String>();
//		set.add("����1");
//		set.add("����2");
//		set.add("����3");
//		set.add("����4");
//		set.add("����5");
//
//		for(String temp: set){
//			out.println(temp);
//		}
//		
//		int[] arr = {0,1,2,3,4,5,6,7,8,9};
//		for(int temp1:arr){
//			out.println(temp1);
//			arr[1]= 100;
//		}
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("001","����1");
		map.put("00","����0");
		map.put("002","����2");
		map.put("003","����3");
		Set<Map.Entry<String,String>> entrys = map.entrySet();
		for(Map.Entry<String,String> temp:entrys){
			out.println("��"+ temp.getKey() + "ֵ" + temp.getValue());
		}
	}
}

import static java.lang.System.out;
class demo3{
	public static void main(String[] args) {
		int[] arr = {1,2,3,4};
		add(2,1,2,3,4,5,6,5);
	}
	private static void  add(int a, int... arr) {
		// TODO Auto-generated method stub
		int result = 0;
		for(int temp: arr){
			result = result + temp;
		}
		result +=a;
		out.println("he=" + result);
	}
}

import static java.lang.System.out;
class demo3{
	public static void main(String[] args) {
		String str ="12";
		int i = Integer.parseInt(str);
		out.println("he=" +( i + 1));
	}
}

//class Gender{
//	
//	String value;
//	
//	public static final Gender man = new Gender("��");
//	
//	public static final Gender woman = new Gender("Ů");
//	
//
//	private Gender(String value) {
//		this.value = value;
//	}
//}
enum Gender{
	Woman("Ů"),Man("��");
	String value;
	private Gender(String value){
		this.value = value;
	}
}

class Person{
	
	private String name;
	
	private	Gender sex;


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Gender getSex() {
		return sex;
	}

	public void setSex(Gender sex) {
		this.sex = sex;
	}		
}

public class demo3{
	
	public static void main(String[] args) {
		Person p = new Person();
		p.setName("����");
		p.setSex(Gender.Man);
		System.out.println("���֣�"+ p.getName()+" �Ա�"+ p.getSex().value);
		
	}
	
}

public class demo3{
	public static  void main(String[] args) throws IOException {
		
//   File file = new File("f:\\222");
//   File Pfile =new File("F:\\222\\");
//   File Cfile =new File(Pfile,"a.txt");
//   System.out.print(file.exists());
//   System.out.print(File.separator);
//   File file11 = new File(".");
//   System.out.println(file11.getAbsolutePath());
//   File file111 = new File("f:\\222\\b.txt");
//   System.out.println(file111.createNewFile());
//   File dir = new File("f:\\222\\333");
//   System.out.println(dir.mkdir());
//   File dirs = new  File("f:\\222\\444\\555");
//   System.out.println(dirs.mkdirs());
//   File dest = new File("f:/222/333/bb.txt");
//   System.out.println( file111.renameTo(dest));
//   System.out.println( dest.delete());
//   dest.deleteOnExit();
//    File file = new File("..\\222\\a.txt");
////    System.out.println( file.exists());
////    System.out.println( file.isFile());
////    System.out.println( file.getName());
////    System.out.println( file.getPath());
//    //System.out.println( file.getAbsolutePath());
//    System.out.println(file.createNewFile());
//   System.out.println(file.length());
//   long time = file.lastModified();
//   Date date = new Date(time);
//   SimpleDateFormat datefor = new SimpleDateFormat("yyyy��mm��dd�� HH:mm:ss");
//   System.out.println(datefor.format(date));
//   File[] roots = File.listRoots();
//   for(File file : roots){
//	   System.out.println(file);
//   }
//		File file = new File(".");
//		String[] ss = file.list();
//	   for(String s : ss){
//		   System.out.println(s);
//	   }
//	   File file1 = new File(".");
//	   File[] fff = file1.listFiles();
//	   for(File s : fff){
//		   System.out.println(s);
//	   }
		File dir = new File("E:\\MyEclipseWorkspace\\helloworld\\src\\cn\\it\\cast\\object");
		listJava2(dir);
		listFile(dir);
	}
	public static void listJava2(File dir){
		File[] files = dir.listFiles(new myfilter());
		for(File file: files){
			System.out.println(file.getName());
		}
	}
	
	public static void listFile(File dir){
		File[] files = dir.listFiles();
		for(File file: files){
			String fileName = file.getName();
			if(fileName.matches(".+\\.java")&&file.isFile()){
				System.out.println(fileName);
			}
		}
		for(File fileItem : files){
			if(fileItem.isDirectory()){
				System.out.println("\t"+fileItem.getName());
			}
		}
	}
}

class myfilter implements FilenameFilter{

	@Override
	public boolean accept(File dir, String name) {
		// TODO Auto-generated method stub
		return name.endsWith(".java");
	}
	
}

class demo3{
	public static void main(String[] args) throws IOException {
		//read();
		//read2();
		read3();
	}
	public static void read3() throws IOException{
		File file = new File("f:\\222\\bb.txt");
		FileInputStream input =new  FileInputStream(file);
		int  length = 0;
		byte[] buf = new byte[128];
		int i = 0;
		while((length = input.read(buf))!= -1){
			System.out.print(new String(buf,0,length));
			System.out.print(i++);
		}
		input.close();
	}
	public static void read2() throws IOException{
		File file = new File("f:\\222\\bb.txt");
		FileInputStream input =new  FileInputStream(file);
		int  contend = 0;
		byte[] buf = new byte[1024];
		
			int length = input.read(buf);
//			for(byte bb: buf)
			System.out.println(new String(buf,0,length));
			System.out.println(length);
		    input.close();
	}
	public static void read() throws IOException{
		File file = new File("f:\\222\\bb.txt");
		FileInputStream input = new FileInputStream(file);
//		for()
		int content = input.read();
		System.out.println("\t"+(char)content);
		input.close();
	}
}

class demo3{
	public static void main(String[] args) throws Exception {
//		File file = new File("f:\\222\\2.jpg");
//		File fileout = new File("f:\\222\\3.jpg");
//		FileReader filereadr = new FileReader(file);
//		FileWriter filewriter = new FileWriter(fileout);
//		
//		char[] buf = new char[1024];
//		int length = 0;
//		while((length = filereadr.read(buf)) != -1){
//			filewriter.write(buf, 0, length);
//		}
//		filewriter.close();
//		filereadr.close();
//		File file = new File("f:\\222\\xinjiang.jpg");
//		File fileout = new File("f:\\222\\3.jpg");
//		FileInputStream filereadr = new FileInputStream(file);
//		FileOutputStream filewriter = new FileOutputStream(fileout);
//		
//		byte[] buf = new byte[1024];
//		int length = 0;
//		while((length = filereadr.read(buf)) != -1){
//			filewriter.write(buf, 0, length);
//		}
//		filewriter.close();
//		filereadr.close();
		File file = new File("f:\\222\\bb.txt");
		File fileout = new File("f:\\222\\33.txt");
		FileReader filereadr = new FileReader(file);
		FileWriter filewriter = new FileWriter(fileout);
		
		BufferedReader bufferre = new BufferedReader(filereadr);
		BufferedWriter bufferwr = new BufferedWriter(filewriter);
		
		//byte[] buf = new byte[1024];
		int length = 0;
		while((length = bufferre.read()) != -1){
			//
			bufferwr.write(length);
			//bufferwr.newLine();
			//bufferwr.write("\r\n");
			//System.out.println(Arrays.toString(length));
		}
		bufferre.close();
		bufferwr.close();
		
	}
}


class demo3{
	public static void main(String[] args) throws Exception {
		File file1 = new File("f:\\222\\33.txt");
		File file2 = new File("f:\\222\\bb.txt");
		File file3 = new File("f:\\222\\hh.txt");
		FileInputStream filein1 = new FileInputStream(file1);
		FileInputStream filein2 = new FileInputStream(file2);
		FileOutputStream fileout = new FileOutputStream(file3);
		SequenceInputStream input = new SequenceInputStream(filein1, filein2);
		byte[] buf = new byte[1024];
		int length = 0;
		
		while((length = input.read(buf)) != -1){
			fileout.write(buf, 0, length);
		}
		input.close();
		fileout.close();
	}
}

class demo3{
	public static void main(String[] args) throws Exception {
		creat();
		
	}
	public static void creat() throws Exception{
		Properties pro = new Properties();
		pro.setProperty("����", "0000");
		pro.setProperty("����2", "00004");
		pro.setProperty("����3", "00005");
		pro.setProperty("����5", "00006");
		pro.store(new FileWriter("F:\\222\\pro.properties"), "�Ǻ�");
		
	}
}

class demo3{
	public static void main(String[] args) throws Exception {
		File file = new File("f:\\222\\count.properties");
		if(!file.exists()){
			file.createNewFile();
		}
		FileOutputStream out = new FileOutputStream(file);
		Properties pro = new Properties();
		pro.load(new FileInputStream(file));
		int count = 0;
		String value = pro.getProperty("count");
		if(value != null){
			count = Integer.parseInt(value);
		}
		if(count >= 3){
			System.out.print("���ý���" );
			System.exit(0);
		}
		count++;
		System.out.print("ʹ�ô���Ϊ" + count);
		pro.setProperty("count", count + "");
		pro.store(new FileWriter("F:\\222\\count.properties"), "runtime");
		
		
	}
}


class animal{
	String name;
	String color;
	public animal(String name, String color) {
		super();
		this.name = name;
		this.color = color;
	}
	@Override
	public String toString() {
		return "���֣�"+this.name+ " ��ɫ��"+ this.color;
	}
	
}
class demo3{
	public static void main(String[] args) throws Exception {
		File file = new File("f:\\222\\0323.txt");
		FileOutputStream out = new FileOutputStream(file);
//		out.write("97".getBytes());
//		out.close();
		
		PrintStream prin = new PrintStream(file);
		prin.print(97);
		prin.println(true);
		prin.println('a');
		prin.println(file);
		animal a= new animal("����","��ɫ");
		prin.println(a);	
		System.setOut(prin);
		System.out.print("�²������Ķ�");
		File logFile = new File("f:\\222\\2015��03��24��.log");
		FileOutputStream out1 = new FileOutputStream(logFile, true);
		PrintStream s = new PrintStream(out1);
		try{
			int c = 4/0;
			System.out.print("�²������Ķ�" + c);
		}catch(Exception e){
			e.printStackTrace(s);
		}
		
	}
}




class demo3{
	public static void main(String[] args) throws Exception {
		String str = "ab�й�";
		byte[] buf = str.getBytes("utf-8");
		System.out.print(Arrays.toString(buf));
		str = new String(buf, "utf-8");
		System.out.print(str);
		
		String str1 = "��Һ�";
		byte[] b = str1.getBytes();
		str1 = new String(b, "iso8859-1");
		System.out.print(str1);
		
		byte[] c = str1.getBytes("iso8859-1");
		String str11 = new String(c);
		System.out.print(str11);
	}
}

class demo3{
	public static void main(String[] args) throws Exception {
		//read();
		write();
	}
	public static void read() throws Exception{
		InputStream in = System.in;
		//System.out.println("11"+ in.read());
		BufferedReader buf = new BufferedReader(new InputStreamReader(in));
		String line = null;
		while((line = buf.readLine()) != null){
			System.out.print(line);
		}
	}
	public static void write() throws Exception{
		File file = new File("f:\\222\\ccc.txt");
		FileOutputStream fo = new FileOutputStream(file);
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fo, "utf-8"));
		bw.write("����һ��ƽ��");
		bw.close();
	}
}

class demo3{
	public static void main(String[] args) {
		System.out.println(test(5));
		System.out.print(print(15));
	}
	public static int test(int num ){
		int result =1;
		while(num > 0){
		result = result * num;
		num--;
		}
		return result;
	}
	
	public static long print(long num){
		if(num == 1){
			return 1;
		}else{
			return num*print(num-1);
		}
	}
}

class demo3{
	public static void main(String[] args) {
		File dir = new File("f:\\");
		listFile(dir, "|--");
	}
	public static void listFile(File file, String str){
		File[] files = file.listFiles();
		for(File file1: files){
			if(file1.isFile()){	
				System.out.println( str+"�ļ�����"+ file1.getName());	
			}else if(file1.isDirectory()){
				System.out.println(str+ "�ļ��У�" +  file1.getName());
				listFile(file1, str + "|------" );
			}

		}
	}
}



class demo3{
	public static void main(String[] args) throws Exception {
		//System.out.println( InetAddress.getLocalHost().getHostAddress());
		//System.out.println( InetAddress.getLocalHost().getHostName());
		//System.out.println( InetAddress.getByName(host));
		//InetAddress a = new InetAddress();
		//System.out.println( InetAddress.getByName("192.168.36.1").getHostName());
		//System.out.println( InetAddress.getByName("DESKTOP-90D683L").getHostAddress());
		InetAddress[] arr = InetAddress.getAllByName("www.baidu.com");
		for(InetAddress a:arr ){
			
			System.out.println( a.getHostAddress());
		}
	}
}

class demo3{
	public static void main(String[] args) throws Exception {
		DatagramSocket datagram = new DatagramSocket();
		String data = "���ǵ�һ�η�UDP����";
		DatagramPacket dgp = new DatagramPacket(data.getBytes(), data.getBytes().length, InetAddress.getLocalHost(), 9099);
		datagram.send(dgp);
		datagram.close();
	}
}

class demo3 extends Thread{
//	public static void main(String[] args) {
//		
//	}
	public void run(){
	
			try {
				DatagramSocket socket = new DatagramSocket();
				BufferedReader keyReader = new BufferedReader(new InputStreamReader(System.in));
				String line = null;
				DatagramPacket packet = null;
				while((line = keyReader.readLine()) != null){
					packet = new DatagramPacket(line.getBytes(), line.getBytes().length, InetAddress.getByName("192.168.179.11"),9099);
					socket.send(packet); 
				}
				socket.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		
	}


}

class demo3{
	public static void main(String[] args) throws IOException, IOException {
		Socket socket = new Socket(InetAddress.getLocalHost(),9099);
		OutputStream outputstream = socket.getOutputStream();
		outputstream.write("��������".getBytes());
		//outputstream.close();
		InputStream input = socket.getInputStream();
		byte[] buf = new byte[1024];
		int length = input.read(buf);
		System.out.println("�ͻ��˽��յ������ݣ�"+ new String(buf,0,length));
		socket.close();
		
	}
}

class demo3{
	public static void main(String[] args) throws Exception{
		Socket socket = new Socket(InetAddress.getLocalHost(),9099);
		OutputStreamWriter socketout = new OutputStreamWriter(socket.getOutputStream());
		BufferedReader socketreader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		BufferedReader keyreader = new BufferedReader(new InputStreamReader(System.in));
		String line = null;
		while((line = keyreader.readLine()) != null){
			socketout.write(line+"\r\n");
			socketout.flush();
			System.out.println("�ͻ��˽��յ������ݣ�");
			
			line = socketreader.readLine();
			System.out.println("�յ��ظ�" + line);
		}
		socket.close();
	}
}

*/
//ģ��Tomcat������
public class demo3 extends Thread {
	
//Socket socket;
//	
//	public demo3(Socket socket){
//		this.socket = socket;
//	}
//	
	
//	public void run() {
//		try {
//			//��ȡsocket�����������
//			OutputStream outputStream = socket.getOutputStream();
//			//������д���������
//			outputStream.write("<html><head><title>aaa</title></head><body>��ð������</body></html>".getBytes());
//			socket.close();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//	}
	

//	public static void main(String[] args) throws IOException {
//		//����tcp�ķ����
//		ServerSocket serverSocket = new ServerSocket(9090);
//		//���ϵĽ��ܿͻ��˵�����
//		while(true){
//			Socket socket = serverSocket.accept();
//			new demo3(socket).start();
//		}
//	}
	public static void main(String[] args) throws Exception {
		ServerSocket serverSocket = new ServerSocket(80);
		Socket socket = serverSocket.accept();
		//��ȡsocket�����������
		OutputStream outputStream = socket.getOutputStream();
		//������д���������
		outputStream.write("<html><head><title>aaa</title></head><body>��ð������</body></html>".getBytes());
		socket.close();
	}
}