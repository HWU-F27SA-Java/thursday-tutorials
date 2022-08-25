
public class Student {
	
	//instance variables
	private String id;
	private String name;
	private int age;
	
	//constructor
	public Student(String id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public Student() {
		id = "default";
		name = "default";
		age = 20;
	}
	
	
	//methods - getter and setters
	public String getName(){
		return name;
	}
	
	public String getId() {
		return id;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setId(String id){
		this.id = id;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	

	
	
}
