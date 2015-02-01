/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package src;

import src.controller.Item;

/**
 * Tells an item what it can do with the map.
 * @author JohnReedLOL
 */
public class MapItemRelationship extends Relationship
{
    private MapModel map_;
    private Item item_;
    MapItemRelationship(MapModel map_model, Item item) {
    }
}
