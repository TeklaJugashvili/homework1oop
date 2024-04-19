package homeworks.hw1.scooter;

  import java.util.ArrayList;
  import java.util.List;

// represents a scooter rental company that manages scooters

 public class RentalCompany {

     private int uid = 0;

     List<Scooter> scooters = new ArrayList<>();

// returns a list of available scooters in the company's fleet

     public List<Scooter> availableScooters() {
         List<Scooter> result = new ArrayList<>();
         for (Scooter scooter: scooters) {
             if (scooter.isAvailable()) {
                 result.add(scooter);
             }
         }
         return result;
     }

// adds a new scooter to the company's fleet

     public void addScooter(Scooter scooter) {
         scooter.setId(uid++);
         scooters.add(scooter);
     }

// remover a scoooter from the company's fleet based on its ID    

     public boolean removeScooter(int id) {
         boolean removed = false;
         for (Scooter scooter: scooters) {
             if (scooter.getId() == id) {
                 scooters.remove(scooter);
                 removed = true;
                 break;
             }
         }
         return removed;
     }

// rents a scooter from company's fleetnbased on its ID


     public void rentScooter(int id) {
        for (Scooter scooter : scooters) {
            if (scooter.getId() == id && scooter.isAvailable()) {
                scooter.rent();
                break;
            }
        }

     }

/* returns a rented scooter to the company's fleet and updates its location.
 * x the new X-coordinate of the scooter's location
 * y the new Y-coordinate of the scooter's location
 */ 
   
 

     public void returnScooter(int id, double x, double y) {
        for (Scooter scooter : scooters) {
            if (scooter.getId() == id && !scooter.isAvailable()) {
                scooter.returnScooter(x, y);
                break;
            }
        }

// displays information about all scooters in the company's fleet.
 

     }

     public void displayAllScooters() {
        for (Scooter scooter : scooters) {
            System.out.println(scooter.toString());
        }

     }
 } 
 