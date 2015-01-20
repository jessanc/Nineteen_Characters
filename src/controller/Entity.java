/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.controller;

import src.model.MapModel;

/**
 *
 * @author JohnReedLOL
 */
abstract public class Entity extends DrawableThing
{

    // Converts an entity's name [which must be unique] into a unique base 35 number
    private static final long serialVersionUID = Long.parseLong("Entity", 35);

    public enum FacingDirection
    {

        UP, UP_RIGHT, RIGHT, DOWN_RIGHT,
        DOWN, DOWN_LEFT, LEFT, UP_LEFT
    }
    private FacingDirection facing_direction_;

    // height and width values must be odd to be symmetrical with respect to center.
    private final int height_;
    private final int width_;

    // For things that take up more than 1 tile on the MapModel
    private char[][] multi_character_representation_;

    Item inventory_[];

    //Item weapon; // Worry about helmets, armor, weapons, later.
    //Item armor;
    Item equipped_item_;

    private final int max_level_;
    private int moves_left_;

    private StatsPack my_stats_after_powerups_;

    private void recalculateStats()
    {
        stats_.equals(stats_.add(equipped_item_.get_stats_pack_()));
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
}
