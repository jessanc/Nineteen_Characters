/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package src.model;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.io.Serializable;
import src.view.Display;
import src.controller.Entity;
import src.controller.Item;
import src.controller.AreaEffectGenerator;
/**
 *
 * @author JohnReedLOL
 */
public final class MapModel implements Serializable
{
    // Converts the class name into a base 35 number
    private static final long serialVersionUID = Long.parseLong("MapModel", 35);

    private final Display display_reference_ = Display.getaReferenceToTheDisplay();
    
    //2d array of tiles.
    private MapTile map_grid_[][];
    
    // String is the entity's name. The entity name must be unqiue or else bugs will occur.
    private LinkedHashMap<String, MapTile> entity_tiles_list_;

    // Item is the address of an item in memory. Location is its xy coordinates on the grid.
    private LinkedList<Item> items_list_;
    
    private LinkedList<AreaEffectGenerator> area_effect_generators_list_;

    // The map has a clock
    private int time_measured_in_turns;
    
    // MapModel.map_model_ is static because there is only one map_model_  
    private static MapModel map_model_;
    
    public static MapModel getaReferenceToTheMapModel() {
        return MapModel.map_model_;
    }

    // Create a spawn queue

    // Functions to be called by DrawableThings
public void spawn(Entity toSpawn, int time_until_spawn) {

}
public void moveOneTile(Entity toMove, Entity.Direction moving_direction) {

}
public void sendAttack(Entity attacker, Entity.Direction attacking_direction) {

}
public void recieveAttack(Entity attack_reciever, int damage) {

}
public void moveEntity1TowardsEntity2(Entity entity_1, Entity entity_2) {

}
public void pushEntityInDirection(Entity entity, Entity.Direction push_direction) {

}

}
