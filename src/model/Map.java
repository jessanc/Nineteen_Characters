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
import src.controller.InteractiveItem;
import src.controller.ModifiableStats;
import src.controller.ConstantStats;
import src.controller.StatsPack;
import src.controller.Terrain;

/**
 * The map contains and modifies tiles.
 *
 * @author John-Michael Reed
 */
public final class Map implements Serializable { 

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
    private static Map the_map_;

    public static Map getaReferenceToTheMap() {
        return Map.the_map_;
    }

    // Create a spawn queue
    // Functions to be called by DrawableThings
    public void spawn(Entity toSpawn, int time_until_spawn) {

    }

    public void moveOneTile(Entity toMove, DirectionEnum moving_direction) {

    }

    public void sendAttack(Entity attacker, DirectionEnum attacking_direction) {

    }

    public void recieveAttack(Entity attack_reciever, int damage) {

    }

    public void moveEntity1TowardsEntity2(Entity entity_1, Entity entity_2) {

    }

    public void pushEntityInDirection(Entity entity, DirectionEnum push_direction) {

    }

    public void levelUpEntity(Entity entity, ModifiableStats modifiable_stats_pack) {

    }

    /**
     * Leveling down can be used for removing or re-assigning attribute points
     *
     * @param entity
     * @param modifiable_stats_pack
     */
    public void levelDownEntity(Entity entity, CosntantStats constant_stats_pack) {

    }

    public void addStatsPackToEntity(Entity entity, ModifiableStats modifiable_stats_pack) {

    }

    public void subtractStatsPackFromEntity(Entity entity, ModifiableStats modifiable_stats_pack) {

    }

    public void interactEntityWithItem(Entity entity, InteractiveItem interactive_item) {

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
    public void entityAreaModifyStatsPacks(boolean can_effect_players, boolean can_effect_npcs, ModifiableStats modifiable_stats_pack, int radius) {

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
    public void itemAreaModifyStatsPacks(Item item, boolean can_effect_players, boolean can_effect_npcs, ModifiableStats modifiable_stats_pack, int radius) {

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
    public void terrainAreaModifyStatsPacks(Terrain terrain, boolean can_effect_players, boolean can_effect_npcs, ModifiableStats modifiable_stats_pack, int radius) {

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
