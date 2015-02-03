/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.model;

import src.model.MapRelationship;
import src.controller.Entity;

/**
 * Tells an entity what it can do with the map.
 *
 * @author JohnReedLOL
 */
public interface MapEntityInterface extends MapDrawableThingInterface {

    abstract public void moveInDirection(Entity toMove, int DeltaX, int DeltaY);

    abstract public void sendChat();

    abstract public void recieveChat();

    abstract public void sendAttackInDirection();

    abstract public void recieveAttackFromEntity();

    abstract public void useItemInDirection();

    abstract public void pickUpItemInDirection();

    abstract public void dropItem();

    abstract public void tossItemInDirection();
}
