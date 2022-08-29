
public class VariablesAndOperations {

	public static void main(String[] args) {
		
		//create a variable to hold the quantity of available plane seats left on a flight
		int availablePlaneSeats = 5;
		
		//create a variable to hold the cost of groceries at checkout
		double costOfGroceries = 53.75;
		
		//create a variable to hold a person's middle initial
		char middleInitial = 'K';
		
		//create a variable to hold true if it's hot outside and false if it's cold outside
		boolean isHotOutside = true;
		
		//create a variable to hold a customer's first name
		String customerFirstName = "Bruce";
		
		//create a variable to hold a street address
		String streetAddress = "1234 W Easy St";
		
		//print all variables to the console
		System.out.println("Available seats left on the plane: " + availablePlaneSeats);
		System.out.println(costOfGroceries + " is the price for groceries");
		System.out.println("Middle Initial: " + middleInitial);
		System.out.println("It is hot outside - " + isHotOutside);
		System.out.println("Customer First Name: " + customerFirstName);
		System.out.println("Street Address: " + streetAddress);
		
		//a customer booked 2 plane seats, remove 2 seats from the available seats variable
		availablePlaneSeats -= 2;
		System.out.println(availablePlaneSeats);
		
		//impulse candy bar purchase, add 2.15 to the grocery total
		costOfGroceries += 2.15;
		System.out.println(costOfGroceries);
		
		//birth certificate was printed incorrectly, change middle initial to something else
		middleInitial = 'L';
		System.out.println(middleInitial);
		
		//the season has changed, update the hot outside to be the opposite of what it was
		isHotOutside = !isHotOutside;
		System.out.println(isHotOutside);
		
		//create a new variable called full name using the customer's first name, the middle initial, and a last name of your choice
		String customerLastName = "Wayne";
		String customerFullName = customerFirstName + " " + middleInitial + " " + customerLastName;
		System.out.println(customerFullName);
		
		//print a line to the console that introduces the customer and says they live at the address variable
		System.out.println("Hi, my name is John Doe and I live at " + streetAddress + ".");

	}

}
