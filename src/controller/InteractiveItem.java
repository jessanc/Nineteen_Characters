/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package src.controller;

/**
 *
 * @author JohnReedLOL
 */
public class InteractiveItem extends Item
{
    InteractiveItem() {
        this.setPassable(false);
        super.isOneShot_ = false;
        super.goesInInventory = false;
    }
    /**
     * 
     * @param interactee - The initiator of the interaction.
     */
    public void interact(Entity interactee) {
        
    }
}
