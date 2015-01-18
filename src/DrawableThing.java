package src;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JohnReedLOL
 */
abstract public class DrawableThing
{
    // names of items nad terrain should be non-unique.
    // names of entities should be unique to fit in a hashmap.
    public final String name_;
    
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
