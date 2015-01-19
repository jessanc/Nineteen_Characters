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
public class AreaEffectGenerator extends Item
{
    // Converts the class name into a unique base 35 number
    private static final long serialVersionUID = Long.parseLong("AreaEffectGenerator", 35);

    public void activate() {
        
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
