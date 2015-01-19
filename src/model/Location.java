package src.model;
import java.io.Serializable

// This class is package private so that MapModel can use it.
// This class is not an inner class because it implements Serializable
package-private class Location implements Serializable{

    // Converts the class name into a base 35 number
    private static final long serialVersionUID = Long.parseLong("Location", 35);

	public int x_;
	public int y_;
}
