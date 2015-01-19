/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.controller;

import src.DrawableThing;
import java.io.Serializable;
import src.model.MapModel;
/**
 *
 * @author JohnReedLOL
 */
abstract public class Entity extends DrawableThing implements Serializable
{
    // Converts an entity's name [which must be unique] into a unique base 26 number
    final long serialVersionUID = Long.parseLong(super.name_, 26); \

    Item inventory_[];

    //Item weapon; // Worry about helmets, armor, weapons, later.
    //Item armor;
    Item equipped_item_;
    
    private final int max_level_;

    private StatsPack stats_;

    private void recalculateStats()
    {
    	stats_.equals(stats_.add(equipped_item_.get_stats_modifiers_()));
    }

    public void levelUp()
    {

    }

    abstract public void takeTurn();

    abstract public void moveUp();

    abstract public void moveUpRight();

    abstract public void moveRight();

    abstract public void moveDownRight();

    abstract public void moveDown();

    abstract public void moveDownLeft();

    abstract public void moveLeft();

    abstract public void moveUpLeft();

    abstract public void sendChat();

    abstract public void recieveChat();

    abstract public void sendAttack();

    abstract public void recieveAttack();

    abstract public void useItem();

    abstract public void pickUpItem();

    abstract public void dropItem();

    //area effects
    public void areaAttack(int damage, int diameter)
    {

    }

    public void areaHeal(int heal_quantity, int diameter)
    {

    }

    public void areaKill(boolean will_kill_players, boolean will_kill_npcs, int diameter)
    {

    }

    public void areaLevelUp(boolean will_level_up_players, boolean will_level_up_npcs, int diameter)
    {

    }
}
