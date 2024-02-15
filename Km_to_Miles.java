class Km_to_Miles extends ConsoleProgram {

  /**
  * A program that takes an input in kilometers and converts it to miles
  * @author: Austin Lian
  */
  
  public void run() {
    // Initialize variables
    double dblKilometers;
    double dblMiles;

    // Get inputs (Kilometers)
    dblKilometers = readDouble("Enter the distance in kilometers: ");

    // Calculate Miles
    dblMiles = dblKilometers * 0.621371;

    // Output miles
    System.out.println(dblKilometers + " kilometers is " + dblMiles + " miles");
    
  }
}
