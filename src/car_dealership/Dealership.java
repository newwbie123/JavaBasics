package car_dealership;

public class Dealership {

	public static void main(String[] args) {


		Customer cust1 = new Customer();
		cust1.setName("Tom");
		cust1.setAdress("123 Anything Street");
		cust1.setCashOnHand(1000);
		
		
		Vehicle car = new Vehicle("Honda", "Accord", 15000);

		Employee emp = new Employee();
		
		cust1.purchaseCar(car, emp, true);
		
		
		

	}

}
