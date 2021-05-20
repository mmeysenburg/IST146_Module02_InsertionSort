/**
 * Main class for IST 146 PA 1 - Daily Temperatures.
 *
 * @author Mark M. Meysenburg
 * @version 1.0
 */
class Main {
  /**
   * Application entry point.
   *
   * @param args Command-line arguments; ignored by 
   * this application. 
   */
  public static void main(String[] args) {
    // test data
    int[] temps = {32, 31, -1, 100, 50, 60, 70};
    String[] dayNames = {"Sunday", "Monday", "Tuesday", 
      "Wednesday", "Thursday", "Friday", "Saturday"};

    // build the object and call its methods
    DailyTemps dt = new DailyTemps(temps);
    System.out.println("Initial temps: " + dt);
    System.out.println("Mean temperature: " + 
      dt.getMeanTemperature());
    System.out.println("Number of days below freezing: " +
      dt.numberOfDaysBelowFreezing());
    for(int i = 0; i < temps.length; i++) {
      dt.setTemp(i, 70 + i);
      System.out.printf("New temp for %s:\t%d\n",
        dayNames[i], dt.getTemp(i));
    }
  }
}