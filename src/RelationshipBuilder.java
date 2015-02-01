/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

import src.controller.Entity;
import src.controller.Item;

/**
 * A relationship builder makes relationships between two objects.
 * @author JohnReedLOL
 */
public enum RelationshipBuilder
{

    public static Relationship makeRelationship(MapModel map, Entity entity)
    {
        Relationship agreement = new MapEntityRelationship(map, entity);
        return agreement;
    }

public static Relationship makeRelationship(MapModel map, Item item) {
        Relationship agreement = new MapItemRelationship(map, item);
        return agreement;
    }
    public static Relationship makeRelationship(MapModel map, Terrain terrain) {
        Relationship agreement =  new MapTerrainRelationship(map, terrain);
        return agreement;
    }

    /**
* This function is fucked up - make sure that DrawableThing never calls it in its initialize method.
*/
    public static Relationship makeRelationship(MapModel map, DrawableThing drawable_thing) {
System.out.prinln("Bad!!!! DrawableThing is calling the wrong makeRelationship.");
if(drawable_thing instanceof Entity) {
        return makeRelationship(map, (Entity) drawable_thing)
}
else if(drawable_thing instanceof Item) {
        return makeRelationship(map, (Item) drawable_thing)
}
else if(drawable_thing instanceof Terrain) {
        return makeRelationship(map, (Terrain) drawable_thing)
}
    }
}
