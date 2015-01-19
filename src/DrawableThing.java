package src;
import java.io.Serializable;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JohnReedLOL
 */
abstract public class DrawableThing implements Serializable
{
    // Converts the class name into a base 35 number
    private static final long serialVersionUID = Long.parseLong("DrawableThing", 35);

    // names of items and terrain should be non-unique.
    // names of entities should be unique to fit in a hashmap.
    public final String name_;

    protected static final MapModel map_model_reference_ = MapModel.getaReferenceToTheMapModel();
    
    private final char representation_;
    private boolean is_viewable_;
    private boolean is_passable_;
    
    DrawableThing(String name, char representation) {
    	name_ = name;
    	representation_ = representation;
    }
    
    //representation changes for terrain with/without decal
    abstract char getRepresentation();
    void setViewable(boolean is_viewable) {
    	is_viewable_ = is_viewable;
    }
    void setPassable(boolean is_passable) {
    	is_passable_ = is_passable;
    }
}
