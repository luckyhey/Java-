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
	Person p = new Person(110,"狗娃");
	System.out.println(p); 
	Person p1 = new Person(110,"狗娃112");
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
	
	//目前我需要直接输出一个对象的时候，输出 的格式是： 编号：110 姓名： 狗娃  这种格式。 目前Object的
//	toString方法无法满足子类的需求，那么这时候我们就应该对Object类的toString进行重写。
//	@Override
//	public String toString() {
//		return "编号："+ this.id + " 姓名："+this.name;
//	}
	
	
	public String toString(){
		return "编号："+this.id + "姓名：" +this.name;
	}
	
	//为什么要重写：Object的equals方法默认比较的是两个对象的内存地址，我目前需要比较的是两个对象的身份证，所以Object类的equals方法不符合我现在的需求。
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
		tset("中国");
	}
	
	
	public static void tset(Object str){
		if(str == null)
		{
			System.out.println("请重新输入");
			return;
		}
	if("中国".equals(str))
	{
		System.out.println("回答正确");
	}
	else
	{
		System.out.println("回答错误");
		
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