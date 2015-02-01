/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

import src.controller.Entity;
import src.controller.Terrain;

/**
 * Tells the terrain what it can do with the map.
 * @author JohnReedLOL
 */
public class MapTerrainRelationship extends Relationship
{

    private MapModel map_;
    private Terrain terrain_;

    public Relationship(MapModel map_model, Terrain terrain)
    {
    }
}
