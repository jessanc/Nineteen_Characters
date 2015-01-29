package src.view;
import java.io.Serializable;

abstract class View implements Serializable {

    // Converts the class name into a base 35 number
    private static final long serialVersionUID = Long.parseLong("View", 35);
	
	private char[][] view_contents_;
	
	/**
	 * returns the contents of a view as a 2D array
	 * @return the 2D array of characters that represents the view
	 */
	public char[][] getContents() {
		
	}
}
