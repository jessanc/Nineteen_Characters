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
public class InteractiveMapItem extends Item
{
    InteractiveMapItem (String name, char single_character_representation, boolean is_viewable, 
            boolean is_passable, boolean goesInInventory, boolean isOneShot) {
        super(name, single_character_representation, true, false, false, false);
        
    }
    /**
     * 
     * @param interactee - The initiator of the interaction.
     */
    public void interact(Character interactee) {
        
    }
}
