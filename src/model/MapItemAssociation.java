/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.model;

import src.controller.Item;

/**
 *
 * @author JohnReedLOL
 */
public class MapItemAssociation implements MapItemInterface {
    private final MapItemInterface map_;
    private final Item item_;
    public MapItemAssociation(MapItemInterface map, Item item, boolean is_passable,
            boolean goes_in_inventory, boolean is_one_shot) {
        map_ = map;
        item_ = item;
        is_passable_ = is_passable;
        goes_in_inventory_ = goes_in_inventory;
        is_one_shot_ = is_one_shot;
    }
    private boolean is_passable_;
    private final boolean goes_in_inventory_;
    private final boolean is_one_shot_;
}
