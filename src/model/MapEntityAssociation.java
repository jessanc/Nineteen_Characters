/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.model;

import src.controller.Entity;

/**
 *
 * @author JohnReedLOL
 */
public class MapEntityAssociation implements MapEntityInterface {
    private MapEntityInterface map_;
    private Entity entity_;
    public MapEntityAssociation(MapEntityInterface map, Entity entity) {
        map_ = map;
        entity_ = entity;
    }
}
