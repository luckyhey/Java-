package cn.it.cast.object;


/*
public class demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//    demo1 a = new demo1();
//    //toString(a);
//    System.out.println(a.toString());
//    System.out.println(a.hashCode());
//    System.out.println(a); 
	Person p = new Person(110,"����");
	System.out.println(p); 
	Person p1 = new Person(110,"����112");
	System.out.println(p1); 
	System.out.println(p1.equals(p)); 
	System.out.println(p1.hashCode()); 
	System.out.println(p.hashCode()); 
	}
	
}


class Person{
	
	int id;
	
	String name;

	public Person(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public Person() {
	}
	
	//Ŀǰ����Ҫֱ�����һ�������ʱ����� �ĸ�ʽ�ǣ� ��ţ�110 ������ ����  ���ָ�ʽ�� ĿǰObject��
//	toString�����޷����������������ô��ʱ�����Ǿ�Ӧ�ö�Object���toString������д��
//	@Override
//	public String toString() {
//		return "��ţ�"+ this.id + " ������"+this.name;
//	}
	
	
	public String toString(){
		return "��ţ�"+this.id + "������" +this.name;
	}
	
	//ΪʲôҪ��д��Object��equals����Ĭ�ϱȽϵ�������������ڴ��ַ����Ŀǰ��Ҫ�Ƚϵ���������������֤������Object���equals���������������ڵ�����
	@Override
	public boolean equals(Object obj) { 
		Person p  = (Person)obj;
		return this.id== p.id;
	}
	
	@Override
	public int hashCode() {
		return  this.id;
	}
	
		
}


public class demo1{
	public static void main(String[] args){
		String str1 = "hello";
		String str2 = "hello";
		String str3 = new String("hello");
		String str4 = new String("hello");
		System.out.println(str1 == str2);
		System.out.println(str3 == str2);
		System.out.println(str3 == str4);
		System.out.println(str3.equals(str4));
		tset("�й�");
	}
	
	
	public static void tset(Object str){
		if(str == null)
		{
			System.out.println("����������");
			return;
		}
	if("�й�".equals(str))
	{
		System.out.println("�ش���ȷ");
	}
	else
	{
		System.out.println("�ش����");
		
	}
	}
}

class demo1{
	public static void main(String[] args) {
		demo2 de2 = new demo2();
		de2.start();
		demo3 de1 = new demo3();
		de1.start();
	}
}
*/