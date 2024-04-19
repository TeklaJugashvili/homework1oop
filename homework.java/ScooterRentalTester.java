import java.util.Timer;
import java.util.TimerTask;

public class ScooterRentalTester {

    public static void main(String[] args) {
        // Create a new scooter rental instance
        ScooterRental scooter = new ScooterRental();

        // Rent the scooter and go from home to the university
        System.out.println("Scooter rented. Going from home to the University...");
        scooter.goTo(41.7121106, 44.7489232); // University coordinates
        System.out.println("Reached the University(41.7121106, 44.7489232)");

        // Set a timer to automatically return the scooter after 1 hour
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                // Return the scooter to the university
                System.out.println("Returning scooter to the University...");
                scooter.returnScooter(41.7121106, 44.7489232); // University coordinates
                System.out.println("Scooter returned to the University(41.7121106, 44.7489232)");
            }
        }, 3600000); // 1 hour in milliseconds

        // Print the waiting message
        System.out.println("Waiting for 1 hour... Then renting scooter again");

        // Wait for 1 hour before returning the scooter near the home
        try {
            Thread.sleep(3600000); // You can change milliseconds to check it
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Go back home
        System.out.println("Going back home...");
        scooter.goTo(41.72157149255126, 44.76052337116375); // Home coordinates
        System.out.println("Reached back home(41.72157149255126, 44.76052337116375)");

        // Return the scooter near the home
        System.out.println("Returning scooter near home...");
        scooter.returnScooter(41.72126885583508, 44.76075391536995); // Near home coordinates
        System.out.println("Scooter returned near home(41.72126885583508, 44.76075391536995)");
    }
}

class ScooterRental {

    public ScooterRental() {
    }

    public void returnScooter(double x, double y) {
        // Simulating the scooter being returned
    }

    public void goTo(double x, double y) {
        // Simulating traveling to a location
    }
}
