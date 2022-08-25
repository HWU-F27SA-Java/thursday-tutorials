
public class Main {

	public static void main(String[] args) {
		Student student1 = new Student();
		String name = student1.getName();
		System.out.println(name);
		student1.setName("James");
		//name = student1.getName();
		System.out.println(student1.getName());
		System.out.println(student1.getId());
		System.out.println(student1.getAge());
		
	}

}
