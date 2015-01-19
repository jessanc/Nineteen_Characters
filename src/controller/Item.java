/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package src.controller;
import src.DrawableThing;
/**
 *
 * @author JohnReedLOL
 */
public class Item extends DrawableThing
{
    // Converts a class name [which must be unique] into a unique base 35 number
    private static final long serialVersionUID = Long.parseLong("Item", 35);

    private boolean goesInInventory; //assume that you can wear anything that goes in your inventory
    private boolean isOneShot_;    

    private StatsPack stats_modifiers_;
    
    public StatsPack get_stats_modifiers_() {
        return this.stats_modifiers_;
    }
    
    public void activate() {
        
    }
    public void use(Entity entity) {
        
    }
    public void use(Item item) {
        
    }
    
}
