import java.util.Scanner;

public class MidtermActOne{
   public static void main(String[] args){
      Scanner scan = new Scanner(System.in);
      
      final double DISTANCE_ONE = 140.2;
      final double DISTANCE_TWO = 142.4;
      final double DISTANCE_THREE = 153.2;
                
      System.out.println("Route to MoalBoal\n");
       
      System.out.println("Default route:\n");
      System.out.println("Cebu City (Start)");
      System.out.println("Minglanilla (Route 1)");
      System.out.println("San Fernando (Route 2)");
      System.out.println("Carcar (Route 3)");
      System.out.println("Barili (Route 4.1)");
      System.out.println("Dumanjug (Route 4.1.1)");
      System.out.println("Alcantara (Route 4.1.2)");
      System.out.println("Moalboal (End)\n");
      
      System.out.print("Is Barili (Route 4.1) obstructed? (Yes = 1 or No = 0): ");
      int BariliObstructed = scan.nextInt();
                 
      if (BariliObstructed == 0){
         System.out.print("How fast are you going: ");
         int speedOne = scan.nextInt();
         System.out.println("Proceed to this Recommended Route:\n");
         System.out.println("Cebu City (Start)\n" + 
                            "Minglanilla(Route 1)\n" + 
                            "San Fernando(Route 2)\n" + 
                            "Carcar(Route 3)\n" + 
                            "Barili(4.1)\n" + 
                            "Dumanjug(4.1.1)\n" + 
                            "Alcantara(4.1.2)\n" + 
                            "You reached to Moalboal\n");
         double eta = DISTANCE_ONE / speedOne;
         System.out.println("Speed: " + speedOne + " km/hr");
         System.out.println("Distance: " + DISTANCE_ONE);
         // Calculate hours and minutes
         int etaHours = (int) eta;// Get the whole hours
         int etaMinutes = (int) ((eta - etaHours) * 60);// Calculate the remaining minutes

         // Display ETA in the desired format
         System.out.println("ETA: " + etaHours + " hrs and " + etaMinutes + " mins");

      }
        
      else{
         System.out.print("Is Dumanjug (Route4.2.1) obstructed? (Yes = 1 or No = 0): ");
         int SibongaObstructed = scan.nextInt();
         
         System.out.print("How fast are you going: ");
         int speedTwo = scan.nextInt();
            
         System.out.println("\n");
         if (SibongaObstructed == 0){
            System.out.println("Proceed to this Recommended Route:\n");
            System.out.println("Cebu City (Start)\n" +  
                              "Minglanilla(Route 1)\n" + 
                              "San Fernando(Route 2)\n" + 
                              "Carcar(Route 3)\n" + 
                              "Sibonga(Route 4.2)\n" + 
                              "Dumanjug (Route 4.2.1)\n" + 
                              "Alcantara(Route 4.2.2)\n" + 
                              "You reached to Moalboal\n");
            double eta = DISTANCE_TWO / speedTwo;
            System.out.println("Speed: " + speedTwo + " km/hr");
            System.out.println("Distance: " + DISTANCE_TWO);
            // Calculate hours and minutes
            int etaHours = (int) eta;// Get the whole hours
            int etaMinutes = (int) ((eta - etaHours) * 60);// Calculate the remaining minutes

            // Display ETA in the desired format
            System.out.println("ETA: " + etaHours + " hrs and " + etaMinutes + " mins");
         }
         else{
            System.out.println("Proceed to this Recommended Route:");
            System.out.println("Cebu City (Start)\n" +
                               "Minglanilla(Route1)\n" + 
                               "San Fernando(Route2)\n" + 
                               "Carcar(Route3)\n" + 
                               "Sibonga(Route4.2)\n" + 
                               "Argao (Route 5)\n" + 
                               "Ronda(Route 5.1)\n" +
                               "Alcantara(Route 5.2)\n" + 
                               "You reached to Moalboal\n");
            double eta = DISTANCE_THREE / speedTwo;
            System.out.println("Speed: " + speedTwo + " km/hr");
            System.out.println("Distance: " + DISTANCE_THREE);
            // Calculate hours and minutes
            int etaHours = (int) eta;
            int etaMinutes = (int) ((eta - etaHours) * 60);
            System.out.println("ETA: " + etaHours + " hrs and " + etaMinutes + " mins");
         }
       }                  
    }
}
