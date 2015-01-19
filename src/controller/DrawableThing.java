package src.controller;
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
    
    // For things that take up only  1 tile or need to appear on a minimap
    private final char single_character_representation_;
   
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
    
        //area effects
    public void hurtWithinRadius(int damage, int radius)
    {

    }

    public void healWithinRadius(int heal_quantity, int radius)
    {

    }

    public void killWithinRadius(boolean will_kill_players, boolean will_kill_npcs, int radius)
    {

    }

    public void levelWithinRadius(boolean will_level_up_players, boolean will_level_up_npcs, int radius)
    {

    }
}
