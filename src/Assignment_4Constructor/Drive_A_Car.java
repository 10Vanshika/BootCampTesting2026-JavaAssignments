package Assignment_4Constructor;

public class Drive_A_Car {

	public static void main(String[] args) {
		 
		        String driver = "Vanshika";
		
		        boolean engineStart = true;
		 
		        boolean seatBelt = true;
		 
		       
		        boolean clutchPressed = true;
		        int gear = 1;
		 
		        int speed = 0;
		        speed = speed + 20;  // accelerating
		 
		        boolean brakePressed = false;
		        boolean carStopped = false;
		 
		        System.out.println("Driver Name: " + driver);
		 
		        System.out.println("Engine Started: " + engineStart);
		        System.out.println("Seat Belt Fastened: " + seatBelt);
		 
		        System.out.println("Clutch Pressed: " + clutchPressed);
		        System.out.println("Gear Selected: " + gear);
		 
		        System.out.println("Speed of Car: " + speed + " km/h");
		 
		        brakePressed = true;
		        speed = 0;
		        carStopped = true;
		 
		        System.out.println("Brake Pressed: " + brakePressed);
		        System.out.println("Car Stopped: " + carStopped);
		    }
		

}
