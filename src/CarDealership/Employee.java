package CarDealership;

public class Employee {
	
	public void HandleCustomer(Customer cust, boolean finance, Vehicle vehicle) {
		
		if(finance == true) {
			double loanAmount = vehicle.getPrice() - cust.getCashOnhand();
			RunCreditHistory(cust, loanAmount);
		}else if(vehicle.getPrice() <= cust.getCashOnhand()) {
			//customer pay in cash
			ProcessTransaction(cust, vehicle);
		}else {
			System.out.println("Customer need more money to purchase the vehicle" + vehicle);
		}
		
	}
	public void RunCreditHistory(Customer cust, double loanAmount) {
		System.out.println("Ran credit history for customer");
		System.out.println("Customer has been aproved for the purchase vehicle");
	}
	
	public void ProcessTransaction(Customer cust, Vehicle vehicle) {
		System.out.println("Customer has purchase the vehicle"+ vehicle + "at the vehicle price:"+ vehicle.getPrice());
	}

}
