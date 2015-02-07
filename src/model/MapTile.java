/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.model;

import java.util.LinkedList;
import java.io.Serializable;
import java.util.ListIterator;
import src.controller.Entity;
import src.controller.Item;
import src.controller.Terrain;

/**
 *
 * @author JohnReedLOL
 */
final class MapTile implements Serializable {

    // Converts the class name into a base 35 number
    private static final long serialVersionUID = Long.parseLong("MapTile", 35);

    public final int x_;
    public final int y_;

    MapTile(int x, int y) {
        x_ = x;
        y_ = y;
        terrain_ = null;
        entity_ = null;
        items_ = new LinkedList<Item>();
    }

    private Terrain terrain_;
    private Entity entity_;
    private LinkedList<Item> items_;

    /**
     * Returns 0 on success, returns -1 if terrain is already set.
     * @param terrain - terrain to be added to the tile
     */
    public int initializeTerrain(Terrain terrain) {
        if (this.terrain_ == null) {
            this.terrain_ = terrain;
            return 0;
        } else {
            return -1;
        }
    }

    /**
     * Returns 0 on success, returns -1 if an entity is already there.
     * @param entity - entity to be added to the tile
     */
    public int setEntity(Entity entity) {
        if (this.entity_ == null) {
            this.entity_ = entity;
            return 0;
        } else {
            return -1;
        }
    }

    /**
     * Returns 0 on success, returns -1 if a blocking item is already there.
     * @param item - item to be added to the tile
     */
    public int addItem(Item item) {
        if (this.items_.isEmpty()) {
            this.items_.add(item);
            return 0;
        } else {
            ListIterator<Item> listIterator = items_.listIterator();
            while (listIterator.hasNext()) {
                if (! listIterator.next().isPassable()) {
                    return -1;
                }
            }
            return 0;
        }
    }

    public Terrain getTerrain() {
        return this.terrain_;
    }

    public Entity getEntity() {
        return this.entity_;
    }

    public Item viewTopItem() {
        return this.items_.peekLast();
    }

    public Item removeTopItem() {
        return this.items_.removeLast();
    }

    /**
     * Checks the tile to find its character representation
     *
     * @return the character that will represent this tile on the map
     */
    public char getTopCharacter() {
        return 0;
    }
}
