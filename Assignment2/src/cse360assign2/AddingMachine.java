package cse360assign2;
/**
 * 	Author: Oscar Veloria Jr.
 * 	Assignment 2
 *  AddingMachine class performs basic arithmetic to a "total"
 *  URL to Repo:
 *  https://github.com/6000hoursandamap/cse360assign2
 */
public class AddingMachine {

	/**
	 * The total to perform arithmetic on, subtract or add
	 */
	private int total;
	
	
	/*
	 * String to keep track of history with initial value 0
	 */
	private String history = "0"; 
	
	public AddingMachine () {
		total = 0;  // not needed - included for clarity
	}
	
	/**
	 * Gets the total
	 * @return the current total
	 */
	public int getTotal () {
		return total;
	}
	
	
	/**
	 * Adds a value to the total, and records the addition in history
	 * @param value The value added on total
	 */
	public void add (int value) {
		total = total + value;
		history = history.concat(" + " + value);
	}
	
	
	/**
	 * Subtracts a value from the total, and records the subtraction in history
	 * @param value The value subracted form total
	 */
	public void subtract (int value) {
		total = total - value;
		history = history.concat(" - " + value);
	}
		
	
	/**
	 * Returns the history, with spaces in-between the values
	 * @return history String of all recoded actions
	 */
	public String toString () {
		return history;
	}
	
	/**
	 * User has the option to 'clear' data, resetting total and history
	 */
	public void clear() {
		history = "0";
		total = 0;
	}
}
