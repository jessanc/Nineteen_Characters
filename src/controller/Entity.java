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

    public enum Direction
    {

        UP, UP_RIGHT, RIGHT, DOWN_RIGHT,
        DOWN, DOWN_LEFT, LEFT, UP_LEFT, UNDERNEATH_ME
    }
    private FacingDirection facing_direction_;

    // height and width values must be odd to be symmetrical with respect to center.
    private final int height_ = 1; // default size is 1 tile
    private final int width_ = 1; //default size is 1 tile

    private final int x_respawn_point_;
    private final int y_respawn_point_;

    // For things that take up more than 1 tile on the MapModel
    private char[][] multi_character_representation_; // defaults to single character representation

    Item inventory_[];

    // Only 1 equipped item in iteration 1
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

    public int getMyXCordinate()
    {

    }

    public int getMyYCordinate()
    {

    }

    abstract public void moveInDirection(Direction direction)
    {
        facing_direction_ = direction;
        map_model_reference_.moveOneTile(this, facing_direction_);
    }

    abstract public void sendChat();

    abstract public void recieveChat();

    abstract public void sendAttackInDirection();

    abstract public void recieveAttackFromEntity();

    abstract public void useItemInDirection();

    abstract public void pickUpItemInDirection();

    abstract public void dropItem();

    abstract public void tossItemInDirection();
}
