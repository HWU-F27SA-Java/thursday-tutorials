
public class Car extends Vehicle{
	
	public Car() {
		super();
	}
	
	public Car(String type) {
		super(type);
	}
	

	
	public static void main(String[] args) {
		Car car1 = new Car("Bus");
		//car1.setType("Bus");  
		System.out.println(car1.type);

	}

}
