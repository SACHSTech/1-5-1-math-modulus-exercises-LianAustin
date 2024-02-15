class Minutes extends ConsoleProgram {

  /**
  * A program which takes an input in minutes and converts it to days, hours, and minutes
  * @author: Austin Lian
  */
  
  public void run() {
    
    // Initialize variables
    int intMinutes;
    int intDays;
    int intHours;
    int intMinutesRemainder;

    // Get inputs (Minutes)
    intMinutes = readInt("Enter the number of minutes you want to convert: ");

    // Calculate Days, Hours, and Minutes
    intDays = intMinutes / 1440;
    intHours = (intMinutes % 1440) / 60;
    intMinutesRemainder = intMinutes % 60;

    // Output results
    System.out.println(intMinutes + " minutes is " + intDays + " days, " + intHours + " hours, and " + intMinutesRemainder + " minutes");
    
  }
}