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
    final public String name_;
    
    private char representation_;
    private boolean is_viewable_;
    private boolean is_passable_;
    
    abstract char getRepresentation();
    abstract char setViewable();
    abstract char setPassable();
}
