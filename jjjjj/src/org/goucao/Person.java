package org.goucao;

public class Person {
	private String name;
	private int age;
	
	/** ÿ����Ĭ����һ���޲ι��췽��(��ʽ��) */
	
	/**
	 * �޲ι��췽��
	 * @return 
	 */
	private Person(){
		System.out.println("��ʽ�޲ι��췽��");
	}
	
	public static Person getInstance() {
		return new Person();
	}
	
	/**
	 * �вι��췽��(���췽������1)
	 * 
	 * @param name ����
	 */
	public Person(String name){
		this.name = name;
	}
	
	/**
	 * �вι��췽��(���췽������2)
	 * 
	 * @param name ����
	 */
	public Person(String name,int age){
		this.name = name;
		this.age = age;
	}
	
	public static void main(String[] args) {
		// ������Ķ���
		// ������ ������ = new ���췽��();
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
