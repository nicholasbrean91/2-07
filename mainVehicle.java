import java.util.Scanner;
public class mainVehicle {
	public static void main(String args[]){
		Scanner userInput = new Scanner(System.in);
		String lPlateNum;
		String colour;
		String wheels;
		String Speed;
		String maxSpeed;
		double accelerate;
		double brake;
		
		System.out.println("Enter the Licence Plate Number you would like: ");
		lPlateNum = userInput.nextLine();
		System.out.println("Enter the Colour of car you would like: ");
		colour = userInput.nextLine();
		System.out.println("Enter the number of Wheels you would like your car to have: ");
		wheels = userInput.nextLine();
		
		Vehicle obj = new Vehicle(lPlateNum, colour, wheels);
		String lPlatePrint = obj.lPlateNum();
		String colourPrint = obj.colour();
		String numOfWheels = obj.wheels();
		
		Bike bikeObj = new Bike();
		Truck truckObj = new Truck();
		
	
		System.out.println("The licience plate num is " + lPlatePrint + " and the colour of the car is " + colourPrint + " and the num of wheels is " +  numOfWheels );
	}

}
