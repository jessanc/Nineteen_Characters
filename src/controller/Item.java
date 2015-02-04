/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package src.controller;

import src.model.Map;
import src.model.MapItemAssociation;
import src.model.MapItemInterface;
import src.model.MapTile;

/**
 * Class item represents a stackable entity [Alex's definition of entity] that cannot move itself.
 * @author JohnReedLOL
 */
public class Item extends DrawableThing
{
    // Converts a class name [which must be unique] into a unique base 35 number
    private static final long serialVersionUID = Long.parseLong("Item", 35);
    
    // map_relationship_ is used in place of a map_referance_
    private MapItemAssociation map_relationship_;
    
    public Item(String name, char representation, boolean is_passable, 
            boolean goes_in_inventory, boolean is_one_shot) {
        super(name, representation);
        initializeMapRelationship(is_passable, goes_in_inventory, is_one_shot);
    }

    /**
     * This function is necessary because the constructor cannot safely build
     * the map_relationship. Make sure that this function uses a subclass this.
     */
    private void initializeMapRelationship(boolean is_passable, boolean goes_in_inventory, 
            boolean is_one_shot) {
        map_relationship_ = new MapItemAssociation(Map.getMyInterfaceWithTheMap(this), 
                this, is_passable, goes_in_inventory, is_one_shot);
    }

    protected boolean goes_in_inventory_; //assume that you can wear anything that goes in your inventory
    protected boolean is_one_shot_;    
    
    public void onWalkOver() {
        
    }
    
    /**
    * The use function allows an item to exert its effect on an entity.
    * @param target - The entity that the item will be used on.
    */
    public void use(Entity target) {
        
    }
    
    /**
    * The use function also allows an item to exert an effect on another item.
    * @param target - The item that this item will be used upon.
    */
    public void use(Item target) {
        
    }
}
