class FtoC extends ConsoleProgram {

  /**
  * A program that takes an input in Fahrenheit and converts it to Celsius
  * @author: Austin Lian
  */
  
  public void run() {
    
    // Initialize variables
    double dblFahrenheit;
    double dblCelsius;

    // Get inputs (Fahrenheit)
    dblFahrenheit = readDouble("Enter the temperature in Fahrenheit: ");

    // Calculate Celsius
    dblCelsius = (dblFahrenheit - 32) * 5 / 9;

    // Output results
    System.out.println(dblFahrenheit + " degrees Fahrenheit is " + dblCelsius + " degrees Celsius");
    
  }
}