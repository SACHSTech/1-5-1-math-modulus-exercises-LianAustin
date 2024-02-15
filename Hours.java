class Hours extends ConsoleProgram {

  /**
  * A program that takes an input in hours and converts it to days and hours
  * @author: Austin Lian
  */
  
  public void run() {
    
    // Initialize variables
    int intHours;
    int intDays;
    int intHoursRemainder;

    // Get inputs (Hours)
    intHours = readInt("Enter the number of hours you want to convert: ");

    // Calculate Days and Hours
    intDays = intHours / 24;
    intHoursRemainder = intHours % 24;

    // Output converted hours
    System.out.println(intHours + " hours is " + intDays + " days and " + intHoursRemainder + " hours");
  }
}