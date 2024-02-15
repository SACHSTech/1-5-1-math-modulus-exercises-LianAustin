class Power extends ConsoleProgram {

  /**
  * A program which takes an input of two numbers a and b and outputs a^b
  * @author: Austin Lian
  */
  
  public void run() {
    
    // Initialize variables;
    int intA;
    int intB;
    int intPower;

    // Get inputs (a and b)
    intA = readInt("Enter the base of the power: ");
    intB = readInt("Enter the exponent of the power: ");

    // Calculate a^b
    intPower = (int) Math.pow(intA, intB);

    // Output results
    System.out.println(intA + " to the power of " + intB + " is " + intPower);
    
  }
}