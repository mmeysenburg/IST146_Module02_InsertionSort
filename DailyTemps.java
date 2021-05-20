/**
 * Class encapsulating seven daily temperatures, assumed to be 
 * integer degrees Fahrenheit. 
 *
 * @author TODO: your name here 
 * @version TODO: today's date here 
 */
public class DailyTemps {

  /** Array of ints holding this object's data. */
  private int[] temps;

  /**
   * Construct a new DailyTemps object, populated with the 7 
   * temperatures in the parameter array.
   *
   * @param temps Array of integer temperatures for this week.
   * The array is assumed to have seven elements. 
   */
  public DailyTemps(int[] temps) {
    // create this object's array of integers
    this.temps = new int[temps.length];
    // TODO: complete code for the constructor

  }

  /**
   * Get the temperature associated with a certain day.
   *
   * @param day Integer associated with the desired day: 0 for 
   * Sunday, 1 for Monday, ..., 6 for Saturday.
   * @return Temperature associated with the specified day.
   */
  public int getTemp(int day) {
    // TODO: write code for the accessor

    // TODO: This statement is a stub - remove / modify
    return Integer.MIN_VALUE;
  }

  /**
   * Set the temperature associated with a certain day.
   *
   * @param day Integer associated with the desired day: 0 for 
   * Sunday, 1 for Monday, ..., 6 for Saturday.
   * @param temp New temperature for the specified day. 
   */
  // TODO: write the setTemp() method


  /**
   * Get the number of days where the temperature was below 
   * freezing. 
   *
   * @return An int containing the number of days with temperatures
   * below freezing.
   */
  public int numberOfDaysBelowFreezing() {
    // TODO: write code for this method

    // TODO: this statement is a stub - remove / modify
    return Integer.MAX_VALUE;
  }

  /**
   * Get the mean temperature for the values stored in this object.
   *
   * @return The mean temperature, as a double. 
   */
  // TODO: write the getMeanTemperature() method here


  @Override
  public boolean equals(Object o) {
    // TODO: write code for the equals() method

    // TODO: this statement is a stub - remove / modify
    return false;
  }

  @Override
  public String toString() {
    // TODO: write code for the toString() method

    // TODO: this statement is a stub - remove / modify
    return "";
  }

}