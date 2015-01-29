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
public class Item extends DrawableThing
{
    // Converts a class name [which must be unique] into a unique base 35 number
    private static final long serialVersionUID = Long.parseLong("Item", 35);

    protected boolean goesInInventory; //assume that you can wear anything that goes in your inventory
    protected boolean isOneShot_;    
    
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
