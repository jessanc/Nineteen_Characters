package src.controller;

import java.io.Serializable;
import src.model.Map;
import src.model.MapDrawableThingInterface;
import src.model.MapTile;
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
    
    // map_relationship_ is used in place of a map_referance_
    private static MapDrawableThingInterface map_relationship_;
    
    /**
    * This function is necessary because the constructor cannot safely build the map_relationship.
    * Make sure that this function uses a subclass this.
    */
    private void initializeMapRelationship() {
        map_relationship_ = Map.getMyInterfaceWithTheMap(this);
    }

    // For things that take up only  1 tile or need to appear on a minimap
    private final char single_character_representation_;
    
    DrawableThing(String name, char representation, boolean is_passable) {
        name_ = name;
        single_character_representation_ = representation;
        is_passable_ = is_passable;
        is_viewable_ = true;
    }

    private boolean is_passable_;
    private boolean is_viewable_;

    private StatsPack stats_pack_ = new StatsPack();

    private MapTile my_tile_ = null;

    public MapTile getMyTile()
    {
        return this.my_tile_;
    }

    public void setMyTile(MapTile other)
    {
        this.my_tile_ = other;
    }

    public StatsPack get_stats_pack_()
    {
        return this.stats_pack_;
    }

    DrawableThing(String name, char representation)
    {
        name_ = name;
        single_character_representation_ = representation;
    }
    public void onTurn() {
        
    }

    //representation changes for terrain with/without decal
    char getRepresentation() {
        return this.single_character_representation_;
    }

    void setViewable(boolean is_viewable)
    {
        is_viewable_ = is_viewable;
    }

    void setPassable(boolean is_passable)
    {
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

    public void levelUpWithinRadius(boolean will_level_up_players, boolean will_level_up_npcs, int radius)
    {

    }
}
