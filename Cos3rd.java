class Cos3rd extends ConsoleProgram {

  /**
  * A program that uses the cosine law to calculate the length of the third side of a triangle, given two sides and the contained angle
  * @author: Austin Lian
  */
  
  public void run() {

    // Initialize variables
    double dblSideA;
    double dblSideB;
    double dblAngle;
    double dblSideC;

    // Get inputs (Sides and Angle)
    dblSideA = readDouble("Enter the length of side A: ");
    dblSideB = readDouble("Enter the length of side B: ");
    dblAngle = readDouble("Enter the angle between the two sides: ");

    // Calculate Side C
    dblSideC = Math.sqrt(Math.pow(dblSideA, 2) + Math.pow(dblSideB, 2) - 2 * dblSideA * dblSideB * Math.cos(Math.toRadians(dblAngle)));

    // Output third side
    System.out.println("The length of the third side is " + dblSideC);
    
  }
}