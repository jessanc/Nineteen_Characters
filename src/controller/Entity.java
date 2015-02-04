/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.controller;

import src.model.Map;
import src.model.MapEntityInterface;
import src.controller.Occupation;
/**
 *
 * @author JohnReedLOL
 */
abstract public class Entity extends DrawableThing {

    // Converts an entity's name [which must be unique] into a unique base 35 number
    private static final long serialVersionUID = Long.parseLong("Entity", 35);

    // map_relationship_ is used in place of a map_referance_
    private static MapEntityInterface map_relationship_;

    /**
     * This function is necessary because the constructor cannot safely build
     * the map_relationship. Make sure that this function uses a subclass this.
     */
    private void initializeMapRelationship() {
        map_relationship_ = Map.getMyInterfaceWithTheMap(this);
    }

    // height and width values must be odd to be symmetrical with respect to center.
    private final int height_ = 1; // default size is 1 tile
    private final int width_ = 1; //default size is 1 tile

    private final int x_respawn_point_;
    private final int y_respawn_point_;
    
    public Entity(String name, char representation, boolean is_passable, 
            int x, int y) {
        super(name, representation, is_passable);
        x_respawn_point_ = x;
        y_respawn_point_ = y;
    }

    // For things that take up more than 1 tile on the MapModel
    private char[][] multi_character_representation_; // defaults to single character representation

    Item inventory_[];
    
    Occupation occupation_ = null;

    // Only 1 equipped item in iteration 1
    Item equipped_item_;

    //private final int max_level_;

    private StatsPack my_stats_after_powerups_;

    private void recalculateStats() {
        //my_stats_after_powerups_.equals(my_stats_after_powerups_.add(equipped_item_.get_stats_pack_()));
    }

    public void levelUp() {

    }

    public int getMyXCordinate() {
        return super.getMyTile().x_;
    }

    public int getMyYCordinate() {
        return super.getMyTile().y_;
    }
    public void moveBy(int x, int y) {
        //map_relationship_.moveInDirection(this, x, y);
    }
}
