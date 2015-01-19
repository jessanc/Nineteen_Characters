package src.model;
import src.controller.Entity;
import java.io.Serializable

// This class is package private so that MapModel can use it.
// This class is not an inner class because it implements Serializable
package-private class EntityHandle implements Serializable{
	Entity entity_;
	public int x_;
	public int y_;
}
