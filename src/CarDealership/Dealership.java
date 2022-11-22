package CarDealership;

public class Dealership {

	public static void main(String[] args) {
		Customer cust1 = new Customer();
		
		cust1.setName("sumit");
		cust1.setAddress("2131/5 prem nagar");
		cust1.setCashOnhand(12000);
		
		Vehicle vehicle = new Vehicle("Toyota", "Fortuner", 150000);
		
			
		Employee emp = new Employee();
		
		
		cust1.PurchaseCar(vehicle, emp, false);
		
		
		Vehicle Car = new Vehicle("Toyota", "Fortuner", 150000);
		
		boolean value = Car.equals(vehicle);
		System.out.println(value);

	}

}
