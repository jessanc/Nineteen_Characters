/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.model;

import src.Relationship;
import src.controller.Avatar;
import src.controller.MapEntityRelationship;
import src.controller.MapItemRelationship;
import src.controller.MapTerrainRelationship;
import src.model.Map;
import src.model.MapRelationship;
import src.controller.Entity;
import src.controller.Item;
import src.controller.Terrain;
import src.controller.MapAvatarRelationship;
/**
 * A relationship builder makes relationships between two objects.
 *
 * @author JohnReedLOL
 */
public class MapRelationshipBuilder {

    public static MapEntityRelationship makeRelationship(Entity entity) {
        MapEntityRelationship relationship = new MapEntityRelationship(entity);
        return relationship;
    }

    public static MapItemRelationship makeRelationship(Item item) {
        MapItemRelationship relationship = new MapItemRelationship(item);
        return relationship;
    }

    public static MapTerrainRelationship makeRelationship(Terrain terrain) {
        MapTerrainRelationship relationship = new MapTerrainRelationship(terrain);
        return relationship;
    }

    public static MapAvatarRelationship makeRelationship(Avatar avatar) {
        MapTerrainRelationship relationship = new MapAvatarRelationship(avatar);
        return relationship;
    }

}
