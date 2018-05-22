package org.goucao;

public class Person {
	private String name;
	private int age;
	
	/** 每个类默认有一个无参构造方法(隐式的) */
	
	/**
	 * 无参构造方法
	 * @return 
	 */
	private Person(){
		System.out.println("显式无参构造方法");
	}
	
	public static Person getInstance() {
		return new Person();
	}
	
	/**
	 * 有参构造方法(构造方法重载1)
	 * 
	 * @param name 参数
	 */
	public Person(String name){
		this.name = name;
	}
	
	/**
	 * 有参构造方法(构造方法重载2)
	 * 
	 * @param name 参数
	 */
	public Person(String name,int age){
		this.name = name;
		this.age = age;
	}
	
	public static void main(String[] args) {
		// 创建类的对象
		// 类类型 对象名 = new 构造方法();
		Person person = new Person();
		System.out.println("name: " + person.getName());
		System.out.println("age: " + person.getAge());
		System.out.println();
		
		Person jack = new Person("jack");
		System.out.println("jack.name: " + jack.getName());
		System.out.println("jack.age: " + jack.getAge());
		System.out.println();
		
		Person amy = new Person("amy",19);
		System.out.println("amy.name: " + amy.getName());
		System.out.println("amy.age: " + amy.getAge());
		System.out.println();
		amy.setName("AMY");
		System.out.println("amy.name: " + amy.getName());
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
}
