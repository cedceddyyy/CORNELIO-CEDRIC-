import java.util.Scanner;

public class RouteToMoalboal{
   public static void main(String[] args) {
        
   Scanner sc = new Scanner(System.in);
   
   System.out.println("*****Cebu Terminal*****");
   System.out.println("Welcome to SouthBus Terminal to Moalboal!");
   System.out.println("\nDefault Route:");
   System.out.println("> Cebu City    (Start)");
   System.out.println("> Minglanilla  (Route 1)");
   System.out.println("> San Fernando (Route 2)");
   System.out.println("> CarCar       (Route 3)");
   System.out.println("> Barili       (Route 4.1)");
   System.out.println("> Dumanjug     (Route 4.1.1)");
   System.out.println("> Alcantara    (Route 4.1.2)");
   System.out.println("> Moalboal     (End)");

      
   System.out.println("\nIs Barili Obstructed? (1 = YES & 0 = NO)");
   int choice = sc.nextInt();
   int speed = 0;
   double distance = 0.0;
   double eta = 0.0;
   
   if (choice !=1) {
      System.out.println("May I know how fast are you going?");
      speed = sc.nextInt();
      distance = 84.9;   
      System.out.println("\nRecommended Route:");
      System.out.println("> Cebu City    (Start)");
      System.out.println("> Minglanilla  (Route 1)");
      System.out.println("> San Fernando (Route 2)");
      System.out.println("> CarCar       (Route 3)");
      System.out.println("> Barili       (Route 4.1)");
      System.out.println("> Dumanjug     (Route 4.1.1)");
      System.out.println("> Alcantara    (Route 4.1.2)");
      System.out.println("> Moalboal     (End)");
    
   } else {
      System.out.println("\nIs Dumanjug also Obstructed? (1 = YES & 0 = NO)");   
      int choiceTwo = sc.nextInt();
   
   if (choiceTwo == 0){
      System.out.println("May I know how fast are you going?");
      speed = sc.nextInt();
      distance = 93.9;   
      System.out.println("\nRecommended Route:");
      System.out.println("> Cebu City    (Start)");
      System.out.println("> Minglanilla  (Route 1)");
      System.out.println("> San Fernando (Route 2)");
      System.out.println("> CarCar       (Route 3)");
      System.out.println("> Sibonga      (Route 4.1)");
      System.out.println("> Dumanjug     (Route 4.2.1)");
      System.out.println("> Alcantara    (Route 4.2.2)");
      System.out.println("> Moalboal     (End)");
      
   } else if (choiceTwo == 1){
      System.out.println("Unfortunately, there appears to be no alternative route available except for the last option, which is the Argao (Route 5)");
      System.out.println("May I know how fast are you going?");
      speed = sc.nextInt();
      distance = 92.2;    
      System.out.println("\nRecommended Route:");
      System.out.println("> Cebu City    (Start)");
      System.out.println("> Minglanilla  (Route 1)");
      System.out.println("> San Fernando (Route 2)");
      System.out.println("> CarCar       (Route 3)");
      System.out.println("> Sibonga      (Route 4.1)");
      System.out.println("> Argao        (Route 5)");
      System.out.println("> Ronda        (Route 5.1)");
      System.out.println("> Alcantara    (Route 5.2)");
      System.out.println("> Moalboal     (End)");
      
   } else {
      System.out.println("Invalid Input!");
    }   
   }   
     additionalData(speed, distance, eta);
     sc.close();
     
 }

public static void additionalData(double speed, double distance, double eta){
   System.out.println("\nAdditional Data:");
   System.out.println("> Speed:" + speed +"km/hr");   
   System.out.println("> Distance: " + distance +"km");
   eta = distance / speed;
   
   int hrs = (int) eta;
   int mins = (int)((eta-hrs)*60);
   System.out.println("\nETA: " + hrs + " hrs and " + mins+" mins");
      


}
}


