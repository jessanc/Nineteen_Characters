/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.model;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.io.Serializable;
import src.controller.Entity;
import src.controller.Item;
import src.controller.Avatar;
import src.controller.StatsPack;
import src.controller.Terrain;

/**
 * The map contains the map.
 * @author John-Michael Reed
 */
final class Map implements Serializable{
    
    private Map() {} // Creation of multiple maps is forbidden.

    // MapModel.map_model_ is static because there is only one map_model_  
    private static Map the_map_;

    public static MapTile[][] getMyReferanceToTheMapGrid(MapDisplay_Association m) {
        return Map.the_map_.map_grid_;
    }
    
    public static Map getMyReferanceToTheMap(MapDrawableThing_Association d) {
        return Map.the_map_;
    }

    // Converts the class name into a base 35 number
    private static final long serialVersionUID = Long.parseLong("MapModel", 35);

    //2d array of tiles.
    private MapTile map_grid_[][];

    // currently there is only one avatar
    private static final Avatar avatar_ = new Avatar("avatar", 'x', 0, 0);

    public static Avatar getAvatar(String name) {
        return avatar_;
    }

    // String is the entity's name. The entity name must be unqiue or else bugs will occur.
    private LinkedHashMap<String, MapTile> entity_tiles_list_;

    // Item is the address of an item in memory. Location is its xy coordinates on the grid.
    private LinkedList<Item> items_list_;

    // The map has a clock
    private int time_measured_in_turns;

// Entity Area Effects

    /**
     * Used to modify current health, mana, defense within radius of an entity
     *
     * @param entity
     * @param can_effect_players
     * @param can_effect_npcs
     * @param modifiable_stats_pack
     * @param radius
     * @author John-Michael Reed
     */
    public void entityAreaModifyStatsPacks(boolean can_effect_players, boolean can_effect_npcs, StatsPack stats_pack, int radius) {

    }

    /**
     * Levels up npc's/players within radius of entity
     *
     * @param entity
     * @param will_level_up_players
     * @param will_level_up_npcs
     * @param radius
     * @author John-Michael Reed
     */
    public void entityAreaLevelUp(Entity entity, boolean will_level_up_players, boolean will_level_up_npcs, int radius) {

    }

    // Item Area Effects
    /**
     * Used to modify current health, mana, defense within radius of an item
     *
     * @param item
     * @param can_effect_players
     * @param can_effect_npcs
     * @param modifiable_stats_pack
     * @param radius
     * @author John-Michael Reed
     */
    public void itemAreaModifyStatsPacks(Item item, boolean can_effect_players, boolean can_effect_npcs, StatsPack stats_pack, int radius) {

    }

    /**
     * Levels up npc's/players within radius of an item
     *
     * @param item
     * @param will_level_up_players
     * @param will_level_up_npcs
     * @param radius
     * @author John-Michael Reed
     */
    public void entityAreaLevelUp(Item item, boolean will_level_up_players, boolean will_level_up_npcs, int radius) {

    }

    // Terrain Area Effects
    /**
     * Used to modify current health, mana, defense within radius of a terrain
     * tile.
     *
     * @param terrain
     * @param can_effect_players
     * @param can_effect_npcs
     * @param modifiable_stats_pack
     * @param radius
     * @author John-Michael Reed
     */
    public void terrainAreaModifyStatsPacks(Terrain terrain, boolean can_effect_players, boolean can_effect_npcs, StatsPack stats_pack, int radius) {

    }

    /**
     * Levels up npc's/players within radius of a terrain tile
     *
     * @param terrain
     * @param will_level_up_players
     * @param will_level_up_npcs
     * @param radius
     * @author John-Michael Reed
     */
    public void terrainAreaLevelUp(Terrain terrain, boolean will_level_up_players, boolean will_level_up_npcs, int radius) {

    }
}
