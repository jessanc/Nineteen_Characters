package src.model;
import src.controller.Entity;
import java.io.Serializable

// This class is package private so that MapModel can use it.
// This class is not an inner class because it implements Serializable
final class EntityHandle implements Serializable{

    // Converts the class name into a base 35 number
    private static final long serialVersionUID = Long.parseLong("EntityHandle", 35);

	Entity entity_;
	public int x_;
	public int y_;
}
