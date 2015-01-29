/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package src.controller;

import src.model.MapTile;

/**
 * Class item represents a stackable entity [Alex's definition of entity] that cannot move itself.
 * @author JohnReedLOL
 */
public class Item extends Entity
{
    // Converts a class name [which must be unique] into a unique base 35 number
    private static final long serialVersionUID = Long.parseLong("Item", 35);

    private final boolean goesInInventory_; //assume that you can wear anything that goes in your inventory
    private final boolean isOneShot_;  
    
    Item(String name, char single_character_representation, boolean is_viewable, 
            boolean is_passable, boolean goesInInventory, boolean isOneShot) {
        super(name, single_character_representation, is_viewable, is_passable);
        this.goesInInventory_ = goesInInventory;
        this.isOneShot_ = isOneShot;
    }
    
    public void onWalkOver() {
        
    }
    
    /**
    * The use function allows an item to exert its effect on an entity.
    * @param target - The entity that the item will be used on.
    */
    public void use(Character target) {
        
    }
    
    /**
    * The use function also allows an item to exert an effect on another item.
    * @param target - The item that this item will be used upon.
    */
    public void use(Item target) {
        
    }
}
