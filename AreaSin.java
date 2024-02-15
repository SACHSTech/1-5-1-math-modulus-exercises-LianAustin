class AreaSin extends ConsoleProgram {

  /**
  * A program that that uses the Math.sin() function to calculate the area of a triangle, given two sides and the contained angle
  * @author: Austin Lian
  */
  
  public void run() {
    // Initialize variables
    double dblSideA;
    double dblSideB;
    double dblAngle;
    double dblArea;

    // Get inputs (Sides and Angle)
    dblSideA = readDouble("Enter the length of side A: ");
    dblSideB = readDouble("Enter the length of side B: ");
    dblAngle = readDouble("Enter the angle between the two sides: ");

    // Calculate Area
    dblArea = (dblSideA * dblSideB * Math.sin(Math.toRadians(dblAngle))) / 2;

    // Output Area
    System.out.println("The area of the triangle is " + dblArea);
    
  }
}