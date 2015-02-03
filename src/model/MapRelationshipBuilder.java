/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.model;

import src.Relationship;
import src.model.Map;
import src.model.MapRelationship;
import src.controller.Entity;
import src.controller.Item;
import src.controller.Terrain;

/**
 * A relationship builder makes relationships between two objects.
 * @author JohnReedLOL
 */
public class MapRelationshipBuilder
{

    public static MapRelationship makeRelationship(Entity entity)
    {
        MapRelationship relationship = new MapEntityInterface(entity);
        return relationship;
    }

public static MapRelationship makeRelationship(Item item) {
        MapRelationship relationship = new MapItemInterface(item);
        return relationship;
    }
    public static MapRelationship makeRelationship(Terrain terrain) {
        MapRelationship relationship =  new MapTerrainInterface(terrain);
        return relationship;
    }

    /**
* This function is fucked up - make sure that DrawableThing never calls it in its initialize method.
*/
    public static MapRelationship makeRelationship(Map map, DrawableThing drawable_thing) {
System.out.println("Bad!!!! DrawableThing is calling the wrong makeRelationship.");
if(drawable_thing instanceof Entity) {
        return makeRelationship( ((Entity) drawable_thing);
}
else if(drawable_thing instanceof Item) {
        return makeRelationship( (Item) drawable_thing);
}
else if(drawable_thing instanceof Terrain) {
        return makeRelationship( (Terrain) drawable_thing);
}
    }
}
