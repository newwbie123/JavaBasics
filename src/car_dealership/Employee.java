package car_dealership;

public class Employee {

	public void handleCustomer(Customer cust, boolean finance, Vehicle vehicle) {
		
		if (finance == true) {
			double loanAmount = vehicle.getPrice() - cust.getCashOnHand();
			runCreditHistory(cust, loanAmount);
			
		} else if (vehicle.getPrice() <= cust.getCashOnHand()) {
			processTransaction(cust, vehicle);
			
		} else {
			System.out.println("Customer will need more money to purchase the vehicle" + vehicle);
		}

	}

	public void runCreditHistory(Customer cust, double loanAmount) {
		
		System.out.println("Ran credit history...");
		System.out.println("Customer has been approved to purchase the vehicle with loan amoount of " + loanAmount);
	}

	public void processTransaction(Customer cust, Vehicle vehicle) {
		
		System.out.println("Customer has purchased the vehicle " + vehicle + " for the price " + vehicle.getPrice());
	}

}
