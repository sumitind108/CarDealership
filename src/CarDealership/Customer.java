package CarDealership;

public class Customer {
	
	private String Name;
	private String Address;
	private double CashOnhand;
	


	public String getName() {
		return Name;
	}



	public void setName(String name) {
		this.Name = name;
	}



	public String getAddress() {
		return Address;
	}



	public void setAddress(String address) {
		Address += "Dealership city";
		this.Address = address;
	}



	public double getCashOnhand() {
		return CashOnhand;
	}



	public void setCashOnhand(double cashOnhand) {
		CashOnhand += 500;
		this.CashOnhand = cashOnhand;
	}



	public void PurchaseCar(Vehicle vehicle, Employee emp, boolean finance) {
		
		emp.HandleCustomer(this, finance, vehicle);
		
	}

}
