/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

import src.controller.Entity;

/**
 * Tells an entity what it can do with the map.
 * @author JohnReedLOL
 */
public class MapEntityRelationship extends Relationship
{
    private MapModel map_;
    private Entity entity_;
    MapEntityRelationship(MapModel map_model, Entity entity) {
        
    }
}
