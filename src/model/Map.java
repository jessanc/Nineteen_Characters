/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.model;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.io.Serializable;
import src.DirectionEnum;
import src.view.Display;
import src.controller.Entity;
import src.controller.Item;
import src.controller.AreaEffectGenerator;
import src.controller.Avatar;
<<<<<<< HEAD
import src.controller.DrawableThing;
=======
import src.controller.InteractiveItem;
>>>>>>> ad093437758541ab2bc62b622ae1d4828731d6b2
import src.controller.StatsPack;
import src.controller.Terrain;

/**
 * The map contains and modifies tiles.
 *
 * @author John-Michael Reed
 */
public final class Map implements Serializable, MapDrawableThingInterface,
        MapEntityInterface, MapItemInterface, MapDisplayInterface,
        MapAvatarInterface, MapTerrainInterface {
    
    private Map() {} // Creation of multiple maps is forbidden.

    // MapModel.map_model_ is static because there is only one map_model_  
    private static Map the_map_;

    public static MapEntityInterface getMyInterfaceWithTheMap(Entity e) {
        return (MapEntityInterface) Map.the_map_;
    }

    public static MapItemInterface getMyInterfaceWithTheMap(Item i) {
        return (MapItemInterface) Map.the_map_;
    }

    public static MapDisplayInterface getMyInterfaceWithTheMap(Display d) {
        return (MapDisplayInterface) Map.the_map_;
    }

    public static MapAvatarInterface getMyInterfaceWithTheMap(Avatar a) {
        return (MapAvatarInterface) Map.the_map_;
    }

    public static MapTerrainInterface getMyInterfaceWithTheMap(Terrain t) {
        return (MapTerrainInterface) Map.the_map_;
    }
    
    public static MapTerrainInterface getMyInterfaceWithTheMap(DrawableThing d) {
        return (MapTerrainInterface) Map.the_map_;
    }

    // Converts the class name into a base 35 number
    private static final long serialVersionUID = Long.parseLong("MapModel", 35);

    private final Display display_reference_ = avatar_.get_my_display();

    //2d array of tiles.
    private MapTile map_grid_[][];
    
    // currently there is only one avatar
    private static final Avatar avatar_ = new Avatar();
    
    public Avatar getAvatar(String name) {
        return avatar_;
    }

    // currently there is only one avatar
    private static final Avatar avatar_ = new Avatar("avatar", 'x', false, 0, 0);

    public static Avatar getAvatar(String name) {
        return avatar_;
    }

    // String is the entity's name. The entity name must be unqiue or else bugs will occur.
    private LinkedHashMap<String, MapTile> entity_tiles_list_;

    // Item is the address of an item in memory. Location is its xy coordinates on the grid.
    private LinkedList<Item> items_list_;

    private LinkedList<AreaEffectGenerator> area_effect_generators_list_;

    // The map has a clock
    private int time_measured_in_turns;

    // Create a spawn queue
    // Functions to be called by DrawableThings
    public void spawn(Entity toSpawn, int time_until_spawn) {

    }

    public void moveInDirection(Entity toMove, int DeltaX, int DeltaY) {

    }

    public void sendAttack(Entity attacker, DirectionEnum attacking_direction) {

    }

    public void recieveAttack(Entity attack_reciever, int damage) {

    }

    public void moveEntity1TowardsEntity2(Entity entity_1, Entity entity_2) {

    }

    public void pushEntityInDirection(Entity entity, DirectionEnum push_direction) {

    }

    public void levelUpEntity(Entity entity, StatsPack stats_pack) {

    }

    /**
     * Leveling down can be used for removing or re-assigning attribute points
     *
     * @param entity
     * @param modifiable_stats_pack
     */
    public void levelDownEntity(Entity entity, StatsPack stats_pack) {
<<<<<<< HEAD

    }

    public void addStatsPackToEntity(Entity entity, StatsPack stats_pack) {
=======

    }

    public void addStatsPackToEntity(Entity entity, StatsPack stats_pack) {

    }

    public void subtractStatsPackFromEntity(Entity entity, StatsPack stats_pack) {
>>>>>>> ad093437758541ab2bc62b622ae1d4828731d6b2

    }

    public void subtractStatsPackFromEntity(Entity entity, StatsPack stats_pack) {

    }
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
