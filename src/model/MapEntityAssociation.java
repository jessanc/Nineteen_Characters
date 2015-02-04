/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.model;

import src.controller.Entity;
import src.controller.Occupation;

/**
 *
 * @author JohnReedLOL
 */
public class MapEntityAssociation implements MapEntityInterface {

    private final MapEntityInterface map_;
    private final Entity entity_;

    public MapEntityAssociation(MapEntityInterface map, Entity entity,
            int x_respawn_point, int y_respawn_point) {
        map_ = map;
        entity_ = entity;
        x_respawn_point_ = x_respawn_point;
        y_respawn_point_ = y_respawn_point;
    }
    private final int x_respawn_point_;
    private final int y_respawn_point_;
    Occupation occupation_ = null;
}
