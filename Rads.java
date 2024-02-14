class Rads extends ConsoleProgram {

  /**
  * A program that converts degrees to radians given an input in radians
  * @author: Austin Lian
  */
  
  public void run() {
    
    // declare variables
    double dblRadians;
    double dblDegrees;

    // get degrees
    dblDegrees = readDouble("Enter the degrees: ");

    // calculate radians
    dblRadians = Math.toRadians(dblDegrees);

    // output results
    System.out.println(dblDegrees + " degrees is " + dblRadians + " radians");
    
  }
}