package ch05.extended.school;

public class Person {
	private String name;
	private int height;
	private int weight;
	private int age;
	//Getter,Setter생성
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Person(String name, int height, int weight, int age) {
		super();
		this.name = name;
		this.height = height;
		this.weight = weight;
		this.age = age;
	}
	
	
}
