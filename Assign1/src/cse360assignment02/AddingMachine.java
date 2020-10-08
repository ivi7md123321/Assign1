/*Student Name: Mohammed Alramadan
 *Class Description: This class represents the an adding machin that would do calculations and store them.
 * 
 * 
 */

package cse360assignment02;

public class AddingMachine {
	
//attributes
  private int total;
  private String history;

//constructor
  public AddingMachine () {
    total = 0;  // not needed - included for clarity
    history = "0 ";
  }
  
 //returns the the value of the variable total
  public int getTotal () {
    return total;
  }
  
//adds a value to the total
  public void add (int value) {
	  total += value;
	  history+=" + "+value;
  }

//subtracts a value to the total
  public void subtract (int value) {
	  total -= value;
	  history+=" - "+value;
  }

//Prints a history of all calculations
  public String toString () {
    return history;
  }

//resets all attributes
  public void clear() {
	  total = 0;
	  history ="0 ";
  }
}